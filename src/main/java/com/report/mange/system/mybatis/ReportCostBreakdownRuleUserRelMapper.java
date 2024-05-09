package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCostBreakdownRuleUserRel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleUserRelMapper extends Mapper<ReportCostBreakdownRuleUserRel> {
    List<String> queryReportCostBreakdownRuleUser(@Param("feeRuleDetailId") Long feeRuleDetailId);

    Integer saveReportCostBreakdownRuleUserRelAdd(ReportCostBreakdownRuleUserRel rel);


}