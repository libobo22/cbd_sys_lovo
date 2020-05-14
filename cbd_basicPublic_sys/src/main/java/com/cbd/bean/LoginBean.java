package com.cbd.bean;

import lombok.Data;

/**
 *  登录
 * */
public class LoginBean {
    /**
     * 登录id
     * */
    private Integer loginID;

    /**
     * 登录名
     * */
    private String loginName;

    /**
     * 登录密码
     * */
    private String loginPwd;

    /**
     * 登录状态
     * 1.正常
     * 0.不可用
     * */
    private Integer status = 1;

    public Integer getLoginID() {
        return loginID;
    }

    public void setLoginID(Integer loginID) {
        this.loginID = loginID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LoginBean(Integer loginID, String loginName, String loginPwd, Integer status) {
        this.loginID = loginID;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.status = status;
    }

    public LoginBean() {
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "loginID=" + loginID +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", status=" + status +
                '}';
    }
}
