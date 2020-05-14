package com.cbd.personFront.bean;


import lombok.Data;

import java.sql.Date;
import java.text.DateFormat;

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
    private String leaseStartDate;

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

    public CarLeaseBean(String leaseStartDate, String leaseEndDate, float price, int leaseStatus, PersonalCarBean personalCar) {
        this.leaseStartDate = leaseStartDate;
        this.leaseEndDate = leaseEndDate;
        this.price = price;
        this.leaseStatus = leaseStatus;
        this.personalCar = personalCar;
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
