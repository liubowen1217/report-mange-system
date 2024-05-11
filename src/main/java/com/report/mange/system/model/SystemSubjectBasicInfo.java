package com.report.mange.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "system_subject_basic_info")
public class SystemSubjectBasicInfo {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 上级系统科目code
     */
    @Column(name = "parent_system_subject_code")
    private String parentSystemSubjectCode;

    /**
     * 系统科目code
     */
    @Column(name = "system_subject_code")
    private String systemSubjectCode;

    /**
     * 系统科目
     */
    @Column(name = "system_subject")
    private String systemSubject;

    /**
     * 是否有下级 1.是，0.否
     */
    @Column(name = "is_level")
    private Byte isLevel;

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
     * 获取上级系统科目code
     *
     * @return parent_system_subject_code - 上级系统科目code
     */
    public String getParentSystemSubjectCode() {
        return parentSystemSubjectCode;
    }

    /**
     * 设置上级系统科目code
     *
     * @param parentSystemSubjectCode 上级系统科目code
     */
    public void setParentSystemSubjectCode(String parentSystemSubjectCode) {
        this.parentSystemSubjectCode = parentSystemSubjectCode == null ? null : parentSystemSubjectCode.trim();
    }

    /**
     * 获取系统科目code
     *
     * @return system_subject_code - 系统科目code
     */
    public String getSystemSubjectCode() {
        return systemSubjectCode;
    }

    /**
     * 设置系统科目code
     *
     * @param systemSubjectCode 系统科目code
     */
    public void setSystemSubjectCode(String systemSubjectCode) {
        this.systemSubjectCode = systemSubjectCode == null ? null : systemSubjectCode.trim();
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
     * 获取是否有下级 1.是，0.否
     *
     * @return is_level - 是否有下级 1.是，0.否
     */
    public Byte getIsLevel() {
        return isLevel;
    }

    /**
     * 设置是否有下级 1.是，0.否
     *
     * @param isLevel 是否有下级 1.是，0.否
     */
    public void setIsLevel(Byte isLevel) {
        this.isLevel = isLevel;
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