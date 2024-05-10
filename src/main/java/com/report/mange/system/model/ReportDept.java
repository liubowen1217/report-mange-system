package com.report.mange.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "report_dept")
public class ReportDept {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 单位ID
     */
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * 组织机构ID
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 单位编码
     */
    @Column(name = "dept_code")
    private String deptCode;

    /**
     * 单位名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 单位地址
     */
    @Column(name = "dept_addr")
    private String deptAddr;

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
     * 获取单位ID
     *
     * @return dept_id - 单位ID
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置单位ID
     *
     * @param deptId 单位ID
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取组织机构ID
     *
     * @return org_id - 组织机构ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构ID
     *
     * @param orgId 组织机构ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取单位编码
     *
     * @return dept_code - 单位编码
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置单位编码
     *
     * @param deptCode 单位编码
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取单位名称
     *
     * @return dept_name - 单位名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置单位名称
     *
     * @param deptName 单位名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取单位地址
     *
     * @return dept_addr - 单位地址
     */
    public String getDeptAddr() {
        return deptAddr;
    }

    /**
     * 设置单位地址
     *
     * @param deptAddr 单位地址
     */
    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr == null ? null : deptAddr.trim();
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