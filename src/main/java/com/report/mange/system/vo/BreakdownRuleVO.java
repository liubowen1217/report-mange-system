package com.report.mange.system.vo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "report_cost_breakdown_rule_record")
public class BreakdownRuleVO {

    /**
     * 费用规则code
     */
    @Column(name = "fee_rule_code")
    private String feeRuleCode;

    /**
     * 系统科目
     */
    @Column(name = "system_subject")
    private String systemSubject;

    /**
     * 是否有下级
     */
    @Column(name = "is_level")
    private String isLevel;


    public String getFeeRuleCode() {
        return feeRuleCode;
    }

    public void setFeeRuleCode(String feeRuleCode) {
        this.feeRuleCode = feeRuleCode;
    }

    public String getSystemSubject() {
        return systemSubject;
    }

    public void setSystemSubject(String systemSubject) {
        this.systemSubject = systemSubject;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }
}