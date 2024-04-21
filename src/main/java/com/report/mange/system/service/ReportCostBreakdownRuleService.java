package com.report.mange.system.service;

import com.report.mange.system.dto.ReportCostBreakdownRuleDTO;

import java.util.List;

/**
 * @author 刘博文
 * @Description: ReportCostBreakdownRuleService接口
 * @date 2024/04/17 19:27
 */
public interface ReportCostBreakdownRuleService {

    List<ReportCostBreakdownRuleDTO> queryDefaultReportCostBreakdownRule();

}