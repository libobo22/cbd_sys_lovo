package com.cbd.personFront.bean;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// 格式化时间
    Date date = new Date();// 获取当前时间
    private String transactionTime = sdf.format(date);



        /**
         * 用户身份证号
         */
    private String IdentityNum;

    public BillBean() {
    }

    public BillBean(float expenditure, float income, String remarks, String identityNum) {
        this.expenditure = expenditure;
        this.income = income;
        this.remarks = remarks;
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
