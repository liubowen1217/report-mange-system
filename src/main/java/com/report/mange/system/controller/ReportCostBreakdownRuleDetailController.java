package com.report.mange.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ReportCostBreakdownRuleDetailController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportCostBreakdownRuleDetailcontroller")
@RestController
@RequestMapping("/reportCostBreakdownRuleDetail")
public class ReportCostBreakdownRuleDetailController {
//
//    @Resource
//    private ReportCostBreakdownRuleDetailService reportCostBreakdownRuleDetailService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRuleDetail reportCostBreakdownRuleDetail) throws Exception{
//    	Integer state = reportCostBreakdownRuleDetailService.insert(reportCostBreakdownRuleDetail);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportCostBreakdownRuleDetailService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCostBreakdownRuleDetail reportCostBreakdownRuleDetail) throws Exception {
//        Integer state = reportCostBreakdownRuleDetailService.update(reportCostBreakdownRuleDetail);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCostBreakdownRuleDetail> selectById(@RequestParam String id) throws Exception {
//        ReportCostBreakdownRuleDetail reportCostBreakdownRuleDetail = reportCostBreakdownRuleDetailService.selectById(id);
//        return ApiResult.ok(reportCostBreakdownRuleDetail);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCostBreakdownRuleDetail>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCostBreakdownRuleDetail>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCostBreakdownRuleDetail> list = reportCostBreakdownRuleDetailService.selectAll();
//        PageInfo<ReportCostBreakdownRuleDetail> pageInfo = new PageInfo<ReportCostBreakdownRuleDetail>(list);
//        return ApiResult.ok(pageInfo);
//    }
}