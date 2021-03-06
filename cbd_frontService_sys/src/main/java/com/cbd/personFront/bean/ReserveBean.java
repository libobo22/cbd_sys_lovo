package com.cbd.personFront.bean;


import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * 预定实体类
 */
@Data
public class ReserveBean {

    /**
     * 预定ID
     */
    private int reserveID;

    /**
     * 车位租凭
     */
    private CarLeaseBean carLease;

    /**
     * 留言信息
     */
    private String leaveMessage;

    /**
     * 留言时间
     */
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
//    DateTime date = new DateTime();
    private String reserveDate ;

//    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
//        System.out.println(sdf.format(System.currentTimeMillis()));
//    }

    /**
     * 预定状态
     * 0待预约，1已预约，2已签约
     */
    private int reserveStatus;

    /**
     * 车位主人真实名字
     */
    private String ownerRealName;

    /**
     * 车位主人手机号
     */
    private String ownerPhone;

    /**
     * 车位主人身份证号
     */
    private String ownerIdentityNum;

    /**
     * 预定人真实名字
     */
    private String reserveRealName;

    /**
     * 预定人电话
     */
    private String reservePhone;

    /**
     * 预定人身份证号
     */
    private String reserveIdentityNum;

    public ReserveBean() {
    }

    public ReserveBean(int carLeaseId, String leaveMessage, int reserveStatus, String ownerRealName, String ownerPhone, String ownerIdentityNum, String reserveRealName, String reservePhone, String reserveIdentityNum) {
        CarLeaseBean bean = new CarLeaseBean();
        bean.setCarLeaseID(carLeaseId);
        this.carLease = bean;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
        this.reserveDate = sdf.format(System.currentTimeMillis());

        this.leaveMessage = leaveMessage;
        this.reserveStatus = reserveStatus;
        this.ownerRealName = ownerRealName;
        this.ownerPhone = ownerPhone;
        this.ownerIdentityNum = ownerIdentityNum;
        this.reserveRealName = reserveRealName;
        this.reservePhone = reservePhone;
        this.reserveIdentityNum = reserveIdentityNum;
    }


    public ReserveBean(CarLeaseBean carLease, String leaveMessage, String reserveDate, int reserveStatus, String ownerRealName, String ownerPhone, String ownerIdentityNum, String reserveRealName, String reservePhone, String reserveIdentityNum) {
        this.carLease = carLease;
        this.leaveMessage = leaveMessage;
        this.reserveDate = reserveDate;
        this.reserveStatus = reserveStatus;
        this.ownerRealName = ownerRealName;
        this.ownerPhone = ownerPhone;
        this.ownerIdentityNum = ownerIdentityNum;
        this.reserveRealName = reserveRealName;
        this.reservePhone = reservePhone;
        this.reserveIdentityNum = reserveIdentityNum;
    }
}
