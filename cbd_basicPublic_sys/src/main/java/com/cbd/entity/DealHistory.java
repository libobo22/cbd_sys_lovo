package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 交易历史
 */
@Data
public class DealHistory implements Serializable {
    /**
     * 交易id
     */
    private int dealId;
    /**
     * 车位编号
     */
    private String serialNum;
    /**
     * 车位地址
     */
    private String address;
    /**
     * 交易类型：1出租，2出售
     */
    private int type;//数据库形式
    private String typeStr;//网页形式

    public void setType(int type) {
        this.type = type;
        if (type == 1) {
            this.typeStr = "出租";
        } else if (type == 2) {
            this.typeStr = "出售";
        }
    }

    /**
     * 交易价格
     */
    private int price;
    /**
     * 交易日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp dealDate;
    private int infoId;
    private Rent rent;
    private Sell sell;
    /**
     * 出租者，出售者ID
     */
    private int userSellId;
    /**
     * 租赁者，购买者ID
     */
    private int userPurchaseId;
    /**
     * 出租者，出售者实体
     */
    private User userSell;
    /**
     * 租赁者，购买者实体
     */
    private User userPurchase;

    /**
     * 该交易记录的所属用户名
     */
    private String dealUserName;
}
