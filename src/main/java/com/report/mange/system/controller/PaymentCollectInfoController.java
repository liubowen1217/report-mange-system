package com.report.mange.system.controller;

import com.report.mange.system.dto.PaymentCollectDetailDTO;
import com.report.mange.system.dto.PaymentCollectInfoDTO;
import com.report.mange.system.model.PaymentCollectInfo;
import com.report.mange.system.service.PaymentCollectInfoService;
import com.report.mange.system.utils.ApiResult;
import com.report.mange.system.vo.ReportDeptVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: 回款期数信息
 * @date 2024/05/12 14:22
 */
@Api(tags = "回款期数信息")
@RestController
@RequestMapping("/paymentCollectInfo")
public class PaymentCollectInfoController {
    Logger logger = LoggerFactory.getLogger(PaymentCollectInfoController.class);

    @Resource
    private PaymentCollectInfoService paymentCollectInfoService;


    @ApiOperation("新增回款期数")
    @PostMapping("/savePaymentCollectAdd")
    public ApiResult<Integer> saveReportConAdd(@RequestBody PaymentCollectInfoDTO paymentCollect) throws Exception {
        try {
            paymentCollectInfoService.savePaymentCollectAdd(paymentCollect);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * @Description: 查询全部合同
     */
    @ApiOperation("查询回款期数")
    @PostMapping("/queryPaymentCollect")
    public ApiResult<List<PaymentCollectInfoDTO>> queryPaymentCollect(@RequestBody PaymentCollectInfo paymentCollect) throws Exception {
        List<PaymentCollectInfoDTO> list = paymentCollectInfoService.queryPaymentCollect(paymentCollect);
        return ApiResult.ok(list);
    }


    /**
     * @Description: 查询认领部门
     */
    @ApiOperation("查询认领部门")
    @PostMapping("/queryClaimDept")
    public ApiResult<List<ReportDeptVO>> queryClaimDept(@RequestBody PaymentCollectInfo paymentCollect) throws Exception {
        List<ReportDeptVO> list = paymentCollectInfoService.queryClaimDept(paymentCollect);
        return ApiResult.ok(list);
    }


    /**
     * @Description: 查询回款明细
     */
    @ApiOperation("查询回款明细")
    @PostMapping("/queryPaymentCollectDetail")
    public ApiResult<List<PaymentCollectDetailDTO>> queryPaymentCollectDetail(@RequestBody PaymentCollectInfo paymentCollect) throws Exception {
        List<PaymentCollectDetailDTO> list = paymentCollectInfoService.queryPaymentCollectDetail(paymentCollect);
        return ApiResult.ok(list);
    }


}