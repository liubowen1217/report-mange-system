package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleDetailRecord;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleDetailRecordMapper extends Mapper<ReportCostBreakdownRuleDetailRecord> {

    Integer saveReportCostBreakdownRuleDetailRecordAdd(ReportCostBreakdownRuleDetailRecord detailRecord);


    List<ReportCostBreakdownRuleDetailRecord> queryReportCostBreakdownRuleDetailRecord(ReportCostBreakdownRuleDetailRecord ruleDetail);

    List<ReportCostBreakdownRuleDetailRecord> queryReportCostBreakdownRuleDetailRecordNew(ReportCostBreakdownRule rule);

}