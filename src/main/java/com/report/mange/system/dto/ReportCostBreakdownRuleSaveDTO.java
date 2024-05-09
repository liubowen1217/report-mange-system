package com.report.mange.system.dto;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "report_cost_breakdown_rule")
public class ReportCostBreakdownRuleSaveDTO {

    /**
     * 合同ID
     */
    private Long conId;

    /**
     * 费用规则明细
     */
    private List<ReportCostBreakdownRuleVO> reportCostBreakdownRule;

    public Long getConId() {
        return conId;
    }

    public void setConId(Long conId) {
        this.conId = conId;
    }

    public List<ReportCostBreakdownRuleVO> getReportCostBreakdownRule() {
        return reportCostBreakdownRule;
    }

    public void setReportCostBreakdownRule(List<ReportCostBreakdownRuleVO> reportCostBreakdownRule) {
        this.reportCostBreakdownRule = reportCostBreakdownRule;
    }
}