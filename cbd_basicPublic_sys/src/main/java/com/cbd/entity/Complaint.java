package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 投诉功能
 *
 * @author lys
 * @date 2020-05-11
 */

@Data
public class Complaint implements Serializable {

    /**
     * 投诉ID
     */
    private Integer id;
    /**
     * 投诉原因
     */
    private String reason;
    /**
     * 投诉日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp date;
    /**
     * 投诉状态
     */
    private Integer status;

    /** 投诉状态字符串 */
    private String realStatus;

    /**
     * 销售者Id
     */
    private Sell sell;
    /**
     * 租赁方Id
     */
    private Rent rent;
    /**
     * 用户提交Id
     */
    private User complaintUser;
    /**
     * 被投诉者Id
     */
    private User respondentUser;

    public void setStatus(Integer status) {
        this.status = status;
        initRealStatus();
    }

    public String getRealStatus() {
        initRealStatus();
        return realStatus;
    }

    public void initRealStatus() {
        if (this.status == 0) {
            this.realStatus = "未受理";
        } else if (this.status == 1) {
            this.realStatus = "投诉生效";
        } else if (this.status == 2) {
            this.realStatus = "投诉无效";
        } else if (this.status == 3) {
            this.realStatus = "暂缓处理";
        }
    }

}
