package com.report.mange.system.controller;

import com.report.mange.system.service.ReportDeptService;
import com.report.mange.system.utils.ApiResult;
import com.report.mange.system.vo.ReportDeptVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportDeptController类
 * @date 2024/05/10 15:47
 */
@Api(tags = "单位")
@RestController
@RequestMapping("/reportDept")
public class ReportDeptController {

    @Resource
    private ReportDeptService reportDeptService;


    /**
     * @Description: 查询全部合同
     */
    @ApiOperation("查询单位")
    @PostMapping("/queryAllDept")
    public ApiResult<List<ReportDeptVO>> queryAllDept() throws Exception {
        List<ReportDeptVO> list = reportDeptService.queryAllDept();
        return ApiResult.ok(list);
    }
}