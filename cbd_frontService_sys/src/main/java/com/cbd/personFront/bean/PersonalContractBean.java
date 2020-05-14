package com.cbd.personFront.bean;

import lombok.Data;

import java.sql.Date;

/**
 * 合同实体类
 */
@Data
public class PersonalContractBean {

    /**
     * 合同id
     */
    private String contractID;

    /**
     * 车位租凭类
     */
    private CarLeaseBean carLease;

    /**
     * 合同编号
     */
    private String contractNumber;

    /**
     * 买方签约状态
     */
    private int buyStatus;

    /**
     * 卖方签约状态
     * 2拒绝签约，1代表已签约，0代表未签约
     */
    private int sellStatus;

    /**
     * 管理员审核状态
     * 2审核不通过，1代表已审核通过，0代表未审核
     */
    private int adminCheckStatus;

    /**
     * 成交价钱
     */
    private float dealPrice;

    /**
     * 合同生效日期
     */
    private String implementDate;

    /**
     * 买方真实名字
     */
    private String buyRealName;

    /**
     * 买方电话
     */
    private String buyPhone;

    /**
     * 买方身份证号
     */
    private String buyIdentityNum;

    /**
     * 卖方真实名字
     */
    private String sellRealName;

    /**
     * 卖方电话
     */
    private String sellPhone;

    /**
     * 卖方身份证号
     */
    private String sellIdentityNum;


    public PersonalContractBean() {
    }

    public PersonalContractBean(CarLeaseBean carLease, String contractNumber, int buyStatus, int sellStatus, int adminCheckStatus, float dealPrice, String implementDate, String buyRealName, String buyPhone, String buyIdentityNum, String sellRealName, String sellPhone, String sellIdentityNum) {
        this.carLease = carLease;
        this.contractNumber = contractNumber;
        this.buyStatus = buyStatus;
        this.sellStatus = sellStatus;
        this.adminCheckStatus = adminCheckStatus;
        this.dealPrice = dealPrice;
        this.implementDate = implementDate;
        this.buyRealName = buyRealName;
        this.buyPhone = buyPhone;
        this.buyIdentityNum = buyIdentityNum;
        this.sellRealName = sellRealName;
        this.sellPhone = sellPhone;
        this.sellIdentityNum = sellIdentityNum;
    }

}
