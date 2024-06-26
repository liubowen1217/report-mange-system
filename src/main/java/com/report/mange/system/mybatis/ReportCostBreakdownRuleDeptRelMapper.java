package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCostBreakdownRuleDeptRel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleDeptRelMapper extends Mapper<ReportCostBreakdownRuleDeptRel> {

    List<String> queryReportCostBreakdownRuleDept(@Param("ruleId") Long ruleId);

    Integer saveReportCostBreakdownRuleDeptRelAdd(ReportCostBreakdownRuleDeptRel deptRel);

    List<String> queryReportCostBreakdownRuleDeptId(@Param("ruleId") Long ruleId);

}