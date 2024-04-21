package com.report.mange.system.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description: ReportOrgController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportOrgcontroller")
@RestController
@RequestMapping("/reportOrg")
public class ReportOrgController {

//    @Resource
//    private ReportOrgService reportOrgService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportOrg reportOrg) throws Exception{
//    	Integer state = reportOrgService.insert(reportOrg);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportOrgService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportOrg reportOrg) throws Exception {
//        Integer state = reportOrgService.update(reportOrg);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportOrg> selectById(@RequestParam String id) throws Exception {
//        ReportOrg reportOrg = reportOrgService.selectById(id);
//        return ApiResult.ok(reportOrg);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportOrg>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportOrg>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportOrg> list = reportOrgService.selectAll();
//        PageInfo<ReportOrg> pageInfo = new PageInfo<ReportOrg>(list);
//        return ApiResult.ok(pageInfo);
//    }
}