package com.report.mange.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "payment_collect_result")
public class PaymentCollectResult {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 回款结果id
     */
    @Column(name = "payment_result_id")
    private Long paymentResultId;

    /**
     * 回款信息id
     */
    @Column(name = "payment_id")
    private Long paymentId;

    /**
     * 合同ID
     */
    @Column(name = "con_id")
    private Long conId;

    /**
     * 费用明细id
     */
    @Column(name = "fee_rule_id")
    private Long feeRuleId;

    /**
     * 分配金额
     */
    @Column(name = "allocat_amount")
    private String allocatAmount;

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
     * 获取回款结果id
     *
     * @return payment_result_id - 回款结果id
     */
    public Long getPaymentResultId() {
        return paymentResultId;
    }

    /**
     * 设置回款结果id
     *
     * @param paymentResultId 回款结果id
     */
    public void setPaymentResultId(Long paymentResultId) {
        this.paymentResultId = paymentResultId;
    }

    /**
     * 获取回款信息id
     *
     * @return payment_id - 回款信息id
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * 设置回款信息id
     *
     * @param paymentId 回款信息id
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
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
     * 获取费用明细id
     *
     * @return fee_rule_id - 费用明细id
     */
    public Long getFeeRuleId() {
        return feeRuleId;
    }

    /**
     * 设置费用明细id
     *
     * @param feeRuleId 费用明细id
     */
    public void setFeeRuleId(Long feeRuleId) {
        this.feeRuleId = feeRuleId;
    }

    /**
     * 获取分配金额
     *
     * @return allocat_amount - 分配金额
     */
    public String getAllocatAmount() {
        return allocatAmount;
    }

    /**
     * 设置分配金额
     *
     * @param allocatAmount 分配金额
     */
    public void setAllocatAmount(String allocatAmount) {
        this.allocatAmount = allocatAmount == null ? null : allocatAmount.trim();
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
}