package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * 车位信息
 */
@Data
public class ParkingSpace implements Serializable {
    /**
     * 车位ID
     */
    private int parkingSpaceId;
    /**
     * 车位地址
     */
    private String address;
    /**
     * 车位编号
     */
    private String serialNum;
    /**
     * 车位产权证编号
     */
    private String titleDeedSerialNum;
    /**
     * 产权证图片名
     */
    private String photo;
    /**
     * 车位状态：1审核中，2空闲，3招租中，4已租赁，5出售中，6申请签约，7已转让
     */
    private int psStatus = 1;//数据库形式
    private String psStatusStr;//网页形式

    public void setPsStatus(int psStatus) {
        this.psStatus = psStatus;
        if (psStatus == 1) {
            this.psStatusStr = "审核中";
        } else if (psStatus == 2) {
            this.psStatusStr = "空闲";
        } else if (psStatus == 3) {
            this.psStatusStr = "招租中";
        } else if (psStatus == 4) {
            this.psStatusStr = "已租赁";
        } else if (psStatus == 5) {
            this.psStatusStr = "出售中";
        } else if (psStatus == 6) {
            this.psStatusStr = "申请签约";
        } else if (psStatus == 7) {
            this.psStatusStr = "已转让";
        }
    }

    /**
     * 车位所属用户ID
     */
    private int userId;
    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applyDate;
    /**
     * 车位所属用户实体
     */
    private User user;
}
