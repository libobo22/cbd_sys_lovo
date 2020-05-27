package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.time.ZoneId;
import java.util.List;

/**
 * 外部合约
 *
 * @author lixiangyu
 * @date 2020-05-11
 */
@Data
public class ExternalContract implements Serializable {

    /**
     * 合约ID
     */
    private int id;

    /**
     * 合约编号
     */
    private String contractNumber;

    /**
     * 原合同编号
     */
    private String oldContractNumber;

    /**
     * 合同单位
     */
    private String contractCompany;

    /**
     * 车位所属单位详细地址
     */
    private String companyAddress;

    /**
     * 车位地址
     */
    private String psAddress;

    /**
     * 生效日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date effectiveDate;

    /**
     * 截止日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expireDate;

    /**
     * 成交价格
     */
    private int price;

    /**
     * 第三方联系人
     */
    private String linkman;

    /**
     * 第三方联系电话
     */
    private String phone;

    /**
     * 合同状态
     */
    private int status;

    private String realStatus;

    /**
     * 合同续约状态
     */
    private int renewStatus;

    /**
     * 合同复印件
     */
    private String copy;

    /**
     * CBD车位集合
     */
    private List<CBDParkingSpace> cdbPsList;

    public void setStatus(int status) {
        this.status = status;
        initRealStatus();
    }

    public void setRenewStatus(int renewStatus) {
        this.renewStatus = renewStatus;
        initRealStatus();
    }

    public String getRealStatus() {
        initRealStatus();
        return realStatus;
    }

    /**
     * 初始化真实状态:
     * 未生效,有效,已解约,已过期
     */
    public void initRealStatus() {

        long effectiveMille = this.effectiveDate.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long expireMille = this.expireDate.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long now = System.currentTimeMillis();

        //未生效(合同状态=1,合同生效时间>当前时间)
        if (this.status == 1 && effectiveMille > now && this.renewStatus == 0) {
            this.realStatus = "未生效";
            //有效(合同状态=1,合同截止日期>当前时间)
        } else if (this.status == 1 && expireMille > now && this.renewStatus == 0) {
            this.realStatus = "有效";
            //已过期(合同状态=1,合同截至日期<当前时间)
        } else if (this.status == 1 && expireMille < now && this.renewStatus == 0) {
            this.realStatus = "已过期";
            //已解约(合同状态=0)
        } else if (this.status == 0) {
            this.realStatus = "已解约";
        } else if (this.status == 1 && this.renewStatus == 1) {
            this.realStatus = "已续约";
        }
    }
}
