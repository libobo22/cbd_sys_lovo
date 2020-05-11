package com.cbd.personFront.bean;

import lombok.Data;

import java.sql.Date;

/**
 * 投诉实体类
 */
@Data
public class ComplainBean {

    /**
     * 投诉id
     */
    private int complainID;

    /**
     *车位租凭类
     */
    private CarLeaseBean carLease;

    /**
     * 车位投诉信息
     */
    private String complainInfo;

    /**
     * 投诉日期
     */
    private Date complainDate;

    /**
     * 投诉状态
     */
    private int adminCheckStatus;

    /**
     * 投诉人真实姓名
     */
    private String complainRealName;

    /**
     * 投诉人电话
     */
    private String complainPhone;

    /**
     * 投诉人身份证号
     */
    private String complainIdentityNum;

    /**
     * 被投诉人真实名字
     */
    private String beComplainRealName;

    /**
     * 被投诉人电话
     */
    private String beComplainPhone;

    /**
     * 被投诉人身份证
     */
    private String beComplainIdentityNum;

    public ComplainBean() {
    }

    public ComplainBean(CarLeaseBean carLease, String complainInfo, Date complainDate, int adminCheckStatus, String complainRealName, String complainPhone, String complainIdentityNum, String beComplainRealName, String beComplainPhone, String beComplainIdentityNum) {
        this.carLease = carLease;
        this.complainInfo = complainInfo;
        this.complainDate = complainDate;
        this.adminCheckStatus = adminCheckStatus;
        this.complainRealName = complainRealName;
        this.complainPhone = complainPhone;
        this.complainIdentityNum = complainIdentityNum;
        this.beComplainRealName = beComplainRealName;
        this.beComplainPhone = beComplainPhone;
        this.beComplainIdentityNum = beComplainIdentityNum;
    }
}
