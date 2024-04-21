package com.report.mange.system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.report.mange.system.model.ReportCon;
import com.report.mange.system.query.ReportConQuery;
import com.report.mange.system.service.ReportConService;
import com.report.mange.system.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportConController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "ReportConcontroller")
@RestController
@RequestMapping("/reportCon")
public class ReportConController {
    Logger logger = LoggerFactory.getLogger(ReportConController.class);
    @Resource
    private ReportConService reportConService;

    @ApiOperation("saveReportConAdd")
    @PostMapping("/saveReportConAdd")
    public ApiResult<Integer> saveReportConAdd(@RequestBody ReportCon reportCon) throws Exception {
        try {
            reportConService.saveReportConAdd(reportCon);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }

    @ApiOperation("saveReportConModify")
    @PostMapping("/saveReportConModify")
    public ApiResult<Integer> saveReportConModify(@RequestBody ReportCon reportCon) throws Exception {
        try {
            reportConService.saveReportConModify(reportCon);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * @Description: 分页查询
     * @Reutrn ApiResult<PageInfo < ReportCon>>
     */
    @ApiOperation("queryReportCon")
    @PostMapping("/queryReportCon")
    public ApiResult<PageInfo<ReportCon>> queryReportCon(@RequestBody ReportConQuery query) throws Exception {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<ReportCon> list = reportConService.queryReportCon(query);
        PageInfo<ReportCon> pageInfo = new PageInfo<ReportCon>(list);
        return ApiResult.ok(pageInfo);
    }
}