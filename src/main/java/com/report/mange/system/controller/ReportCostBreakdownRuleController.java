package com.report.mange.system.controller;

import com.report.mange.system.dto.AdjustingRecordDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleSaveDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleRecord;
import com.report.mange.system.service.ReportCostBreakdownRuleService;
import com.report.mange.system.utils.ApiResult;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import com.report.mange.system.vo.BreakdownRuleVO;
import com.report.mange.system.vo.ReportDeptVO;
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
            e.printStackTrace();
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


    /**
     * 查询调整记录
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("查询调整记录")
    @PostMapping("/queryAdjustingRecords")
    public ApiResult<List<AdjustingRecordDTO>> queryAdjustingRecords(@RequestBody ReportCostBreakdownRule rule) throws Exception {
        List<AdjustingRecordDTO> resultList = reportCostBreakdownRuleService.queryAdjustingRecords(rule);
        return ApiResult.ok(resultList);
    }


    /**
     * 查询变更费用明细信息
     *
     * @return
     * @throws Exception
     */
    @ApiOperation("查询变更费用明细信息")
    @PostMapping("/queryAdjustingRecordDetail")
    public ApiResult<List<ReportCostBreakdownRuleDTO>> queryAdjustingRecordDetail(@RequestBody ReportCostBreakdownRuleRecord rule) throws Exception {
        List<ReportCostBreakdownRuleDTO> resultList = reportCostBreakdownRuleService.queryAdjustingRecordDetail(rule);
        return ApiResult.ok(resultList);
    }


    /**
     * @Description: 查询费用规则下拉
     */
    @ApiOperation("查询系统科目下拉")
    @PostMapping("/queryBreakdownRuleDrop")
    public ApiResult<List<BreakdownRuleVO>> queryBreakdownRuleDrop() throws Exception {
        List<BreakdownRuleVO> list = reportCostBreakdownRuleService.queryBreakdownRuleDrop();
        return ApiResult.ok(list);
    }

    /**
     * @Description: 查询费用明细下拉
     */
    @ApiOperation("查询二级系统科目下拉")
    @PostMapping("/queryBreakdownRuleDetailDrop")
    public ApiResult<List<BreakdownRuleDetailVO>> queryBreakdownRuleDetailDrop(@RequestBody ReportCostBreakdownRule rule) throws Exception {
        List<BreakdownRuleDetailVO> list = reportCostBreakdownRuleService.queryBreakdownRuleDetailDrop(rule);
        return ApiResult.ok(list);
    }
}