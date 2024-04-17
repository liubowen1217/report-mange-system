package com.report.mange.system.controller;

import com.report.mange.system.model.ReportCostBreakdownRuleUserRel;
import com.report.mange.system.service.ReportCostBreakdownRuleUserRelService;
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
* @Description: ReportCostBreakdownRuleUserRelController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportCostBreakdownRuleUserRelcontroller")
@RestController
@RequestMapping("/reportCostBreakdownRuleUserRel")
public class ReportCostBreakdownRuleUserRelController {

//    @Resource
//    private ReportCostBreakdownRuleUserRelService reportCostBreakdownRuleUserRelService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel) throws Exception{
//    	Integer state = reportCostBreakdownRuleUserRelService.insert(reportCostBreakdownRuleUserRel);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportCostBreakdownRuleUserRelService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel) throws Exception {
//        Integer state = reportCostBreakdownRuleUserRelService.update(reportCostBreakdownRuleUserRel);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCostBreakdownRuleUserRel> selectById(@RequestParam String id) throws Exception {
//        ReportCostBreakdownRuleUserRel reportCostBreakdownRuleUserRel = reportCostBreakdownRuleUserRelService.selectById(id);
//        return ApiResult.ok(reportCostBreakdownRuleUserRel);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCostBreakdownRuleUserRel>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCostBreakdownRuleUserRel>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCostBreakdownRuleUserRel> list = reportCostBreakdownRuleUserRelService.selectAll();
//        PageInfo<ReportCostBreakdownRuleUserRel> pageInfo = new PageInfo<ReportCostBreakdownRuleUserRel>(list);
//        return ApiResult.ok(pageInfo);
//    }
}