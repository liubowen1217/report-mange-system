package com.report.mange.system.service.impl;

import com.report.mange.system.dto.*;
import com.report.mange.system.model.*;
import com.report.mange.system.mybatis.*;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.SnowflakeManager;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import com.report.mange.system.vo.BreakdownRuleVO;
import com.report.mange.system.vo.ReportCostBreakdownRuleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
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
public class ReportCostBreakdownRuleNewServiceImpl implements ReportCostBreakdownRuleService {

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

    @Resource
    private SystemSubjectBasicInfoMapper systemSubjectBasicInfoMapper;


    /**
     * 查询默认的费用明细信息
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
        List<ReportCostBreakdownRuleDTO> breakdownRule = reportCostBreakdownRuleMapper.queryReportCostBreakdownRule(rule1);
        //如果当前合同没有费用规则明细则返回默认值
        if (breakdownRule.size() == 0) {
            ReportCostBreakdownRule rule2 = new ReportCostBreakdownRule();
            rule2.setRecordCode("001");
            resultList = reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRuleNew(rule2);
            for (ReportCostBreakdownRuleDTO reportCostBreakdownRuleDTO : resultList) {
                ReportCostBreakdownRule rule3 = new ReportCostBreakdownRule();
                rule3.setpFeeRuleId(reportCostBreakdownRuleDTO.getFeeRuleId());
                List<ReportCostBreakdownRuleDetailDTO> detailList = reportCostBreakdownRuleMapper.queryDefaultReportCostBreakdownRuleDetailNew(rule2);
                reportCostBreakdownRuleDTO.setDetailList(detailList);
            }
            return resultList;
        }

        //如果有费用明细则查询所有的费用明细规则信息
        for (ReportCostBreakdownRuleDTO costBreakdownRule : breakdownRule) {

            Set<String> pUserNameSet = new HashSet<>();
            Set<String> pDeptNameSet = new HashSet<>();
            String pLevel = costBreakdownRule.getIsLevel();

            List<ReportCostBreakdownRuleDetailDTO> detailList = new ArrayList<>();
            //查询当前费用规则的费用规则明细信息
            ReportCostBreakdownRule ruleDetail = new ReportCostBreakdownRule();
            ruleDetail.setpFeeRuleId(costBreakdownRule.getFeeRuleId());
            List<ReportCostBreakdownRuleDetail> breakdownRuleDetails = reportCostBreakdownRuleMapper.queryReportCostBreakdownRuleDetail(ruleDetail);
            for (ReportCostBreakdownRuleDetail breakdownRuleDetail : breakdownRuleDetails) {
                ReportCostBreakdownRuleDetailDTO detailDTO = new ReportCostBreakdownRuleDetailDTO();
                BeanUtils.copyProperties(breakdownRuleDetail, detailDTO);
                //查询每个明细对应的人员和单位信息
                List<String> userName = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUserId(breakdownRuleDetail.getFeeRuleDetailId());
//                String userNameCount = String.join(" ", userName);
                detailDTO.setUserList(userName);
                List<String> deptName = reportCostBreakdownRuleDeptRelMapper.queryReportCostBreakdownRuleDeptId(breakdownRuleDetail.getFeeRuleDetailId());
//                String deptNameCount = String.join(" ", deptName);
                detailDTO.setDeptList(deptName);
                detailList.add(detailDTO);
                detailDTO.setIsLevel("0");
//                if ("1".equals(pLevel)) {
//                    Set<String> userSet = new HashSet<>(userName);
//                    Set<String> deptSet = new HashSet<>(deptName);
//                    pUserNameSet.addAll(userSet);
//                    pDeptNameSet.addAll(deptSet);
//                }

            }
            String userNameCount = "";
            String deptNameCount = "";
            if ("1".equals(pLevel)) {
                userNameCount = pUserNameSet.stream().collect(Collectors.joining(" "));
                deptNameCount = pDeptNameSet.stream().collect(Collectors.joining(" "));
            } else {
                List<String> userName = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUserId(costBreakdownRule.getFeeRuleId());
//                userNameCount = String.join(" ", userName);
                List<String> deptName = reportCostBreakdownRuleDeptRelMapper.queryReportCostBreakdownRuleDeptId(costBreakdownRule.getFeeRuleId());
//                deptNameCount = String.join(" ", deptName);
                costBreakdownRule.setpUserList(userName);
                costBreakdownRule.setpDeptList(deptName);
            }
//            costBreakdownRule.setpDeptName(deptNameCount);
//            costBreakdownRule.setpUserName(userNameCount);
            costBreakdownRule.setDetailList(detailList);
            resultList.add(costBreakdownRule);
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
        List<ReportCostBreakdownRuleDTO> breakdownRule = reportCostBreakdownRuleMapper.queryAllReportCostBreakdownRule(rule);

        //如果已经有了明细规则 则将明细规则放到记录里面并记录版本号
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String formattedDateTime = now.format(formatter);
        if (breakdownRule.size() > 0) {
            //插入到记录表中
            for (ReportCostBreakdownRuleDTO costBreakdownRule : breakdownRule) {
                ReportCostBreakdownRuleRecord ruleRecord = new ReportCostBreakdownRuleRecord();
                BeanUtils.copyProperties(costBreakdownRule, ruleRecord);
                reportCostBreakdownRuleRecordMapper.saveReportCostBreakdownRuleRecordAdd(ruleRecord);
            }

            //禁用费用明细
            reportCostBreakdownRuleMapper.saveReportCostBreakdownRuleModify(comId);
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
            rule1.setRecordCode(formattedDateTime);
            if ("0".equals(reportCostBreakdownRuleVO.getIsLevel())) {
                List<String> userList = reportCostBreakdownRuleVO.getpUserList();
                if (userList != null) {
                    for (String userId : userList) {
                        ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel = new ReportCostBreakdownRuleUserRel();
                        reportCostBreakdownRuleUserRel.setRuleId(reeRuleId);
                        reportCostBreakdownRuleUserRel.setUserId(Long.parseLong(userId));
                        reportCostBreakdownRuleUserRelMapper.saveReportCostBreakdownRuleUserRelAdd(reportCostBreakdownRuleUserRel);
                    }
                }


                List<String> deptList = reportCostBreakdownRuleVO.getpDeptList();
                if (deptList != null) {
                    for (String deptid : deptList) {
                        ReportCostBreakdownRuleDeptRel reportCostBreakdownRuleDeptRel = new ReportCostBreakdownRuleDeptRel();
                        reportCostBreakdownRuleDeptRel.setRuleId(reeRuleId);
                        reportCostBreakdownRuleDeptRel.setDeptId(Long.parseLong(deptid));
                        reportCostBreakdownRuleDeptRelMapper.saveReportCostBreakdownRuleDeptRelAdd(reportCostBreakdownRuleDeptRel);
                    }
                }
            }

            reportCostBreakdownRuleMapper.saveReportCostBreakdownRuleAdd(rule1);
            //处理规则明细
            List<ReportCostBreakdownRuleDetailVO> breakdownRuleDetails = reportCostBreakdownRuleVO.getDetailList();
            for (ReportCostBreakdownRuleDetailVO breakdownRuleDetail : breakdownRuleDetails) {
                Long reeRuleDetailId = snowflakeManager.nextValue();
                ReportCostBreakdownRule reportCostBreakdownRuleDetail = new ReportCostBreakdownRule();
                reportCostBreakdownRuleDetail.setFeeRuleId(reeRuleDetailId);
                reportCostBreakdownRuleDetail.setpFeeRuleId(reeRuleId);
                reportCostBreakdownRuleDetail.setConId(comId);
                reportCostBreakdownRuleDetail.setSystemSubject(breakdownRuleDetail.getSubSystemSubject());
                reportCostBreakdownRuleDetail.setStandardProportion(breakdownRuleDetail.getSubStandardProportion());
                reportCostBreakdownRuleDetail.setBudgetProportion(breakdownRuleDetail.getSubBudgetProportion());
                reportCostBreakdownRuleDetail.setAmount(breakdownRuleDetail.getSubAmount());
                reportCostBreakdownRuleDetail.setRemark(breakdownRuleDetail.getSubRemark());
                reportCostBreakdownRuleDetail.setFeeRuleCode(breakdownRuleDetail.getSubFeeRuleCode());
                reportCostBreakdownRuleDetail.setRecordCode(formattedDateTime);

                List<String> userList = breakdownRuleDetail.getUserList();
                if (userList != null) {
                    for (String userId : userList) {
                        ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel = new ReportCostBreakdownRuleUserRel();
                        reportCostBreakdownRuleUserRel.setRuleId(reeRuleDetailId);
                        reportCostBreakdownRuleUserRel.setUserId(Long.parseLong(userId));
                        reportCostBreakdownRuleUserRelMapper.saveReportCostBreakdownRuleUserRelAdd(reportCostBreakdownRuleUserRel);
                    }
                }


                List<String> deptList = breakdownRuleDetail.getDeptList();
                if (deptList != null) {
                    for (String deptid : deptList) {
                        ReportCostBreakdownRuleDeptRel reportCostBreakdownRuleDeptRel = new ReportCostBreakdownRuleDeptRel();
                        reportCostBreakdownRuleDeptRel.setRuleId(reeRuleDetailId);
                        reportCostBreakdownRuleDeptRel.setDeptId(Long.parseLong(deptid));
                        reportCostBreakdownRuleDeptRelMapper.saveReportCostBreakdownRuleDeptRelAdd(reportCostBreakdownRuleDeptRel);
                    }
                }

                reportCostBreakdownRuleMapper.saveReportCostBreakdownRuleAdd(reportCostBreakdownRuleDetail);
            }
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
            throw new RuntimeException("版本编码不能为空");
        }

        List<ReportCostBreakdownRuleDTO> resultList = new ArrayList<>();
        //查询制定合同和变更记录编码查询变更记录明细
        ReportCostBreakdownRuleRecord rule1 = new ReportCostBreakdownRuleRecord();
        rule1.setConId(comId);
        rule1.setRecordCode(recordCode);
        List<ReportCostBreakdownRuleDTO> breakdownRule = reportCostBreakdownRuleRecordMapper.queryReportCostBreakdownRecordRule(rule1);
        //如果当前合同没有费用规则明细则返回默认值
        if (breakdownRule == null) {
            return resultList;
        }

        //如果有费用明细则查询所有的费用明细规则信息
        for (ReportCostBreakdownRuleDTO costBreakdownRule : breakdownRule) {
            ReportCostBreakdownRuleDTO breakdownRuleDTO = new ReportCostBreakdownRuleDTO();
            breakdownRuleDTO.setId(costBreakdownRule.getId());
            breakdownRuleDTO.setFeeRuleId(costBreakdownRule.getFeeRuleId());
            breakdownRuleDTO.setConId(costBreakdownRule.getConId());
            breakdownRuleDTO.setFeeRuleCode(costBreakdownRule.getFeeRuleCode());
            breakdownRuleDTO.setBudgetProportion(costBreakdownRule.getBudgetProportion());
            breakdownRuleDTO.setStandardProportion(costBreakdownRule.getStandardProportion());
            breakdownRuleDTO.setSystemSubject(costBreakdownRule.getSystemSubject());
            breakdownRuleDTO.setAmount(costBreakdownRule.getAmount());
            String pLevel = costBreakdownRule.getIsLevel();

            Set<String> pUserNameSet = new HashSet<>();
            Set<String> pDeptNameSet = new HashSet<>();

            List<ReportCostBreakdownRuleDetailDTO> detailList = new ArrayList<>();
            //查询当前费用规则的费用规则明细信息
            ReportCostBreakdownRule ruleDetail = new ReportCostBreakdownRule();
            ruleDetail.setpFeeRuleId(costBreakdownRule.getFeeRuleId());
            List<ReportCostBreakdownRuleDetailRecord> breakdownRuleDetails = reportCostBreakdownRuleDetailRecordMapper.queryReportCostBreakdownRuleDetailRecordNew(ruleDetail);
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

                if ("1".equals(pLevel)) {
                    Set<String> userSet = new HashSet<>(userName);
                    Set<String> deptSet = new HashSet<>(deptName);
                    pUserNameSet.addAll(userSet);
                    pDeptNameSet.addAll(deptSet);
                }
            }

            String userNameCount = "";
            String deptNameCount = "";
            if ("1".equals(pLevel)) {
                userNameCount = pUserNameSet.stream().collect(Collectors.joining(" "));
                deptNameCount = pDeptNameSet.stream().collect(Collectors.joining(" "));
            } else {
                List<String> userName = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUser(costBreakdownRule.getFeeRuleId());
                userNameCount = String.join(" ", userName);
                List<String> deptName = reportCostBreakdownRuleDeptRelMapper.queryReportCostBreakdownRuleDept(costBreakdownRule.getFeeRuleId());
                deptNameCount = String.join(" ", deptName);
            }
            breakdownRuleDTO.setpDeptName(deptNameCount);
            breakdownRuleDTO.setpUserName(userNameCount);
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
        return systemSubjectBasicInfoMapper.queryFirstSystemSubject();
    }


    /**
     * 查询费用规则明细下拉
     *
     * @return
     */
    @Override
    public List<BreakdownRuleDetailVO> queryBreakdownRuleDetailDrop(ReportCostBreakdownRule rule) {
        return systemSubjectBasicInfoMapper.querySecondSystemSubject(rule);
    }
}