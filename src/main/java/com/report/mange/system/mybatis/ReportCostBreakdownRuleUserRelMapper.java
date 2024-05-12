package com.report.mange.system.mybatis;


import com.report.mange.system.dto.ReportUserDTO;
import com.report.mange.system.model.ReportCostBreakdownRuleUserRel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleUserRelMapper extends Mapper<ReportCostBreakdownRuleUserRel> {
    List<String> queryReportCostBreakdownRuleUser(@Param("ruleId") Long ruleId);

    Integer saveReportCostBreakdownRuleUserRelAdd(ReportCostBreakdownRuleUserRel rel);

    List<String> queryReportCostBreakdownRuleUserId(@Param("ruleId") Long ruleId);

    List<String> queryReportCostBreakdownRuleUserName(ReportUserDTO user);

}