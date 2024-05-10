package com.report.mange.system.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class ReportDeptVO {

    /**
     * 单位ID
     */
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * 单位名称
     */
    @Column(name = "dept_name")
    private String deptName;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}