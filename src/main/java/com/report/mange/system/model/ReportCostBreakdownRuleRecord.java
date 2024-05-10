package com.report.mange.system.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "report_cost_breakdown_rule_record")
public class ReportCostBreakdownRuleRecord {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 费用规则id
     */
    @Column(name = "fee_rule_id")
    private Long feeRuleId;

    /**
     * 合同ID
     */
    @Column(name = "con_id")
    private Long conId;


    /**
     * 费用规则code
     */
    @Column(name = "record_code")
    private String recordCode;

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
     * 标准占比
     */
    @Column(name = "standard_proportion")
    private String standardProportion;

    /**
     * 预算占比
     */
    @Column(name = "budget_proportion")
    private String budgetProportion;

    /**
     * 金额
     */
    private String amount;

    /**
     * 组织机构id
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 逻辑删除 1.是，0.否
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取费用规则id
     *
     * @return fee_rule_id - 费用规则id
     */
    public Long getFeeRuleId() {
        return feeRuleId;
    }

    /**
     * 设置费用规则id
     *
     * @param feeRuleId 费用规则id
     */
    public void setFeeRuleId(Long feeRuleId) {
        this.feeRuleId = feeRuleId;
    }

    /**
     * 获取合同ID
     *
     * @return con_id - 合同ID
     */
    public Long getConId() {
        return conId;
    }

    /**
     * 设置合同ID
     *
     * @param conId 合同ID
     */
    public void setConId(Long conId) {
        this.conId = conId;
    }

    /**
     * 获取费用规则code
     *
     * @return fee_rule_code - 费用规则code
     */
    public String getFeeRuleCode() {
        return feeRuleCode;
    }

    /**
     * 设置费用规则code
     *
     * @param feeRuleCode 费用规则code
     */
    public void setFeeRuleCode(String feeRuleCode) {
        this.feeRuleCode = feeRuleCode == null ? null : feeRuleCode.trim();
    }

    /**
     * 获取系统科目
     *
     * @return system_subject - 系统科目
     */
    public String getSystemSubject() {
        return systemSubject;
    }

    /**
     * 设置系统科目
     *
     * @param systemSubject 系统科目
     */
    public void setSystemSubject(String systemSubject) {
        this.systemSubject = systemSubject == null ? null : systemSubject.trim();
    }

    /**
     * 获取标准占比
     *
     * @return standard_proportion - 标准占比
     */
    public String getStandardProportion() {
        return standardProportion;
    }

    /**
     * 设置标准占比
     *
     * @param standardProportion 标准占比
     */
    public void setStandardProportion(String standardProportion) {
        this.standardProportion = standardProportion == null ? null : standardProportion.trim();
    }

    /**
     * 获取预算占比
     *
     * @return budget_proportion - 预算占比
     */
    public String getBudgetProportion() {
        return budgetProportion;
    }

    /**
     * 设置预算占比
     *
     * @param budgetProportion 预算占比
     */
    public void setBudgetProportion(String budgetProportion) {
        this.budgetProportion = budgetProportion == null ? null : budgetProportion.trim();
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    /**
     * 获取组织机构id
     *
     * @return org_code - 组织机构id
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置组织机构id
     *
     * @param orgCode 组织机构id
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取逻辑删除 1.是，0.否
     *
     * @return is_deleted - 逻辑删除 1.是，0.否
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置逻辑删除 1.是，0.否
     *
     * @param isDeleted 逻辑删除 1.是，0.否
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }
}