package com.report.mange.system.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

public class PaymentCollectInfoDTO {
    /**
     * 主键
     */
    @Id
    private Long id;

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
     * 期数
     */
    @Column(name = "period_number")
    private String periodNumber;

    /**
     * 金额
     */
    private String amount;

    /**
     * 回款单位
     */
    @Column(name = "collect_dept")
    private String collectDept;

    /**
     * 到账日期
     */
    @Column(name = "receipt_date")
    private Date receiptDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 逻辑删除 1.是，0.否
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

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
     * 部门列表
     */
    List<String> deptList;

    /**
     * 部门名称
     */
    private String deptName;

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
     * 获取期数
     *
     * @return period_number - 期数
     */
    public String getPeriodNumber() {
        return periodNumber;
    }

    /**
     * 设置期数
     *
     * @param periodNumber 期数
     */
    public void setPeriodNumber(String periodNumber) {
        this.periodNumber = periodNumber == null ? null : periodNumber.trim();
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
     * 获取回款单位
     *
     * @return collect_dept - 回款单位
     */
    public String getCollectDept() {
        return collectDept;
    }

    /**
     * 设置回款单位
     *
     * @param collectDept 回款单位
     */
    public void setCollectDept(String collectDept) {
        this.collectDept = collectDept == null ? null : collectDept.trim();
    }

    /**
     * 获取到账日期
     *
     * @return receipt_date - 到账日期
     */
    public Date getReceiptDate() {
        return receiptDate;
    }

    /**
     * 设置到账日期
     *
     * @param receiptDate 到账日期
     */
    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
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
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置逻辑删除 1.是，0.否
     *
     * @param isDeleted 逻辑删除 1.是，0.否
     */
    public void setIsDeleted(Integer isDeleted) {
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

    public List<String> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<String> deptList) {
        this.deptList = deptList;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}