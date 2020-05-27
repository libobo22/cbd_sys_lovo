package com.cbd.Vo.personVo;

import lombok.Data;

import java.text.SimpleDateFormat;

/**
 * 投诉实体类
 */
@Data
public class ComplainVo {

    /**
     * 投诉id
     */
    private int complainID;

    /**
     *车位租凭类
     */
    private CarLeaseVo carLease;

    /**
     * 车位投诉信息
     */
    private String complainInfo;

    /**
     * 投诉日期
     */
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// 格式化时间
//    java.util.Date date = new java.util.Date();// 获取当前时间
    private String complainDate ;

    /**
     * 投诉状态
     * 投诉状态(1代表投诉成功，2代表投诉失败)
     */
    private int adminCheckStatus;

    /**
     * 投诉人真实姓名
     */
    private String complainRealName;

    /**
     * 投诉人电话
     */
    private String complainPhone;

    /**
     * 投诉人身份证号
     */
    private String complainIdentityNum;

    /**
     * 被投诉人真实名字
     */
    private String beComplainRealName;

    /**
     * 被投诉人电话
     */
    private String beComplainPhone;

    /**
     * 被投诉人身份证
     */
    private String beComplainIdentityNum;

    public ComplainVo() {
    }

    public ComplainVo(int carLeaseId,
                      String complainInfo,
                      String complainRealName,
                      String complainPhone,
                      String complainIdentityNum,
                      String beComplainRealName,
                      String beComplainPhone,
                      String beComplainIdentityNum) {

        CarLeaseVo carLeaseBean = new CarLeaseVo();
        carLeaseBean.setCarLeaseID(carLeaseId);
        this.carLease = carLeaseBean;

        this.complainInfo = complainInfo;
        this.adminCheckStatus = 0;
        this.complainRealName = complainRealName;
        this.complainPhone = complainPhone;
        this.complainIdentityNum = complainIdentityNum;
        this.beComplainRealName = beComplainRealName;
        this.beComplainPhone = beComplainPhone;
        this.beComplainIdentityNum = beComplainIdentityNum;
    }
}
