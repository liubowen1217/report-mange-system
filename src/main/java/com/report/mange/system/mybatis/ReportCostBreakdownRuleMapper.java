package com.report.mange.system.mybatis;


import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;
import com.report.mange.system.dto.ReportCostBreakdownRuleDetailDTO;
import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleDetail;
import com.report.mange.system.vo.BreakdownRuleVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleMapper extends Mapper<ReportCostBreakdownRule> {

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRuleNew(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryReportCostBreakdownRule(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDTO> queryAllReportCostBreakdownRule(ReportCostBreakdownRule rule);

    List<ReportCostBreakdownRuleDetailDTO> queryDefaultReportCostBreakdownRuleDetailNew(ReportCostBreakdownRule rule);

    Integer saveReportCostBreakdownRuleDel(@Param("conId") Long conId);

    Integer saveReportCostBreakdownRuleAdd(ReportCostBreakdownRule rule);

    Integer saveReportCostBreakdownRuleModify(@Param("conId") Long conId);

    List<ReportCostBreakdownRuleDetail> queryReportCostBreakdownRuleDetail(ReportCostBreakdownRule ruleDetail);
}