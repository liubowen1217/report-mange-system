package com.report.mange.system.mybatis;


import com.report.mange.system.dto.AdjustingRecordDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleRecord;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleRecordMapper extends Mapper<ReportCostBreakdownRuleRecord> {

    Integer saveReportCostBreakdownRuleRecordAdd(ReportCostBreakdownRuleRecord ruleRecord);

    List<AdjustingRecordDTO> queryAdjustingRecords(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryReportCostBreakdownRecordRule(ReportCostBreakdownRuleRecord rule1);

}