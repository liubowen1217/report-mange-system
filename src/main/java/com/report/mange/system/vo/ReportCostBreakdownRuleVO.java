package com.report.mange.system.vo;

import com.report.mange.system.dto.ReportCostBreakdownRuleDetailVO;
import com.report.mange.system.model.ReportCostBreakdownRuleDetail;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Table(name = "report_cost_breakdown_rule")
public class ReportCostBreakdownRuleVO {
    @Id
    private Long id;

    /**
     * 费用规则id
     */
    private Long feeRuleId;

    /**
     * 合同ID
     */
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
     * 组织机构id
     */
    private String orgId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 费用规则明细
     */
    List<ReportCostBreakdownRuleDetailVO> detailList;


    /**
     * 是否有下级
     */
    @Column(name = "is_level")
    private String isLevel;


    /**
     * 人员列表
     */
    List<String> pUserList = new ArrayList<>();
    /**
     * 部门列表
     */
    List<String> pDeptList= new ArrayList<>();


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

    public List<ReportCostBreakdownRuleDetailVO> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<ReportCostBreakdownRuleDetailVO> detailList) {
        this.detailList = detailList;
    }

    public String getIsLevel() {
        return isLevel;
    }

    public void setIsLevel(String isLevel) {
        this.isLevel = isLevel;
    }

    public List<String> getpUserList() {
        return pUserList;
    }

    public void setpUserList(List<String> pUserList) {
        this.pUserList = pUserList;
    }

    public List<String> getpDeptList() {
        return pDeptList;
    }

    public void setpDeptList(List<String> pDeptList) {
        this.pDeptList = pDeptList;
    }
}