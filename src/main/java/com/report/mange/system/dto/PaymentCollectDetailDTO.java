package com.report.mange.system.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

public class PaymentCollectDetailDTO {
    @Id
    private Long id;

    /**
     * 费用规则id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long feeRuleId;

    /**
     * 上级费用规则id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long pFeeRuleId;

    /**
     * 回款明细ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long paymentId;


    /**
     * 合同ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long conId;

    /**
     * 费用规则code
     */
    private String feeRuleCode;

    /**
     * 系统科目
     */
    private String systemSubject;

    /**
     * 标准占比
     */
    private String standardProportion;

    /**
     * 预算占比
     */
    private String budgetProportion;

    /**
     * 金额
     */
    private String amount;


    /**
     * 回款金额
     */
    private String allocatAmount;

    /**
     * 组织机构id
     */
    private String orgId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 部门名称
     */
    private String pDeptName;


    /**
     * 人员名称
     */
    private String pUserName;

    /**
     * 是否有下级
     */
    @Column(name = "is_level")
    private String isLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFeeRuleId() {
        return feeRuleId;
    }

    public void setFeeRuleId(Long feeRuleId) {
        this.feeRuleId = feeRuleId;
    }

    public Long getpFeeRuleId() {
        return pFeeRuleId;
    }

    public void setpFeeRuleId(Long pFeeRuleId) {
        this.pFeeRuleId = pFeeRuleId;
    }

    public Long getConId() {
        return conId;
    }

    public void setConId(Long conId) {
        this.conId = conId;
    }

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

    public String getStandardProportion() {
        return standardProportion;
    }

    public void setStandardProportion(String standardProportion) {
        this.standardProportion = standardProportion;
    }

    public String getBudgetProportion() {
        return budgetProportion;
    }

    public void setBudgetProportion(String budgetProportion) {
        this.budgetProportion = budgetProportion;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAllocatAmount() {
        return allocatAmount;
    }

    public void setAllocatAmount(String allocatAmount) {
        this.allocatAmount = allocatAmount;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getpDeptName() {
        return pDeptName;
    }

    public void setpDeptName(String pDeptName) {
        this.pDeptName = pDeptName;
    }

    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
}