package com.report.mange.system.controller;

import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "ReportCostBreakdownRulecontroller")
@RestController
@RequestMapping("/reportCostBreakdownRule")
public class ReportCostBreakdownRuleController {
    Logger logger = LoggerFactory.getLogger(ReportCostBreakdownRuleController.class);
    @Resource
    private ReportCostBreakdownRuleService reportCostBreakdownRuleService;

//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRule reportCostBreakdownRule) throws Exception {
//        Integer state = reportCostBreakdownRuleService.insert(reportCostBreakdownRule);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportCostBreakdownRuleService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCostBreakdownRule reportCostBreakdownRule) throws Exception {
//        Integer state = reportCostBreakdownRuleService.update(reportCostBreakdownRule);
//        return ApiResult.ok(state);
//    }

    /**
     * 查询默认的费用明细信息
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("queryDefaultReportCostBreakdownRule")
    @PostMapping("/queryDefaultReportCostBreakdownRule")
    public ApiResult<List<ReportCostBreakdownRuleDTO>> selectById() throws Exception {
        List<ReportCostBreakdownRuleDTO> resultList = reportCostBreakdownRuleService.queryDefaultReportCostBreakdownRule();
        return ApiResult.ok(resultList);
    }
}