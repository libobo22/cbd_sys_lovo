package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * 网上签约申请
 *
 * @author lixiangyu
 * @date 2020-05-11
 */
@Data
public class ApplySign implements Serializable {
    /**
     * 申请ID
     */
    private int id;

    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applyDate;

    /**
     * 申请状态
     */
    private int status;

    /**
     * 出售用户对象
     */
    private User sellUser;

    /**
     * 购买用户对象
     */
    private User buyUser;

    /**
     * 出售信息对象
     */
    private Sell sellInfo;

    public ApplySign(Date applyDate, int status, int sellUserId, int buyUserId, int sellId) {
        this.applyDate = applyDate;
        this.status = status;
        User sellUser = new User();
        sellUser.setId(sellUserId);
        User buyUser = new User();
        buyUser.setId(buyUserId);
        Sell sell = new Sell();
        sell.setSellId(sellId);

        this.sellUser = sellUser;
        this.buyUser = buyUser;
        this.sellInfo = sell;
    }

    public ApplySign() {
    }
}
