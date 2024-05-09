package com.report.mange.system.controller;

import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleSaveDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleVO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
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
 * @Description: ReportCostBreakdownRuleController类
 * @date 2024/04/17 19:27
 */
@Api(tags = "费用规则信息")
@RestController
@RequestMapping("/reportCostBreakdownRule")
public class ReportCostBreakdownRuleController {
    Logger logger = LoggerFactory.getLogger(ReportCostBreakdownRuleController.class);
    @Resource
    private ReportCostBreakdownRuleService reportCostBreakdownRuleService;

    @ApiOperation("新增费用明细信息")
    @PostMapping("/saveReportCostBreakdownRuleAdd")
    public ApiResult<Integer> insert(@RequestBody ReportCostBreakdownRuleSaveDTO reportCostBreakdownRule) throws Exception {
        try {
            reportCostBreakdownRuleService.saveReportCostBreakdownRuleAdd(reportCostBreakdownRule);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiResult.error(500, e.getMessage());
        }
        return ApiResult.ok();
    }


    /**
     * 查询费用明细信息
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("查询费用明细信息")
    @PostMapping("/queryReportCostBreakdownRule")
    public ApiResult<List<ReportCostBreakdownRuleDTO>> queryReportCostBreakdownRule(@RequestBody ReportCostBreakdownRule rule) throws Exception {
        List<ReportCostBreakdownRuleDTO> resultList = reportCostBreakdownRuleService.queryReportCostBreakdownRule(rule);
        return ApiResult.ok(resultList);
    }

    /**
     * 查询默认的费用明细信息
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("查询默认的费用明细信息")
    @PostMapping("/queryDefaultReportCostBreakdownRule")
    public ApiResult<List<ReportCostBreakdownRuleDTO>> queryDefaultReportCostBreakdownRule() throws Exception {
        List<ReportCostBreakdownRuleDTO> resultList = reportCostBreakdownRuleService.queryDefaultReportCostBreakdownRule();
        return ApiResult.ok(resultList);
    }
}