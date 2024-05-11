package com.report.mange.system.mybatis;


import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.vo.BreakdownRuleVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleMapper extends Mapper<ReportCostBreakdownRule> {

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryReportCostBreakdownRule(ReportCostBreakdownRule rule);

    Integer saveReportCostBreakdownRuleDel(@Param("conId") Long conId);

    Integer saveReportCostBreakdownRuleAdd(ReportCostBreakdownRule rule);

    List<BreakdownRuleVO> queryBreakdownRuleDrop();
}