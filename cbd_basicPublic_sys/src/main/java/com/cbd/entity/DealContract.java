package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * 出售/购买合同
 *
 * @author lixiangyu
 * @date 2020-05-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealContract implements Serializable {
    /**
     * 合同ID
     */
    private int id;

    /**
     * 合同编号
     */
    private String number;

    /**
     * 合同生效日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date effectiveDate;

    /**
     * 出售用户是否确认
     */
    private int sellConfirm;

    private String sConfirm;

    /**
     * 购买用户是否确认
     */
    private int buyConfirm;

    private String bConfirm;

    /**
     * 合同状态
     */
    private String status;

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

    public String getStatus() {
        if (sellConfirm == 1 && buyConfirm == 1) {
            return "已生效";
        }
        return "未生效";
    }

    public String getsConfirm() {
        if (this.sellConfirm == 1) {
            return "已确认";
        }
        return "未确认";
    }

    public String getbConfirm() {
        if (this.buyConfirm == 1) {
            return "已确认";
        }
        return "未确认";
    }
}
