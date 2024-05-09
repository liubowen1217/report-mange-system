package com.report.mange.system.service.impl;

import com.report.mange.system.dto.*;
import com.report.mange.system.model.*;
import com.report.mange.system.mybatis.*;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.SnowflakeManager;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleService接口实现类
 * @date 2024/04/17 19:27
 */
@Service
public class ReportCostBreakdownRuleServiceImpl implements ReportCostBreakdownRuleService {

    @Resource
    private ReportCostBreakdownRuleMapper reportCostBreakdownRuleMapper;

    @Resource
    private ReportCostBreakdownRuleDetailMapper reportCostBreakdownRuleDetailMapper;

    @Resource
    private ReportCostBreakdownRuleDetailRecordMapper reportCostBreakdownRuleDetailRecordMapper;

    @Resource
    private ReportCostBreakdownRuleRecordMapper reportCostBreakdownRuleRecordMapper;

    @Resource
    private SnowflakeManager snowflakeManager;

    @Resource
    private ReportCostBreakdownRuleUserRelMapper reportCostBreakdownRuleUserRelMapper;


    /**
     * 查询默认费用规则信息
     *
     * @return
     */
    @Override
    public List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule() {
        return reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRule();
    }

    /**
     * 查询费用规则信息
     *
     * @return
     */
    @Override
    public List<ReportCostBreakdownRuleDTO> queryReportCostBreakdownRule(ReportCostBreakdownRule rule) {

        Long comId = rule.getConId();
        if (comId == null) {
            throw new RuntimeException("合同ID不能为空");
        }

        List<ReportCostBreakdownRuleDTO> resultList = new ArrayList<>();
        //查询当前合同是否已有费用规则
        ReportCostBreakdownRule rule1 = new ReportCostBreakdownRule();
        rule1.setConId(comId);
        List<ReportCostBreakdownRule> breakdownRule = reportCostBreakdownRuleMapper.queryReportCostBreakdownRule(rule1);
        //如果当前合同没有费用规则明细则返回默认值
        if (breakdownRule.size() == 0) {
            return reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRule();
        }

        //如果有费用明细则查询所有的费用明细规则信息
        for (ReportCostBreakdownRule costBreakdownRule : breakdownRule) {
            ReportCostBreakdownRuleDTO breakdownRuleDTO = new ReportCostBreakdownRuleDTO();
            breakdownRuleDTO.setFeeRuleId(costBreakdownRule.getFeeRuleId());
            breakdownRuleDTO.setConId(costBreakdownRule.getConId());
            breakdownRuleDTO.setFeeRuleCode(costBreakdownRule.getFeeRuleCode());
            breakdownRuleDTO.setBudgetProportion(costBreakdownRule.getBudgetProportion());
            breakdownRuleDTO.setStandardProportion(costBreakdownRule.getStandardProportion());
            breakdownRuleDTO.setSystemSubject(costBreakdownRule.getSystemSubject());
            breakdownRuleDTO.setAmount(costBreakdownRule.getAmount());

            List<ReportCostBreakdownRuleDetailDTO> detailList = new ArrayList<>();
            //查询当前费用规则的费用规则明细信息
            ReportCostBreakdownRuleDetail ruleDetail = new ReportCostBreakdownRuleDetail();
            ruleDetail.setFeeRuleId(costBreakdownRule.getFeeRuleId());
            List<ReportCostBreakdownRuleDetail> breakdownRuleDetails = reportCostBreakdownRuleDetailMapper.queryReportCostBreakdownRuleDetail(ruleDetail);
            for (ReportCostBreakdownRuleDetail breakdownRuleDetail : breakdownRuleDetails) {
                ReportCostBreakdownRuleDetailDTO detailDTO = new ReportCostBreakdownRuleDetailDTO();
                BeanUtils.copyProperties(breakdownRuleDetail, detailDTO);
                //查询每个明细对应的人员和单位信息
                List<String> userName = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUser(breakdownRuleDetail.getFeeRuleDetailId());
                String userNameCount = String.join(" ", userName);
                detailDTO.setUserName(userNameCount);
                detailList.add(detailDTO);
            }
            resultList.add(breakdownRuleDTO);

        }
        return resultList;
    }


    /**
     * 新增费用规则信息
     *
     * @return
     */
    @Override
    public Integer saveReportCostBreakdownRuleAdd(ReportCostBreakdownRuleSaveDTO reportCostBreakdownRule) {
        Long comId = reportCostBreakdownRule.getConId();

        List<ReportCostBreakdownRuleVO> reportCostBreakdownRuleList = reportCostBreakdownRule.getReportCostBreakdownRule();
        if (comId == null) {
            throw new RuntimeException("合同ID不能为空");
        }

        if (reportCostBreakdownRuleList == null || reportCostBreakdownRuleList.size() == 0) {
            return 0;
        }

        //查询当前合同是否已有费用规则
        ReportCostBreakdownRule rule = new ReportCostBreakdownRule();
        rule.setConId(comId);
        List<ReportCostBreakdownRule> breakdownRule = reportCostBreakdownRuleMapper.queryReportCostBreakdownRule(rule);
        //如果已经有了明细规则 则将明细规则放到记录里面并记录版本号
        if (breakdownRule.size() > 0) {
            //插入到记录表中
            for (ReportCostBreakdownRule costBreakdownRule : breakdownRule) {
                ReportCostBreakdownRuleRecord ruleRecord = new ReportCostBreakdownRuleRecord();
                BeanUtils.copyProperties(costBreakdownRule, ruleRecord);
                reportCostBreakdownRuleRecordMapper.insert(ruleRecord);
            }

            //删除费用规则
            reportCostBreakdownRuleMapper.saveReportCostBreakdownRuleDel(comId);

            //查询当前费用规则明细
            ReportCostBreakdownRuleDetail ruleDetail = new ReportCostBreakdownRuleDetail();
            ruleDetail.setConId(comId);
            List<ReportCostBreakdownRuleDetail> breakdownRuleDetails = reportCostBreakdownRuleDetailMapper.queryReportCostBreakdownRuleDetail(ruleDetail);
            for (ReportCostBreakdownRuleDetail breakdownRuleDetail : breakdownRuleDetails) {
                ReportCostBreakdownRuleDetailRecord detailRecord = new ReportCostBreakdownRuleDetailRecord();
                BeanUtils.copyProperties(breakdownRuleDetail, detailRecord);
                reportCostBreakdownRuleDetailRecordMapper.insert(detailRecord);
            }

            //删除当前合同费用规则明细
            reportCostBreakdownRuleDetailMapper.saveReportCostBreakdownRuleDetailDel(comId);
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String formattedDateTime = now.format(formatter);

        for (ReportCostBreakdownRuleVO reportCostBreakdownRuleVO : reportCostBreakdownRuleList) {
            Long reeRuleId = snowflakeManager.nextValue();
            ReportCostBreakdownRule rule1 = new ReportCostBreakdownRule();
            rule1.setConId(comId);
            rule1.setFeeRuleId(reeRuleId);
            rule1.setFeeRuleCode(formattedDateTime);
            rule1.setSystemSubject(reportCostBreakdownRuleVO.getSystemSubject());
            rule1.setStandardProportion(reportCostBreakdownRuleVO.getStandardProportion());
            rule1.setBudgetProportion(reportCostBreakdownRuleVO.getBudgetProportion());
            rule1.setAmount(reportCostBreakdownRuleVO.getAmount());


            //处理规则明细
            List<ReportCostBreakdownRuleDetailVO> breakdownRuleDetails = reportCostBreakdownRuleVO.getDetailList();
            for (ReportCostBreakdownRuleDetailVO breakdownRuleDetail : breakdownRuleDetails) {
                Long reeRuleDetailId = snowflakeManager.nextValue();
                ReportCostBreakdownRuleDetail reportCostBreakdownRuleDetail = new ReportCostBreakdownRuleDetail();
                reportCostBreakdownRuleDetail.setFeeRuleDetailId(reeRuleDetailId);
                reportCostBreakdownRuleDetail.setFeeRuleId(reeRuleId);
                reportCostBreakdownRuleDetail.setConId(comId);
                reportCostBreakdownRuleDetail.setSubSystemSubject(breakdownRuleDetail.getSubSystemSubject());
                reportCostBreakdownRuleDetail.setSubStandardProportion(breakdownRuleDetail.getSubStandardProportion());
                reportCostBreakdownRuleDetail.setSubBudgetProportion(breakdownRuleDetail.getSubBudgetProportion());
                reportCostBreakdownRuleDetail.setSubAmount(breakdownRuleDetail.getSubAmount());
                reportCostBreakdownRuleDetail.setSubRemark(breakdownRuleDetail.getSubRemark());

                List<String> userList = breakdownRuleDetail.getUserList();
                for (String userId : userList) {
                    ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel = new ReportCostBreakdownRuleUserRel();
                    reportCostBreakdownRuleUserRel.setFeeRuleDetailId(reeRuleDetailId);
                    reportCostBreakdownRuleUserRel.setUserId(Long.parseLong(userId));
                    reportCostBreakdownRuleUserRelMapper.saveReportCostBreakdownRuleUserRelAdd(reportCostBreakdownRuleUserRel);
                }
                reportCostBreakdownRuleDetail.setId(snowflakeManager.nextValue());
                reportCostBreakdownRuleDetailMapper.insert(reportCostBreakdownRuleDetail);
            }
            rule1.setId(snowflakeManager.nextValue());
            reportCostBreakdownRuleMapper.insert(rule1);
        }
        return 1;
    }
}