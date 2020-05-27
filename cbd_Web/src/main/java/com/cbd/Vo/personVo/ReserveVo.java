package com.cbd.Vo.personVo;


import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * 预定实体类
 */

@Data
public class ReserveVo {

    /**
     * 预定ID
     */
    private int reserveID;

    /**
     * 车位租凭
     */
    private CarLeaseVo carLease;

    /**
     * 留言信息
     */
    private String leaveMessage;

    /**
     * 留言时间
     */
    /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
    Date date = new Date();*/
    private String reserveDate ;

    /**
     * 预定状态
     * 3待预约，1已预约，2已签约,4拒绝签约
     */
    private String reserveStatus;

    /**
     * 车位主人真实名字
     */
    private String ownerRealName;

    /**
     * 车位主人手机号
     */
    private String ownerPhone;

    /**
     * 车位主人身份证号
     */
    private String ownerIdentityNum;

    /**
     * 预定人真实名字
     */
    private String reserveRealName;

    /**
     * 预定人电话
     */
    private String reservePhone;

    /**
     * 预定人身份证号
     */
    private String reserveIdentityNum;

    public ReserveVo() {
    }


    public ReserveVo(int carLeaseId, String leaveMessage, String reserveStatus, String ownerRealName, String ownerPhone, String ownerIdentityNum, String reserveRealName, String reservePhone, String reserveIdentityNum) {
        CarLeaseVo bean = new CarLeaseVo();
        bean.setCarLeaseID(carLeaseId);
        this.carLease = bean;
        this.leaveMessage = leaveMessage;
        this.reserveStatus = reserveStatus;
        this.ownerRealName = ownerRealName;
        this.ownerPhone = ownerPhone;
        this.ownerIdentityNum = ownerIdentityNum;
        this.reserveRealName = reserveRealName;
        this.reservePhone = reservePhone;
        this.reserveIdentityNum = reserveIdentityNum;
    }


    public ReserveVo(CarLeaseVo carLease, String leaveMessage, String reserveDate, String reserveStatus, String ownerRealName, String ownerPhone, String ownerIdentityNum, String reserveRealName, String reservePhone, String reserveIdentityNum) {
        this.carLease = carLease;
        this.leaveMessage = leaveMessage;
        this.reserveDate = reserveDate;
        this.reserveStatus = reserveStatus;
        this.ownerRealName = ownerRealName;
        this.ownerPhone = ownerPhone;
        this.ownerIdentityNum = ownerIdentityNum;
        this.reserveRealName = reserveRealName;
        this.reservePhone = reservePhone;
        this.reserveIdentityNum = reserveIdentityNum;
    }
}
