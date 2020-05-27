package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * 出租信息
 */
@Data
public class Rent implements Serializable {
    /**
     * 出租信息ID
     */
    private int rentId;
    /**
     * 起始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;
    /**
     * 租赁多少个月
     */
    private int months;
    /**
     * 出租价格
     */
    private String rentPrice;
    /**
     * 出租状态：1取消发布、2未预约、3已预约、4成交、5过期
     */
    private int rentStatus = 2;//数据库形式
    private String rentStatusStr;//网页形式

    public void setRentStatus(int rentStatus) {
        this.rentStatus = rentStatus;
        if (rentStatus == 1) {
            this.rentStatusStr = "取消发布";
        } else if (rentStatus == 2) {
            this.rentStatusStr = "未预约";
        } else if (rentStatus == 3) {
            this.rentStatusStr = "已预约";
        } else if (rentStatus == 4) {
            this.rentStatusStr = "成交";
        } else if (rentStatus == 5) {
            this.rentStatusStr = "过期";
        }
    }

    /**
     * 出租信息
     */
    private String rentMessage;
    /**
     * 交易日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date rentDealDate;
    /**
     * 实体：车位ID
     */
    private int parkingSpaceId;
    /**
     * 实体：出租者ID
     */
    private int userRentOutId;
    /**
     * 实体：预约租赁者ID
     */
    private int userRentInId;
    /**
     * 实体：车位实体
     */
    private ParkingSpace parkingSpace;
    /**
     * 实体：出租者
     */
    private User userRentOut;
    /**
     * 实体：预约租赁者
     */
    private User userRentIn;
    /**
     * 留言集合
     */
    private List<Review> reviews;
}
