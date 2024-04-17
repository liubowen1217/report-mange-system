package com.report.mange.system.controller;

import com.report.mange.system.service.ReportConService;
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
* @Description: ReportConController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportConcontroller")
@RestController
@RequestMapping("/reportCon")
public class ReportConController {

    @Resource
    private ReportConService reportConService;

//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportCon reportCon) throws Exception{
//    	Integer state = reportConService.insert(reportCon);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportConService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportCon reportCon) throws Exception {
//        Integer state = reportConService.update(reportCon);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportCon> selectById(@RequestParam String id) throws Exception {
//        ReportCon reportCon = reportConService.selectById(id);
//        return ApiResult.ok(reportCon);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportCon>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportCon>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportCon> list = reportConService.selectAll();
//        PageInfo<ReportCon> pageInfo = new PageInfo<ReportCon>(list);
//        return ApiResult.ok(pageInfo);
//    }
}