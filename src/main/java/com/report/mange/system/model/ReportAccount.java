package com.report.mange.system.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "report_account")
public class ReportAccount {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 用户账号ID
     */
    @Column(name = "user_acct_id")
    private Long userAcctId;

    /**
     * 上级账号ID
     */
    @Column(name = "par_acct_id")
    private Long parAcctId;

    /**
     * 用户账号名称
     */
    @Column(name = "u_account_name")
    private String uAccountName;

    /**
     * 用户密码
     */
    @Column(name = "u_password")
    private String uPassword;

    /**
     * 用户锁定状态：0：未锁定，1：已锁定
     */
    @Column(name = "u_locked")
    private String uLocked;

    /**
     * 用户描述
     */
    @Column(name = "u_description")
    private String uDescription;

    /**
     * 账号类型：0：临时用户；1：长期用户
     */
    @Column(name = "u_account_type")
    private String uAccountType;

    /**
     * 账号状态。0：正常；1：锁定；2：冻结；3；禁用；4：注销；5：驳回；6：待审核
     */
    @Column(name = "u_account_status")
    private String uAccountStatus;

    /**
     * 组织机构ID
     */
    @Column(name = "org_id")
    private Long orgId;

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
     * 获取用户账号ID
     *
     * @return user_acct_id - 用户账号ID
     */
    public Long getUserAcctId() {
        return userAcctId;
    }

    /**
     * 设置用户账号ID
     *
     * @param userAcctId 用户账号ID
     */
    public void setUserAcctId(Long userAcctId) {
        this.userAcctId = userAcctId;
    }

    /**
     * 获取上级账号ID
     *
     * @return par_acct_id - 上级账号ID
     */
    public Long getParAcctId() {
        return parAcctId;
    }

    /**
     * 设置上级账号ID
     *
     * @param parAcctId 上级账号ID
     */
    public void setParAcctId(Long parAcctId) {
        this.parAcctId = parAcctId;
    }

    /**
     * 获取用户账号名称
     *
     * @return u_account_name - 用户账号名称
     */
    public String getuAccountName() {
        return uAccountName;
    }

    /**
     * 设置用户账号名称
     *
     * @param uAccountName 用户账号名称
     */
    public void setuAccountName(String uAccountName) {
        this.uAccountName = uAccountName;
    }

    /**
     * 获取用户密码
     *
     * @return u_password - 用户密码
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 设置用户密码
     *
     * @param uPassword 用户密码
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * 获取用户锁定状态：0：未锁定，1：已锁定
     *
     * @return u_locked - 用户锁定状态：0：未锁定，1：已锁定
     */
    public String getuLocked() {
        return uLocked;
    }

    /**
     * 设置用户锁定状态：0：未锁定，1：已锁定
     *
     * @param uLocked 用户锁定状态：0：未锁定，1：已锁定
     */
    public void setuLocked(String uLocked) {
        this.uLocked = uLocked == null ? null : uLocked.trim();
    }

    /**
     * 获取用户描述
     *
     * @return u_description - 用户描述
     */
    public String getuDescription() {
        return uDescription;
    }

    /**
     * 设置用户描述
     *
     * @param uDescription 用户描述
     */
    public void setuDescription(String uDescription) {
        this.uDescription = uDescription == null ? null : uDescription.trim();
    }

    /**
     * 获取账号类型：0：临时用户；1：长期用户
     *
     * @return u_account_type - 账号类型：0：临时用户；1：长期用户
     */
    public String getuAccountType() {
        return uAccountType;
    }

    /**
     * 设置账号类型：0：临时用户；1：长期用户
     *
     * @param uAccountType 账号类型：0：临时用户；1：长期用户
     */
    public void setuAccountType(String uAccountType) {
        this.uAccountType = uAccountType == null ? null : uAccountType.trim();
    }

    /**
     * 获取账号状态。0：正常；1：锁定；2：冻结；3；禁用；4：注销；5：驳回；6：待审核
     *
     * @return u_account_status - 账号状态。0：正常；1：锁定；2：冻结；3；禁用；4：注销；5：驳回；6：待审核
     */
    public String getuAccountStatus() {
        return uAccountStatus;
    }

    /**
     * 设置账号状态。0：正常；1：锁定；2：冻结；3；禁用；4：注销；5：驳回；6：待审核
     *
     * @param uAccountStatus 账号状态。0：正常；1：锁定；2：冻结；3；禁用；4：注销；5：驳回；6：待审核
     */
    public void setuAccountStatus(String uAccountStatus) {
        this.uAccountStatus = uAccountStatus == null ? null : uAccountStatus.trim();
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