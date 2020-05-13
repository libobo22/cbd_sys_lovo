package com.cbd.personFront.bean;

import lombok.Data;

/**
 * 账单实体类
 */
@Data
public class BillBean {

    /**
     * 账单id
     */
    private int billId;

    /**
     * 支出
     */
    private float expenditure;

    /**
     * 收入
     */
    private float income;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 交易时间
     */
    private String transactionTime;

    /**
     * 用户身份证号
     */
    private String IdentityNum;

    public BillBean() {
    }

    public BillBean(float expenditure, float income, String remarks, String transactionTime, String identityNum) {
        this.expenditure = expenditure;
        this.income = income;
        this.remarks = remarks;
        this.transactionTime = transactionTime;
        IdentityNum = identityNum;
    }

    @Override
    public String toString() {
        return "BillBean{" +
                "billId=" + billId +
                ", expenditure=" + expenditure +
                ", income=" + income +
                ", remarks='" + remarks + '\'' +
                ", transactionTime='" + transactionTime + '\'' +
                ", IdentityNum='" + IdentityNum + '\'' +
                '}';
    }
}
