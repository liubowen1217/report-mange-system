package com.report.mange.system.service.impl;

import com.report.mange.system.dto.*;
import com.report.mange.system.model.*;
import com.report.mange.system.mybatis.*;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.SnowflakeManager;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import com.report.mange.system.vo.BreakdownRuleVO;
import com.report.mange.system.vo.ReportCostBreakdownRuleVO;
import com.report.mange.system.vo.ReportDeptVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Resource
    private ReportCostBreakdownRuleDeptRelMapper reportCostBreakdownRuleDeptRelMapper;


    /**
     * 查询费用规则下拉
     *
     * @return
     */
    @Override
    public List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule() {
        ReportCostBreakdownRule rule = new ReportCostBreakdownRule();
        return reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRule(rule);
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
            ReportCostBreakdownRule rule2 = new ReportCostBreakdownRule();
            rule2.setConId(1L);
            return reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRule(rule2);
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
            breakdownRuleDTO.setRemark(costBreakdownRule.getRemark());

            Set<String> pUserNameSet = new HashSet<>();
            Set<String> pDeptNameSet = new HashSet<>();

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
                List<String> deptName = reportCostBreakdownRuleDeptRelMapper.queryReportCostBreakdownRuleDept(breakdownRuleDetail.getFeeRuleDetailId());
                String deptNameCount = String.join(" ", deptName);
                detailDTO.setDeptName(deptNameCount);
                detailList.add(detailDTO);
                detailDTO.setDeptList(new ArrayList<>());
                detailDTO.setUserList(new ArrayList<>());

                Set<String> userSet = new HashSet<>(userName);
                Set<String> deptSet = new HashSet<>(deptName);
                pUserNameSet.addAll(userSet);
                pDeptNameSet.addAll(deptSet);
            }
            String pUserName = pUserNameSet.stream().collect(Collectors.joining(" "));
            String pDeptName = pDeptNameSet.stream().collect(Collectors.joining(" "));
            breakdownRuleDTO.setpDeptName(pDeptName);
            breakdownRuleDTO.setpUserName(pUserName);
            breakdownRuleDTO.setDetailList(detailList);
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
    @Transactional
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
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String formattedDateTime = now.format(formatter);
        if (breakdownRule.size() > 0) {
            //插入到记录表中
            for (ReportCostBreakdownRule costBreakdownRule : breakdownRule) {
                ReportCostBreakdownRuleRecord ruleRecord = new ReportCostBreakdownRuleRecord();
                BeanUtils.copyProperties(costBreakdownRule, ruleRecord);
                ruleRecord.setRecordCode(formattedDateTime);
                reportCostBreakdownRuleRecordMapper.saveReportCostBreakdownRuleRecordAdd(ruleRecord);
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
                detailRecord.setRecordCode(formattedDateTime);
                reportCostBreakdownRuleDetailRecordMapper.saveReportCostBreakdownRuleDetailRecordAdd(detailRecord);
            }

            //删除当前合同费用规则明细
            reportCostBreakdownRuleDetailMapper.saveReportCostBreakdownRuleDetailDel(comId);
        }


        for (ReportCostBreakdownRuleVO reportCostBreakdownRuleVO : reportCostBreakdownRuleList) {
            Long reeRuleId = snowflakeManager.nextValue();
            ReportCostBreakdownRule rule1 = new ReportCostBreakdownRule();
            rule1.setConId(comId);
            rule1.setFeeRuleId(reeRuleId);
            rule1.setFeeRuleCode(reportCostBreakdownRuleVO.getFeeRuleCode());
            rule1.setSystemSubject(reportCostBreakdownRuleVO.getSystemSubject());
            rule1.setStandardProportion(reportCostBreakdownRuleVO.getStandardProportion());
            rule1.setBudgetProportion(reportCostBreakdownRuleVO.getBudgetProportion());
            rule1.setAmount(reportCostBreakdownRuleVO.getAmount());
            rule1.setRemark(reportCostBreakdownRuleVO.getRemark());


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
                reportCostBreakdownRuleDetail.setSubFeeRuleCode(breakdownRuleDetail.getSubFeeRuleCode());

                List<String> userList = breakdownRuleDetail.getUserList();
                if (userList != null) {
                    for (String userId : userList) {
                        ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel = new ReportCostBreakdownRuleUserRel();
                        reportCostBreakdownRuleUserRel.setFeeRuleDetailId(reeRuleDetailId);
                        reportCostBreakdownRuleUserRel.setUserId(Long.parseLong(userId));
                        reportCostBreakdownRuleUserRelMapper.saveReportCostBreakdownRuleUserRelAdd(reportCostBreakdownRuleUserRel);
                    }
                }


                List<String> deptList = breakdownRuleDetail.getDeptList();
                if (deptList != null) {
                    for (String deptid : deptList) {
                        ReportCostBreakdownRuleDeptRel reportCostBreakdownRuleDeptRel = new ReportCostBreakdownRuleDeptRel();
                        reportCostBreakdownRuleDeptRel.setFeeRuleDetailId(reeRuleDetailId);
                        reportCostBreakdownRuleDeptRel.setDeptId(Long.parseLong(deptid));
                        reportCostBreakdownRuleDeptRelMapper.saveReportCostBreakdownRuleDeptRelAdd(reportCostBreakdownRuleDeptRel);
                    }
                }

                reportCostBreakdownRuleDetailMapper.saveReportCostBreakdownRuleDetailAdd(reportCostBreakdownRuleDetail);
            }
            reportCostBreakdownRuleMapper.saveReportCostBreakdownRuleAdd(rule1);
        }
        return 1;
    }


    /**
     * 查询变更记录
     *
     * @param rule
     * @return
     */
    @Override
    public List<AdjustingRecordDTO> queryAdjustingRecords(ReportCostBreakdownRule rule) {
        List<AdjustingRecordDTO> adjustingRecord = reportCostBreakdownRuleRecordMapper.queryAdjustingRecords(rule);
        return adjustingRecord;
    }

    /**
     * 查询变更记录明细
     *
     * @param rule
     * @return
     */
    @Override
    public List<ReportCostBreakdownRuleDTO> queryAdjustingRecordDetail(ReportCostBreakdownRuleRecord rule) {

        Long comId = rule.getConId();
        if (comId == null) {
            throw new RuntimeException("合同ID不能为空");
        }
        String recordCode = rule.getRecordCode();
        if (StringUtils.isBlank(recordCode)) {
            throw new RuntimeException("合同ID不能为空");
        }

        List<ReportCostBreakdownRuleDTO> resultList = new ArrayList<>();
        //查询制定合同和变更记录编码查询变更记录明细
        ReportCostBreakdownRuleRecord rule1 = new ReportCostBreakdownRuleRecord();
        rule1.setConId(comId);
        rule1.setRecordCode(recordCode);
        List<ReportCostBreakdownRuleRecord> breakdownRule = reportCostBreakdownRuleRecordMapper.queryReportCostBreakdownRecordRule(rule1);
        //如果当前合同没有费用规则明细则返回默认值
        if (breakdownRule == null) {
            return resultList;
        }

        //如果有费用明细则查询所有的费用明细规则信息
        for (ReportCostBreakdownRuleRecord costBreakdownRule : breakdownRule) {
            ReportCostBreakdownRuleDTO breakdownRuleDTO = new ReportCostBreakdownRuleDTO();
            breakdownRuleDTO.setFeeRuleId(costBreakdownRule.getFeeRuleId());
            breakdownRuleDTO.setConId(costBreakdownRule.getConId());
            breakdownRuleDTO.setFeeRuleCode(costBreakdownRule.getFeeRuleCode());
            breakdownRuleDTO.setBudgetProportion(costBreakdownRule.getBudgetProportion());
            breakdownRuleDTO.setStandardProportion(costBreakdownRule.getStandardProportion());
            breakdownRuleDTO.setSystemSubject(costBreakdownRule.getSystemSubject());
            breakdownRuleDTO.setAmount(costBreakdownRule.getAmount());


            Set<String> pUserNameSet = new HashSet<>();
            Set<String> pDeptNameSet = new HashSet<>();

            List<ReportCostBreakdownRuleDetailDTO> detailList = new ArrayList<>();
            //查询当前费用规则的费用规则明细信息
            ReportCostBreakdownRuleDetailRecord ruleDetail = new ReportCostBreakdownRuleDetailRecord();
            ruleDetail.setFeeRuleId(costBreakdownRule.getFeeRuleId());
            List<ReportCostBreakdownRuleDetailRecord> breakdownRuleDetails = reportCostBreakdownRuleDetailRecordMapper.queryReportCostBreakdownRuleDetailRecord(ruleDetail);
            for (ReportCostBreakdownRuleDetailRecord breakdownRuleDetail : breakdownRuleDetails) {
                ReportCostBreakdownRuleDetailDTO detailDTO = new ReportCostBreakdownRuleDetailDTO();
                BeanUtils.copyProperties(breakdownRuleDetail, detailDTO);
                //查询每个明细对应的人员和单位信息
                List<String> userName = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUser(breakdownRuleDetail.getFeeRuleDetailId());
                String userNameCount = String.join(" ", userName);
                detailDTO.setUserName(userNameCount);
                List<String> deptName = reportCostBreakdownRuleDeptRelMapper.queryReportCostBreakdownRuleDept(breakdownRuleDetail.getFeeRuleDetailId());
                String deptNameCount = String.join(" ", deptName);
                detailDTO.setDeptName(deptNameCount);
                detailList.add(detailDTO);
                detailDTO.setDeptList(new ArrayList<>());
                detailDTO.setUserList(new ArrayList<>());

                Set<String> userSet = new HashSet<>(userName);
                Set<String> deptSet = new HashSet<>(deptName);
                pUserNameSet.addAll(userSet);
                pDeptNameSet.addAll(deptSet);
            }
            String pUserName = pUserNameSet.stream().collect(Collectors.joining(" "));
            String pDeptName = pDeptNameSet.stream().collect(Collectors.joining(" "));
            breakdownRuleDTO.setpDeptName(pDeptName);
            breakdownRuleDTO.setpUserName(pUserName);
            breakdownRuleDTO.setDetailList(detailList);
            resultList.add(breakdownRuleDTO);

        }
        return resultList;
    }


    /**
     * 查询费用规则下拉
     *
     * @return
     */
    @Override
    public List<BreakdownRuleVO> queryBreakdownRuleDrop() {
        return reportCostBreakdownRuleMapper.queryBreakdownRuleDrop();
    }


    /**
     * 查询费用规则明细下拉
     *
     * @return
     */
    @Override
    public List<BreakdownRuleDetailVO> queryBreakdownRuleDetailDrop(ReportCostBreakdownRule rule) {
        return reportCostBreakdownRuleDetailMapper.queryBreakdownRuleDetailDrop(rule);
    }
}