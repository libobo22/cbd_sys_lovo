package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * 出售信息
 */
@Data
public class Sell implements Serializable {
    /**
     * 出售信息ID
     */
    private int sellId;
    /**
     * 出售价格
     */
    private int sellPrice;
    /**
     * 出售状态：1取消发布、2未预约、3已预约、4成交
     */
    private int sellStatus = 2;//数据库形式
    private String sellStatusStr;//网页形式

    public void setSellStatus(int sellStatus) {
        this.sellStatus = sellStatus;
        if (sellStatus == 1) {
            this.sellStatusStr = "取消发布";
        } else if (sellStatus == 2) {
            this.sellStatusStr = "未预约";
        } else if (sellStatus == 3) {
            this.sellStatusStr = "已预约";
        } else if (sellStatus == 4) {
            this.sellStatusStr = "成交";
        }
    }

    /**
     * 出售信息
     */
    private String sellMessage;
    /**
     * 出售交易日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date sellDealDate;
    /**
     * 实体：车位实体ID
     */
    private int parkingSpaceId;
    /**
     * 实体：出售者ID
     */
    private int userSellId;
    /**
     * 实体：预约购买者ID
     */
    private int userBuyId;
    /**
     * 实体：车位实体
     */
    private ParkingSpace parkingSpace;
    /**
     * 实体：出售者
     */
    private User userSell;
    /**
     * 实体：预约购买者
     */
    private User userBuy;
    /**
     * 留言集合
     */
    private List<Review> reviews;
}
