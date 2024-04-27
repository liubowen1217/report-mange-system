package com.report.mange.system.vo;

import javax.persistence.Column;

public class ReportConVO {
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

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConCode() {
        return conCode;
    }

    public void setConCode(String conCode) {
        this.conCode = conCode;
    }
}
