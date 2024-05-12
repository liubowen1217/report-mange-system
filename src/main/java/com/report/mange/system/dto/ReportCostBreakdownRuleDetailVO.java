package com.report.mange.system.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

public class ReportCostBreakdownRuleDetailVO {

    @Id
    private Long id;

    /**
     * 费用规则明细id
     */
    private Long feeRuleDetailId;

    /**
     * 费用规则明细编码
     */
    @Column(name = "sub_fee_rule_code")
    private String subFeeRuleCode;

    /**
     * 系统科目
     */
    private String subSystemSubject;

    /**
     * 标准占比
     */
    private String subStandardProportion;

    /**
     * 预算占比
     */
    private String subBudgetProportion;

    /**
     * 金额
     */
    private String subAmount;

    /**
     * 备注
     */
    private String subRemark;
    /**
     * 人员列表
     */
    List<String> userList;
    /**
     * 部门列表
     */
    List<String> deptList;

    /**
     * 是否有下级
     */
    @Column(name = "is_level")
    private String isLevel;

    public Long getFeeRuleDetailId() {
        return feeRuleDetailId;
    }

    public void setFeeRuleDetailId(Long feeRuleDetailId) {
        this.feeRuleDetailId = feeRuleDetailId;
    }

    public String getSubSystemSubject() {
        return subSystemSubject;
    }

    public void setSubSystemSubject(String subSystemSubject) {
        this.subSystemSubject = subSystemSubject;
    }

    public String getSubStandardProportion() {
        return subStandardProportion;
    }

    public void setSubStandardProportion(String subStandardProportion) {
        this.subStandardProportion = subStandardProportion;
    }

    public String getSubBudgetProportion() {
        return subBudgetProportion;
    }

    public void setSubBudgetProportion(String subBudgetProportion) {
        this.subBudgetProportion = subBudgetProportion;
    }

    public String getSubAmount() {
        return subAmount;
    }

    public void setSubAmount(String subAmount) {
        this.subAmount = subAmount;
    }

    public String getSubRemark() {
        return subRemark;
    }

    public void setSubRemark(String subRemark) {
        this.subRemark = subRemark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public List<String> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<String> deptList) {
        this.deptList = deptList;
    }

    public String getSubFeeRuleCode() {
        return subFeeRuleCode;
    }

    public void setSubFeeRuleCode(String subFeeRuleCode) {
        this.subFeeRuleCode = subFeeRuleCode;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }
}