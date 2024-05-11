package com.report.mange.system.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "report_cost_breakdown_rule_detail")
public class ReportCostBreakdownRuleDetailDTO {

    @Id
    private Long id;

    /**
     * 费用规则明细id
     */
    @Column(name = "fee_rule_detail_id")
    private Long feeRuleDetailId;

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
     * 标准占比
     */
    @Column(name = "sub_standard_proportion")
    private String subStandardProportion;

    /**
     * 预算占比
     */
    @Column(name = "sub_budget_proportion")
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
     * 人员名称
     */
    private String userName;


    /**
     * 单位名称
     */
    private String deptName;

    /**
     * 人员列表
     */
    List<String> userList = new ArrayList<>();
    /**
     * 部门列表
     */
    List<String> deptList= new ArrayList<>();

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public Long getSubFeeRuleCode() {
        return subFeeRuleCode;
    }

    public void setSubFeeRuleCode(Long subFeeRuleCode) {
        this.subFeeRuleCode = subFeeRuleCode;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }
}