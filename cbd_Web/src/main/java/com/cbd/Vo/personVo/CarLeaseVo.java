package com.cbd.Vo.personVo;


import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 车位租凭实体类
 */
@Data
public class CarLeaseVo {

    /**
     * 车位租赁ID
     */
    private int carLeaseID;

    /**
     * 租赁开始时间
     */
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// 格式化时间
//    Date date = new Date();// 获取当前时间
    private String leaseStartDate ;//= sdf.format(date);

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
    private PersonalCarVo personalCar;

    public CarLeaseVo() {
    }

    public CarLeaseVo(String leaseEndDate, float price, int leaseStatus, int leaseBuy, int personalCarId, String releaseIdentityNum) {
        this.releaseIdentityNum = releaseIdentityNum;
        this.leaseEndDate = leaseEndDate;
        this.price = price;
        this.leaseStatus = leaseStatus;
        PersonalCarVo car = new PersonalCarVo();
        car.setCarID(personalCarId);
        this.personalCar = car;
        this.leaseBuy = leaseBuy;
    }


}
