package com.cbd.bean;

import lombok.Data;

/**
 * 管理员
 * */
@Data
public class AdminBean {
    private Integer adminID;
    private String jobNumber;
    private String phone;
    private LoginBean loginBean;

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public AdminBean(Integer adminID, String jobNumber, String phone, LoginBean loginBean) {
        this.adminID = adminID;
        this.jobNumber = jobNumber;
        this.phone = phone;
        this.loginBean = loginBean;
    }

    public AdminBean() {

    }

    @Override
    public String toString() {
        return "adminBean{" +
                "adminID=" + adminID +
                ", jobNumber='" + jobNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", loginBean=" + loginBean.getLoginName()+"/" + loginBean.getLoginPwd()+"/"+ loginBean.getStatus() +
                '}';
    }
}
