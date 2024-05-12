package com.report.mange.system.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "report_user")
public class ReportUserDTO {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 系统科目ID
     */
    private Long ruleId;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 用户的性别：0：女，1男
     */
    @Column(name = "u_sex")
    private Byte uSex;

    /**
     * 用户生日
     */
    @Column(name = "u_birthday")
    private String uBirthday;

    /**
     * 用户电话
     */
    @Column(name = "u_telephone")
    private String uTelephone;

    /**
     * 用户邮箱
     */
    @Column(name = "u_email")
    private String uEmail;

    /**
     * 用户居住地
     */
    @Column(name = "u_address")
    private String uAddress;

    /**
     * 用户真实姓名
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 证件类型  0：身份证 1：护照  2：军官证  3：工作证
     */
    @Column(name = "u_idtype")
    private String uIdtype;

    /**
     * 用户证件号
     */
    @Column(name = "u_idcard")
    private String uIdcard;

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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户的性别：0：女，1男
     *
     * @return u_sex - 用户的性别：0：女，1男
     */
    public Byte getuSex() {
        return uSex;
    }

    /**
     * 设置用户的性别：0：女，1男
     *
     * @param uSex 用户的性别：0：女，1男
     */
    public void setuSex(Byte uSex) {
        this.uSex = uSex;
    }

    /**
     * 获取用户生日
     *
     * @return u_birthday - 用户生日
     */
    public String getuBirthday() {
        return uBirthday;
    }

    /**
     * 设置用户生日
     *
     * @param uBirthday 用户生日
     */
    public void setuBirthday(String uBirthday) {
        this.uBirthday = uBirthday == null ? null : uBirthday.trim();
    }

    /**
     * 获取用户电话
     *
     * @return u_telephone - 用户电话
     */
    public String getuTelephone() {
        return uTelephone;
    }

    /**
     * 设置用户电话
     *
     * @param uTelephone 用户电话
     */
    public void setuTelephone(String uTelephone) {
        this.uTelephone = uTelephone == null ? null : uTelephone.trim();
    }

    /**
     * 获取用户邮箱
     *
     * @return u_email - 用户邮箱
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param uEmail 用户邮箱
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    /**
     * 获取用户居住地
     *
     * @return u_address - 用户居住地
     */
    public String getuAddress() {
        return uAddress;
    }

    /**
     * 设置用户居住地
     *
     * @param uAddress 用户居住地
     */
    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    /**
     * 获取用户真实姓名
     *
     * @return u_name - 用户真实姓名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param uName 用户真实姓名
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * 获取证件类型  0：身份证 1：护照  2：军官证  3：工作证
     *
     * @return u_idtype - 证件类型  0：身份证 1：护照  2：军官证  3：工作证
     */
    public String getuIdtype() {
        return uIdtype;
    }

    /**
     * 设置证件类型  0：身份证 1：护照  2：军官证  3：工作证
     *
     * @param uIdtype 证件类型  0：身份证 1：护照  2：军官证  3：工作证
     */
    public void setuIdtype(String uIdtype) {
        this.uIdtype = uIdtype == null ? null : uIdtype.trim();
    }

    /**
     * 获取用户证件号
     *
     * @return u_idcard - 用户证件号
     */
    public String getuIdcard() {
        return uIdcard;
    }

    /**
     * 设置用户证件号
     *
     * @param uIdcard 用户证件号
     */
    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
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

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}