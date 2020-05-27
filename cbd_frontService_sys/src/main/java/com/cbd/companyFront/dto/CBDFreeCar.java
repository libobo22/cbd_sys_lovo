package com.cbd.companyFront.dto;
import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.util.Date;

/**
 * 企业---CBD空闲车位实体类
 */
@Data
public class CBDFreeCar {

    /**车位位置*/
    private String carPlace;

    /**车位号*/
    private String carNumber;

    /**最长可租日期*/
    private String longDate;


    public CBDFreeCar() {
    }

    public CBDFreeCar(String carPlace, String carNumber, String longDate) {
        this.carPlace = carPlace;
        this.carNumber = carNumber;
        this.longDate = longDate;
    }
}
