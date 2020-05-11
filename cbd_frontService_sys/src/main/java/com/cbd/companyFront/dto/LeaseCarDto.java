package com.cbd.companyFront.dto;
import lombok.Data;

import java.util.Date;

/**
 * 企业---已租赁车位实体类
 */
@Data
public class LeaseCarDto {

    /**车位位置*/
    private String carPlace;

    /**车位号*/
    private String carNumber;

    /**合同编号*/
    private String Contactno;

    /**合同开始日期*/
    private Date contractStrat;

    /**合同结束日期*/
    private Date contractEnd;


    public LeaseCarDto() {
    }

    public LeaseCarDto(String carPlace, String carNumber, String contactno,
                       Date contractStrat, Date contractEnd) {
        this.carPlace = carPlace;
        this.carNumber = carNumber;
        Contactno = contactno;
        this.contractStrat = contractStrat;
        this.contractEnd = contractEnd;
    }
}
