package com.report.mange.system.mybatis;


import com.report.mange.system.dto.PaymentCollectDetailDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.SystemSubjectByDeptDTO;
import com.report.mange.system.model.PaymentCollectInfo;
import com.report.mange.system.model.PaymentCollectInfoDeptRel;
import com.report.mange.system.model.ReportDept;
import com.report.mange.system.vo.ReportDeptVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PaymentCollectInfoDeptRelMapper extends Mapper<PaymentCollectInfoDeptRel> {

    Integer savePaymentCollectInfoDeptRelAdd(PaymentCollectInfoDeptRel rel);

    List<String> queryPaymentCollectInfoDeptName(@Param("paymentId") Long paymentId);

    List<ReportDeptVO> queryClaimDept(PaymentCollectInfo paymentCollect);

    List<ReportCostBreakdownRuleDTO> getSystemSubjectByDept(SystemSubjectByDeptDTO rule);

    List<PaymentCollectDetailDTO> queryPaymentCollectDetail(PaymentCollectInfo paymentCollect);

    List<ReportDept> queryPaymentCollectInfoDept(@Param("paymentId") Long paymentId);
}