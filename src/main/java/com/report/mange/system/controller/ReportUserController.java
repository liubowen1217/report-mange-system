package com.report.mange.system.controller;

import com.report.mange.system.model.ReportUser;
import com.report.mange.system.service.ReportUserService;
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
* @Description: ReportUserController类
* @author 刘博文
* @date 2024/04/17 19:27
*/
@Api(tags = "ReportUsercontroller")
@RestController
@RequestMapping("/reportUser")
public class ReportUserController {

//    @Resource
//    private ReportUserService reportUserService;
//
//    @ApiOperation("insert")
//    @PostMapping("/insert")
//    public ApiResult<Integer> insert(ReportUser reportUser) throws Exception{
//    	Integer state = reportUserService.insert(reportUser);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("deleteById")
//    @PostMapping("/deleteById")
//    public ApiResult<Integer> deleteById(@RequestParam String id) throws Exception {
//        Integer state = reportUserService.deleteById(id);
//        return ApiResult.ok(state);
//    }
//
//    @ApiOperation("update")
//    @PostMapping("/update")
//    public ApiResult<Integer> update(ReportUser reportUser) throws Exception {
//        Integer state = reportUserService.update(reportUser);
//        return ApiResult.ok(state);
//    }
//    @ApiOperation("selectById")
//    @PostMapping("/selectById")
//    public ApiResult<ReportUser> selectById(@RequestParam String id) throws Exception {
//        ReportUser reportUser = reportUserService.selectById(id);
//        return ApiResult.ok(reportUser);
//    }
//
//    /**
//	* @Description: 分页查询
//	* @param page 页码
//	* @param size 每页条数
//	* @Reutrn ApiResult<PageInfo<ReportUser>>
//	*/
//    @ApiOperation("list")
//    @PostMapping("/list")
//    public ApiResult<PageInfo<ReportUser>> list(@RequestParam(defaultValue = "0") Integer page,
//					@RequestParam(defaultValue = "0") Integer size) throws Exception {
//        PageHelper.startPage(page, size);
//        List<ReportUser> list = reportUserService.selectAll();
//        PageInfo<ReportUser> pageInfo = new PageInfo<ReportUser>(list);
//        return ApiResult.ok(pageInfo);
//    }
}