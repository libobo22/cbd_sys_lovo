package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.time.ZoneId;
import java.util.List;

/**
 * 企业合约
 *
 * @author liren
 * @date 2020-05-11
 */
@Data
public class CompanyContract implements Serializable {

    /** 合约ID */
    private Integer id;

    /** 企业名 */
    private String companyName;

    /** 合约编号 */
    private String contractNumber;

    /** 原合同编号 */
    private String oldContractNumber;

    /** 生效日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date effectiveDate;

    /** 截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expireDate;

    /** 成交价格 */
    private Integer price;

    /** 企业联系人 */
    private String contactPerson;

    /** 联系人电话 */
    private String contactPhone;

    /** 合同有效状态,(0无效,1有效) */
    private Integer status;

    /** 续约状态,(0未续约,1已续约) */
    private Integer renewStatus;

    /** 真实状态(未生效,已续约,已过期,有效,已解约) */
    private String realStatus;

    /** 合同复印件存储路径 */
    private String photoCopy;

    /** 企业对象 */
    private Business company;

    /** CBD车位交易信息对象 */
    private List<CBDParkingSpaceDealing> cbdParkingSpaceDealingList;

    public void setStatus(Integer status) {
        this.status = status;
        initRealStatus();
    }

    public void setRenewStatus(Integer renewStatus) {
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

        if (this.renewStatus == null || this.status == null) {
            return;
        }

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

