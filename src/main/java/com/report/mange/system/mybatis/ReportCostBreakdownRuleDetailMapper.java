package com.report.mange.system.mybatis;


import com.report.mange.system.model.ReportCostBreakdownRule;
import com.report.mange.system.model.ReportCostBreakdownRuleDetail;
import com.report.mange.system.vo.BreakdownRuleDetailVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportCostBreakdownRuleDetailMapper extends Mapper<ReportCostBreakdownRuleDetail> {

    List<ReportCostBreakdownRuleDetail> queryReportCostBreakdownRuleDetail(ReportCostBreakdownRuleDetail detail);

    Integer saveReportCostBreakdownRuleDetailDel(@Param("conId") Long conId);


    Integer saveReportCostBreakdownRuleDetailAdd(ReportCostBreakdownRuleDetail detail);

    List<BreakdownRuleDetailVO> queryBreakdownRuleDetailDrop(ReportCostBreakdownRule rule);
}