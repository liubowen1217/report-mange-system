package com.report.mange.system.service;


import com.report.mange.system.dto.PaymentCollectDetailDTO;
import com.report.mange.system.dto.PaymentCollectInfoDTO;
import com.report.mange.system.model.PaymentCollectInfo;
import com.report.mange.system.vo.ReportDeptVO;

import java.util.List;

/**
 * @author 刘博文
 * @Description: PaymentCollectInfoService接口
 * @date 2024/05/12 14:22
 */
public interface PaymentCollectInfoService {

    Integer savePaymentCollectAdd(PaymentCollectInfoDTO paymentCollect);

    List<PaymentCollectInfoDTO> queryPaymentCollect(PaymentCollectInfo paymentCollect);

    List<ReportDeptVO> queryClaimDept(PaymentCollectInfo paymentCollect);

    List<PaymentCollectDetailDTO> queryPaymentCollectDetail(PaymentCollectInfo paymentCollect);
}