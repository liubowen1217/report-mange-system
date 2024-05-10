package com.report.mange.system.service;

import com.report.mange.system.dto.AdjustingRecordDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleSaveDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleRecord;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import com.report.mange.system.vo.BreakdownRuleVO;
import com.report.mange.system.vo.ReportDeptVO;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleService接口
 * @date 2024/04/17 19:27
 */
public interface ReportCostBreakdownRuleService {

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule();

    List<ReportCostBreakdownRuleDTO> queryReportCostBreakdownRule(ReportCostBreakdownRule rule);

    Integer saveReportCostBreakdownRuleAdd(ReportCostBreakdownRuleSaveDTO reportCostBreakdownRule);


    List<AdjustingRecordDTO> queryAdjustingRecords(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryAdjustingRecordDetail(ReportCostBreakdownRuleRecord rule);

    List<BreakdownRuleVO> queryBreakdownRuleDrop();

    List<BreakdownRuleDetailVO> queryBreakdownRuleDetailDrop(ReportCostBreakdownRule rule);

}