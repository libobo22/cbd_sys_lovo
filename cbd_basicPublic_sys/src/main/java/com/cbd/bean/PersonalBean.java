package com.cbd.bean;

/**
 * 个人用户
 * */
public class PersonalBean {
    private Integer persionId;
    private String realName;
    private String homeAddress;
    private String phone;
    private String identityNum;
    private String job;
    private String email;
    private Integer dealNum;
    private Integer complainNum;
    private LoginBean loginBean;


    public Integer getPersionId() {
        return persionId;
    }

    public void setPersionId(Integer persionId) {
        this.persionId = persionId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDealNum() {
        return dealNum;
    }

    public void setDealNum(Integer dealNum) {
        this.dealNum = dealNum;
    }

    public Integer getComplainNum() {
        return complainNum;
    }

    public void setComplainNum(Integer complainNum) {
        this.complainNum = complainNum;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public PersonalBean() {
    }

    public PersonalBean(Integer persionId, String realName, String homeAddress, String phone, String identityNum, String job, String email, Integer dealNum, Integer complainNum, LoginBean loginBean) {
        this.persionId = persionId;
        this.realName = realName;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.identityNum = identityNum;
        this.job = job;
        this.email = email;
        this.dealNum = dealNum;
        this.complainNum = complainNum;
        this.loginBean = loginBean;
    }


}
