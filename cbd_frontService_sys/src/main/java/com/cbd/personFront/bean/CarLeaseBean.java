package com.cbd.personFront.bean;


import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 车位租凭实体类
 */
@Data
public class CarLeaseBean {

    /**
     * 车位租赁ID
     */
    private int carLeaseID;

    /**
     * 租赁开始时间
     */
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// 格式化时间
    java.util.Date date = new Date();// 获取当前时间
    private String leaseStartDate = sdf.format(date);

    /**
     * 租凭结束时间
     */
    private String leaseEndDate;

    /**
     * 出租价钱
     */
    private float price;

    /**
     * 1待预约，2已预约，3已签约
     */
    private int leaseStatus;

    /**
     * 发布用户身份证
     */
    private String releaseIdentityNum;

    /**
     * 1：出租。2：出售
     */
    private int leaseBuy;

    /**
     * 车位
     */
    private PersonalCarBean personalCar;

    public CarLeaseBean() {
    }

    public CarLeaseBean( String leaseEndDate, float price, int leaseStatus, int personalCarId,String releaseIdentityNum) {
        this.releaseIdentityNum = releaseIdentityNum;
        this.leaseEndDate = leaseEndDate;
        this.price = price;
        this.leaseStatus = leaseStatus;
        PersonalCarBean car = new PersonalCarBean();
        car.setCarID(personalCarId);
        this.personalCar = car;
    }

    @Override
    public String toString() {
        return "CarLeaseBean{" +
                "carLeaseID=" + carLeaseID +
                ", leaseStartDate=" + leaseStartDate +
                ", leaseEndDate=" + leaseEndDate +
                ", price=" + price +
                ", leaseStatus=" + leaseStatus +
                ", personalCar=" + personalCar +
                '}';
    }
}
