package com.report.mange.system.dto;

import javax.persistence.Column;

public class UserAccountDTO {

    /**
     * 用户账号ID
     */
    @Column(name = "user_acct_id")
    private Long userAcctId;

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
     * 用户真实姓名
     */
    @Column(name = "u_name")
    private String uName;

    public String getuAccountName() {
        return uAccountName;
    }

    public void setuAccountName(String uAccountName) {
        this.uAccountName = uAccountName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Long getUserAcctId() {
        return userAcctId;
    }

    public void setUserAcctId(Long userAcctId) {
        this.userAcctId = userAcctId;
    }
}
