package com.report.mange.system.controller;

import com.report.mange.system.service.ReportCostBreakdownRuleRecordService;
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
* @Description: ReportCostBreakdownRuleRecordController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportCostBreakdownRuleRecordcontroller")
@RestController
@RequestMapping("/reportCostBreakdownRuleRecord")
public class ReportCostBreakdownRuleRecordController {

    @Resource
    private ReportCostBreakdownRuleRecordService reportCostBreakdownRuleRecordService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRuleRecord reportCostBreakdownRuleRecord) throws Exception{
//    	Integer state = reportCostBreakdownRuleRecordService.insert(reportCostBreakdownRuleRecord);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportCostBreakdownRuleRecordService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCostBreakdownRuleRecord reportCostBreakdownRuleRecord) throws Exception {
//        Integer state = reportCostBreakdownRuleRecordService.update(reportCostBreakdownRuleRecord);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCostBreakdownRuleRecord> selectById(@RequestParam String id) throws Exception {
//        ReportCostBreakdownRuleRecord reportCostBreakdownRuleRecord = reportCostBreakdownRuleRecordService.selectById(id);
//        return ApiResult.ok(reportCostBreakdownRuleRecord);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCostBreakdownRuleRecord>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCostBreakdownRuleRecord>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCostBreakdownRuleRecord> list = reportCostBreakdownRuleRecordService.selectAll();
//        PageInfo<ReportCostBreakdownRuleRecord> pageInfo = new PageInfo<ReportCostBreakdownRuleRecord>(list);
//        return ApiResult.ok(pageInfo);
//    }
}