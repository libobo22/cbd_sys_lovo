package com.cbd.companyFront.dto;

import lombok.Data;

import java.util.Date;

/**
 * 企业---账单实体类
 */
@Data
public class BillDto {

    /**交易日期*/
    private String dealDate;

    /**交易时间*/
    private String dealTime;

    /**支出*/
    private double expend;

    /**收入*/
    private double income;

    /**备注*/
    private String remarks;


    public BillDto() {
    }

    public BillDto(String dealDate, String dealTime, double expend, double income, String remarks) {
        this.dealDate = dealDate;
        this.dealTime = dealTime;
        this.expend = expend;
        this.income = income;
        this.remarks = remarks;
    }
}
