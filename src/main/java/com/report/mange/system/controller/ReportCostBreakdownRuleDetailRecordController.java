package com.report.mange.system.controller;

import com.report.mange.system.service.ReportCostBreakdownRuleDetailRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ReportCostBreakdownRuleDetailRecordController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportCostBreakdownRuleDetailRecordcontroller")
@RestController
@RequestMapping("/reportCostBreakdownRuleDetailRecord")
public class ReportCostBreakdownRuleDetailRecordController {

    @Resource
    private ReportCostBreakdownRuleDetailRecordService reportCostBreakdownRuleDetailRecordService;

//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCostBreakdownRuleDetailRecord reportCostBreakdownRuleDetailRecord) throws Exception{
//    	Integer state = reportCostBreakdownRuleDetailRecordService.insert(reportCostBreakdownRuleDetailRecord);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportCostBreakdownRuleDetailRecordService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCostBreakdownRuleDetailRecord reportCostBreakdownRuleDetailRecord) throws Exception {
//        Integer state = reportCostBreakdownRuleDetailRecordService.update(reportCostBreakdownRuleDetailRecord);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCostBreakdownRuleDetailRecord> selectById(@RequestParam String id) throws Exception {
//        ReportCostBreakdownRuleDetailRecord reportCostBreakdownRuleDetailRecord = reportCostBreakdownRuleDetailRecordService.selectById(id);
//        return ApiResult.ok(reportCostBreakdownRuleDetailRecord);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCostBreakdownRuleDetailRecord>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCostBreakdownRuleDetailRecord>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCostBreakdownRuleDetailRecord> list = reportCostBreakdownRuleDetailRecordService.selectAll();
//        PageInfo<ReportCostBreakdownRuleDetailRecord> pageInfo = new PageInfo<ReportCostBreakdownRuleDetailRecord>(list);
//        return ApiResult.ok(pageInfo);
//    }
}