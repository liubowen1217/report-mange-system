package com.report.mange.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "report_con")
public class ReportCon {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 合同ID
     */
    @Column(name = "con_id")
    private Long conId;

    /**
     * 合同名称
     */
    @Column(name = "con_name")
    private String conName;

    /**
     * 合同编号
     */
    @Column(name = "con_code")
    private String conCode;

    /**
     * 合同类型1
     */
    @Column(name = "con_type1")
    private Integer conType1;

    /**
     * 合同类型2
     */
    @Column(name = "con_type2")
    private Integer conType2;

    /**
     * 项目报备号
     */
    @Column(name = "project_report_code")
    private String projectReportCode;

    /**
     * 合同所属年份
     */
    @Column(name = "con_year")
    private Integer conYear;

    /**
     * 合同备案日期
     */
    @Column(name = "con_filing_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date conFilingDate;

    /**
     * 合同签约日期
     */
    @Column(name = "project_sign_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date projectSignDate;

    /**
     * 业务板块
     */
    @Column(name = "business_segments")
    private String businessSegments;

    /**
     * 对方单位名称
     */
    @Column(name = "opposite_org_name")
    private String oppositeOrgName;

    /**
     * 对方单位编码
     */
    @Column(name = "opposite_org_code")
    private String oppositeOrgCode;

    /**
     * 价税合计合同金额
     */
    @Column(name = "tax_amt")
    private String taxAmt;

    /**
     * 上交利润比例
     */
    @Column(name = "submit_profit_rate")
    private String submitProfitRate;

    /**
     * 预算分包合同金额
     */
    @Column(name = "budget_subcontract_amt")
    private String budgetSubcontractAmt;

    /**
     * 签约部门
     */
    @Column(name = "sign_department")
    private String signDepartment;

    /**
     * 经营主图
     */
    @Column(name = "business_map")
    private String businessMap;

    /**
     * 地址
     */
    @Column(name = "org_address")
    private String orgAddress;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取合同名称
     *
     * @return con_name - 合同名称
     */
    public String getConName() {
        return conName;
    }

    /**
     * 设置合同名称
     *
     * @param conName 合同名称
     */
    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    /**
     * 获取合同编号
     *
     * @return con_code - 合同编号
     */
    public String getConCode() {
        return conCode;
    }

    /**
     * 设置合同编号
     *
     * @param conCode 合同编号
     */
    public void setConCode(String conCode) {
        this.conCode = conCode == null ? null : conCode.trim();
    }

    /**
     * 获取合同类型1
     *
     * @return con_type1 - 合同类型1
     */
    public Integer getConType1() {
        return conType1;
    }

    /**
     * 设置合同类型1
     *
     * @param conType1 合同类型1
     */
    public void setConType1(Integer conType1) {
        this.conType1 = conType1;
    }

    /**
     * 获取合同类型2
     *
     * @return con_type2 - 合同类型2
     */
    public Integer getConType2() {
        return conType2;
    }

    /**
     * 设置合同类型2
     *
     * @param conType2 合同类型2
     */
    public void setConType2(Integer conType2) {
        this.conType2 = conType2;
    }

    /**
     * 获取项目报备号
     *
     * @return project_report_code - 项目报备号
     */
    public String getProjectReportCode() {
        return projectReportCode;
    }

    /**
     * 设置项目报备号
     *
     * @param projectReportCode 项目报备号
     */
    public void setProjectReportCode(String projectReportCode) {
        this.projectReportCode = projectReportCode == null ? null : projectReportCode.trim();
    }

    /**
     * 获取合同所属年份
     *
     * @return con_year - 合同所属年份
     */
    public Integer getConYear() {
        return conYear;
    }

    /**
     * 设置合同所属年份
     *
     * @param conYear 合同所属年份
     */
    public void setConYear(Integer conYear) {
        this.conYear = conYear;
    }

    /**
     * 获取合同备案日期
     *
     * @return con_filing_date - 合同备案日期
     */
    public Date getConFilingDate() {
        return conFilingDate;
    }

    /**
     * 设置合同备案日期
     *
     * @param conFilingDate 合同备案日期
     */
    public void setConFilingDate(Date conFilingDate) {
        this.conFilingDate = conFilingDate;
    }

    /**
     * 获取合同签约日期
     *
     * @return project_sign_date - 合同签约日期
     */
    public Date getProjectSignDate() {
        return projectSignDate;
    }

    /**
     * 设置合同签约日期
     *
     * @param projectSignDate 合同签约日期
     */
    public void setProjectSignDate(Date projectSignDate) {
        this.projectSignDate = projectSignDate;
    }

    /**
     * 获取业务板块
     *
     * @return business_segments - 业务板块
     */
    public String getBusinessSegments() {
        return businessSegments;
    }

    /**
     * 设置业务板块
     *
     * @param businessSegments 业务板块
     */
    public void setBusinessSegments(String businessSegments) {
        this.businessSegments = businessSegments == null ? null : businessSegments.trim();
    }

    /**
     * 获取对方单位名称
     *
     * @return opposite_org_name - 对方单位名称
     */
    public String getOppositeOrgName() {
        return oppositeOrgName;
    }

    /**
     * 设置对方单位名称
     *
     * @param oppositeOrgName 对方单位名称
     */
    public void setOppositeOrgName(String oppositeOrgName) {
        this.oppositeOrgName = oppositeOrgName == null ? null : oppositeOrgName.trim();
    }

    /**
     * 获取对方单位编码
     *
     * @return opposite_org_code - 对方单位编码
     */
    public String getOppositeOrgCode() {
        return oppositeOrgCode;
    }

    /**
     * 设置对方单位编码
     *
     * @param oppositeOrgCode 对方单位编码
     */
    public void setOppositeOrgCode(String oppositeOrgCode) {
        this.oppositeOrgCode = oppositeOrgCode == null ? null : oppositeOrgCode.trim();
    }

    /**
     * 获取价税合计合同金额
     *
     * @return tax_amt - 价税合计合同金额
     */
    public String getTaxAmt() {
        return taxAmt;
    }

    /**
     * 设置价税合计合同金额
     *
     * @param taxAmt 价税合计合同金额
     */
    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt == null ? null : taxAmt.trim();
    }

    /**
     * 获取上交利润比例
     *
     * @return submit_profit_rate - 上交利润比例
     */
    public String getSubmitProfitRate() {
        return submitProfitRate;
    }

    /**
     * 设置上交利润比例
     *
     * @param submitProfitRate 上交利润比例
     */
    public void setSubmitProfitRate(String submitProfitRate) {
        this.submitProfitRate = submitProfitRate == null ? null : submitProfitRate.trim();
    }

    /**
     * 获取预算分包合同金额
     *
     * @return budget_subcontract_amt - 预算分包合同金额
     */
    public String getBudgetSubcontractAmt() {
        return budgetSubcontractAmt;
    }

    /**
     * 设置预算分包合同金额
     *
     * @param budgetSubcontractAmt 预算分包合同金额
     */
    public void setBudgetSubcontractAmt(String budgetSubcontractAmt) {
        this.budgetSubcontractAmt = budgetSubcontractAmt == null ? null : budgetSubcontractAmt.trim();
    }

    /**
     * 获取签约部门
     *
     * @return sign_department - 签约部门
     */
    public String getSignDepartment() {
        return signDepartment;
    }

    /**
     * 设置签约部门
     *
     * @param signDepartment 签约部门
     */
    public void setSignDepartment(String signDepartment) {
        this.signDepartment = signDepartment == null ? null : signDepartment.trim();
    }

    /**
     * 获取经营主图
     *
     * @return business_map - 经营主图
     */
    public String getBusinessMap() {
        return businessMap;
    }

    /**
     * 设置经营主图
     *
     * @param businessMap 经营主图
     */
    public void setBusinessMap(String businessMap) {
        this.businessMap = businessMap == null ? null : businessMap.trim();
    }

    /**
     * 获取地址
     *
     * @return org_address - 地址
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * 设置地址
     *
     * @param orgAddress 地址
     */
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}