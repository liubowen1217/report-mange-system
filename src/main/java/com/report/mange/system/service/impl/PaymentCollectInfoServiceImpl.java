package com.report.mange.system.service.impl;

import com.report.mange.system.dto.*;
import com.report.mange.system.model.*;
import com.report.mange.system.mybatis.*;
import com.report.mange.system.query.ReportConQuery;
import com.report.mange.system.service.PaymentCollectInfoService;
import com.report.mange.system.utils.SnowflakeManager;
import com.report.mange.system.vo.ReportDeptVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 刘博文
 * @Description: PaymentCollectInfoService接口实现类
 * @date 2024/05/12 14:22
 */
@Service
public class PaymentCollectInfoServiceImpl implements PaymentCollectInfoService {

    @Resource
    private PaymentCollectInfoMapper paymentCollectInfoMapper;

    @Resource
    private SnowflakeManager snowflakeManager;

    @Resource
    private PaymentCollectInfoDeptRelMapper paymentCollectInfoDeptRelMapper;

    @Resource
    private PaymentCollectResultMapper paymentCollectResultMapper;

    @Resource
    private ReportConMapper reportConMapper;


    @Resource
    private ReportCostBreakdownRuleUserRelMapper reportCostBreakdownRuleUserRelMapper;


    /**
     * 新增回款信息
     *
     * @param paymentCollect
     * @return
     */
    @Override
    @Transactional
    public Integer savePaymentCollectAdd(PaymentCollectInfoDTO paymentCollect) {
        if (paymentCollect.getDeptList() == null) {
            throw new RuntimeException("认领部门不能为空");
        }
        Long conId = paymentCollect.getConId();
        ReportConQuery query = new ReportConQuery();
        query.setConId(conId);
        List<ReportCon> conList = reportConMapper.queryReportCon(query);
        if (conList.size() == 0) {
            throw new RuntimeException("未找到对应的合同信息");
        }

        //更新合同回款金额
        ReportCon reportCon = conList.get(0);
        String collctAmount = reportCon.getCollectAmount();
        collctAmount = new BigDecimal(collctAmount).add(new BigDecimal(paymentCollect.getAmount())).toString();
        ReportCon con = new ReportCon();
        con.setConId(conId);
        con.setCollectAmount(collctAmount);
        reportConMapper.saveReportConModify(con);

        Long paymentId = snowflakeManager.nextValue();
        PaymentCollectInfo payment = new PaymentCollectInfo();
        BeanUtils.copyProperties(paymentCollect, payment);
        payment.setPaymentId(paymentId);

        //回款金额
        String collectAmout = paymentCollect.getAmount();

        //循环认领部门 找到认领部门对应的系统科目
        for (String deptid : paymentCollect.getDeptList()) {

            //保存认领部门和回款期数的关系信息
            PaymentCollectInfoDeptRel paymentCollectInfoDeptRel = new PaymentCollectInfoDeptRel();
            paymentCollectInfoDeptRel.setPaymentId(paymentId);
            paymentCollectInfoDeptRel.setDeptId(Long.parseLong(deptid));
            paymentCollectInfoDeptRelMapper.savePaymentCollectInfoDeptRelAdd(paymentCollectInfoDeptRel);
        }


        //查询认领部门对应的系统科目信息
        SystemSubjectByDeptDTO rule = new SystemSubjectByDeptDTO();
        rule.setConId(paymentCollect.getConId());
        List<ReportCostBreakdownRuleDTO> systemSubject = paymentCollectInfoDeptRelMapper.getSystemSubjectByDept(rule);
        for (ReportCostBreakdownRuleDTO reportCostBreakdownRuleDTO : systemSubject) {
            //进行数据计算当前部门占领的回款金额
            BigDecimal amout = new BigDecimal(collectAmout).divide(new BigDecimal(reportCostBreakdownRuleDTO.getStandardProportion()),4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
            PaymentCollectResult result = new PaymentCollectResult();
            result.setPaymentResultId(snowflakeManager.nextValue());
            result.setConId(reportCostBreakdownRuleDTO.getConId());
            result.setPaymentId(paymentId);
            result.setFeeRuleId(reportCostBreakdownRuleDTO.getFeeRuleId());
            result.setAllocatAmount(amout.toString());
            paymentCollectResultMapper.savePaymentCollectResultAdd(result);
        }

        return paymentCollectInfoMapper.savePaymentCollectAdd(payment);
    }


    /**
     * 查询回款期数
     *
     * @param paymentCollect
     * @return
     */
    @Override
    public List<PaymentCollectInfoDTO> queryPaymentCollect(PaymentCollectInfo paymentCollect) {
        List<PaymentCollectInfoDTO> collectInfos = paymentCollectInfoMapper.queryPaymentCollect(paymentCollect);
        for (PaymentCollectInfoDTO collectInfo : collectInfos) {
            //查询对应的认领部门
            List<String> deptList = paymentCollectInfoDeptRelMapper.queryPaymentCollectInfoDeptName(collectInfo.getPaymentId());
            String deptNameCount = String.join(" ", deptList);
            collectInfo.setDeptName(deptNameCount);
        }
        return collectInfos;
    }


    /**
     * 查询认领部门
     *
     * @param paymentCollect
     * @return
     */
    @Override
    public List<ReportDeptVO> queryClaimDept(PaymentCollectInfo paymentCollect) {
        return paymentCollectInfoDeptRelMapper.queryClaimDept(paymentCollect);
    }


    /**
     * 查询回款明细
     *
     * @param paymentCollect
     * @return
     */
    @Override
    public List<PaymentCollectDetailDTO> queryPaymentCollectDetail(PaymentCollectInfo paymentCollect) {

        Long paymentId = paymentCollect.getPaymentId();
        if (paymentId == null) {
            throw new RuntimeException("回款期数id不能为空");
        }

        //查询回款期数的系统科目信息
        PaymentCollectInfo paymentCollectInfo = new PaymentCollectInfo();
        paymentCollectInfo.setPaymentId(paymentId);
        List<PaymentCollectDetailDTO> breakdownRule = paymentCollectInfoDeptRelMapper.queryPaymentCollectDetail(paymentCollectInfo);
        //如果沒有回款期数的系统科目信息
        if (breakdownRule == null) {
            return new ArrayList<>();
        }

        //如果有费用明细则查询所有的费用明细规则信息
        for (PaymentCollectDetailDTO costBreakdownRule : breakdownRule) {
//            String pLevel = costBreakdownRule.getIsLevel();
            List<ReportDept> deptList = paymentCollectInfoDeptRelMapper.queryPaymentCollectInfoDept(costBreakdownRule.getPaymentId());

            List<String> deptName = new ArrayList<>();
            Set<String> userName = new HashSet<>();
            for (ReportDept reportDept : deptList) {
                ReportUserDTO userDTO = new ReportUserDTO();
                userDTO.setRuleId(costBreakdownRule.getFeeRuleId());
                userDTO.setDeptId(reportDept.getDeptId());
                List<String> userList = reportCostBreakdownRuleUserRelMapper.queryReportCostBreakdownRuleUserName(userDTO);
                userName.addAll(userList);
                deptName.add(reportDept.getDeptName());
            }

            String userNameCount = userName.stream().collect(Collectors.joining(" "));
            String deptNameCount = String.join(" ", deptName);
            costBreakdownRule.setpDeptName(deptNameCount);
            costBreakdownRule.setpUserName(userNameCount);

        }
        return breakdownRule;
    }
}