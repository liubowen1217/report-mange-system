package com.report.mange.system.mybatis;


import com.report.mange.system.dto.PaymentCollectInfoDTO;
import com.report.mange.system.model.PaymentCollectInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PaymentCollectInfoMapper extends Mapper<PaymentCollectInfo> {

    Integer savePaymentCollectAdd(PaymentCollectInfo paymentCollect);

    List<PaymentCollectInfoDTO> queryPaymentCollect(PaymentCollectInfo paymentCollect);
}