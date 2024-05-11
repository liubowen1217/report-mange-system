package com.report.mange.system.vo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "report_cost_breakdown_rule_detail")
public class BreakdownRuleDetailVO {

    /**
     * 费用规则明细编码
     */
    @Column(name = "sub_fee_rule_code")
    private Long subFeeRuleCode;


    /**
     * 系统科目
     */
    @Column(name = "sub_system_subject")
    private String subSystemSubject;

    /**
     * 是否有下级
     */
    @Column(name = "is_level")
    private String isLevel;

    public Long getSubFeeRuleCode() {
        return subFeeRuleCode;
    }

    public void setSubFeeRuleCode(Long subFeeRuleCode) {
        this.subFeeRuleCode = subFeeRuleCode;
    }

    public String getSubSystemSubject() {
        return subSystemSubject;
    }

    public void setSubSystemSubject(String subSystemSubject) {
        this.subSystemSubject = subSystemSubject;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }
}