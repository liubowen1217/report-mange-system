package com.report.mange.system.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "report_cost_breakdown_rule_detail_record")
public class ReportCostBreakdownRuleDetailRecord {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 费用规则明细id
     */
    @Column(name = "fee_rule_detail_id")
    private Long feeRuleDetailId;

    /**
     * 费用规则id
     */
    @Column(name = "fee_rule_id")
    private Long feeRuleId;

    /**
     * 费用规则code
     */
    @Column(name = "record_code")
    private String recordCode;

    /**
     * 费用规则明细编码
     */
    @Column(name = "sub_fee_rule_code")
    private Long subFeeRuleCode;

    /**
     * 合同ID
     */
    @Column(name = "con_id")
    private Long conId;

    /**
     * 明细系统科目
     */
    @Column(name = "sub_system_subject")
    private String subSystemSubject;

    /**
     * 明细标准占比
     */
    @Column(name = "sub_standard_proportion")
    private String subStandardProportion;

    /**
     * 明细预算占比
     */
    @Column(name = "sub_budget_proportion")
    private String subBudgetProportion;

    /**
     * 明细金额
     */
    @Column(name = "sub_amount")
    private String subAmount;

    /**
     * 组织机构id
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 明细备注
     */
    @Column(name = "sub_remark")
    private String subRemark;

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
     * 获取费用规则明细id
     *
     * @return fee_rule_detail_id - 费用规则明细id
     */
    public Long getFeeRuleDetailId() {
        return feeRuleDetailId;
    }

    /**
     * 设置费用规则明细id
     *
     * @param feeRuleDetailId 费用规则明细id
     */
    public void setFeeRuleDetailId(Long feeRuleDetailId) {
        this.feeRuleDetailId = feeRuleDetailId;
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
     * 获取明细系统科目
     *
     * @return sub_system_subject - 明细系统科目
     */
    public String getSubSystemSubject() {
        return subSystemSubject;
    }

    /**
     * 设置明细系统科目
     *
     * @param subSystemSubject 明细系统科目
     */
    public void setSubSystemSubject(String subSystemSubject) {
        this.subSystemSubject = subSystemSubject == null ? null : subSystemSubject.trim();
    }

    /**
     * 获取明细标准占比
     *
     * @return sub_standard_proportion - 明细标准占比
     */
    public String getSubStandardProportion() {
        return subStandardProportion;
    }

    /**
     * 设置明细标准占比
     *
     * @param subStandardProportion 明细标准占比
     */
    public void setSubStandardProportion(String subStandardProportion) {
        this.subStandardProportion = subStandardProportion == null ? null : subStandardProportion.trim();
    }

    /**
     * 获取明细预算占比
     *
     * @return sub_budget_proportion - 明细预算占比
     */
    public String getSubBudgetProportion() {
        return subBudgetProportion;
    }

    /**
     * 设置明细预算占比
     *
     * @param subBudgetProportion 明细预算占比
     */
    public void setSubBudgetProportion(String subBudgetProportion) {
        this.subBudgetProportion = subBudgetProportion == null ? null : subBudgetProportion.trim();
    }

    /**
     * 获取明细金额
     *
     * @return sub_amount - 明细金额
     */
    public String getSubAmount() {
        return subAmount;
    }

    /**
     * 设置明细金额
     *
     * @param subAmount 明细金额
     */
    public void setSubAmount(String subAmount) {
        this.subAmount = subAmount == null ? null : subAmount.trim();
    }

    /**
     * 获取组织机构id
     *
     * @return org_id - 组织机构id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构id
     *
     * @param orgId 组织机构id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取明细备注
     *
     * @return sub_remark - 明细备注
     */
    public String getSubRemark() {
        return subRemark;
    }

    /**
     * 设置明细备注
     *
     * @param subRemark 明细备注
     */
    public void setSubRemark(String subRemark) {
        this.subRemark = subRemark == null ? null : subRemark.trim();
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

    public Long getSubFeeRuleCode() {
        return subFeeRuleCode;
    }

    public void setSubFeeRuleCode(Long subFeeRuleCode) {
        this.subFeeRuleCode = subFeeRuleCode;
    }
}