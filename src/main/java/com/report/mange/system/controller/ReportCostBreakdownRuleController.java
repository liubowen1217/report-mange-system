package com.report.mange.system.controller;

import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ReportCostBreakdownRuleController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportCostBreakdownRulecontroller")
@RestController
@RequestMapping("/reportCostBreakdownRule")
public class ReportCostBreakdownRuleController {

//    @Resource
//    private ReportCostBreakdownRuleService reportCostBreakdownRuleService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRule reportCostBreakdownRule) throws Exception{
//    	Integer state = reportCostBreakdownRuleService.insert(reportCostBreakdownRule);
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
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCostBreakdownRule> selectById(@RequestParam String id) throws Exception {
//        ReportCostBreakdownRule reportCostBreakdownRule = reportCostBreakdownRuleService.selectById(id);
//        return ApiResult.ok(reportCostBreakdownRule);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCostBreakdownRule>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCostBreakdownRule>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCostBreakdownRule> list = reportCostBreakdownRuleService.selectAll();
//        PageInfo<ReportCostBreakdownRule> pageInfo = new PageInfo<ReportCostBreakdownRule>(list);
//        return ApiResult.ok(pageInfo);
//    }
}