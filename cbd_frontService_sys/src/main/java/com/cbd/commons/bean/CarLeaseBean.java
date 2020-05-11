package com.cbd.commons.bean;


import lombok.Data;

import java.sql.Date;

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
    private Date leaseStartDate;

    /**
     * 租凭结束时间
     */
    private Date leaseEndDate;

    /**
     * 出租价钱
     */
    private float price;

    /**
     * 出租/出售状态
     */
    private int leaseStatus;

    /**
     * 车位
     */
    private PersonalCarBean personalCar;
}
