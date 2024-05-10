package com.report.mange.system.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class ReportUserVO {

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;


    /**
     * 用户真实姓名
     */
    @Column(name = "u_name")
    private String uName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}