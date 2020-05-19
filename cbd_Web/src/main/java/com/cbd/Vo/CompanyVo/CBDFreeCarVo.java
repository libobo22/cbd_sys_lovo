package com.cbd.Vo.CompanyVo;
import lombok.Data;

import java.util.Date;

/**
 * 企业---CBD空闲车位实体类
 */
@Data
public class CBDFreeCarVo {

    /**车位位置*/
    private String carPlace;

    /**车位号*/
    private String carNumber;

    /**最长可租日期*/
    private Date longDate;


    public CBDFreeCarVo() {
    }

    public CBDFreeCarVo(String carPlace, String carNumber, Date longDate) {
        this.carPlace = carPlace;
        this.carNumber = carNumber;
        this.longDate = longDate;
    }
}
