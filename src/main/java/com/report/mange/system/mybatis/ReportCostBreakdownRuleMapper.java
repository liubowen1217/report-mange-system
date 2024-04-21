package com.report.mange.system.mybatis;


import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleMapper extends Mapper<ReportCostBreakdownRule> {

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule();
}