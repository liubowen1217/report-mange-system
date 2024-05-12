package com.report.mange.system.mybatis;


import com.report.mange.system.model.PaymentCollectResult;
import tk.mybatis.mapper.common.Mapper;

public interface PaymentCollectResultMapper extends Mapper<PaymentCollectResult> {


    Integer savePaymentCollectResultAdd(PaymentCollectResult result);


}