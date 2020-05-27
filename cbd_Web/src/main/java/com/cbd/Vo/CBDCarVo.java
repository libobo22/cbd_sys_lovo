package com.cbd.Vo;


import lombok.Data;

import java.io.Serializable;

/**
 * CBD车位实体类
 */
@Data

public class CBDCarVo implements Serializable {
    /**
     * 车位id
     */

    private Integer cbdCarID;
    /**
     * 车位地址
     */
    private String carAddress;
    /**
     * 车位编号
     */

    private String carNumber;

    /**
     * 租赁状态(1代表已租赁，2代表未租赁)，默认未租赁
     */

    private Integer leaseStatus=2;
    /**
     * 1代表内部车位，2代表外部车位。默认是内部车位
*/
    private Integer inOrOutStatus=1;
    /**
     * 1代表有效，0代表无效。默认有效
     */

    private Integer cbdCarStatus=1;
    /**
     * 外部合约（若该车位是外部租赁的，则有对应的外部合约）
     */

//    private ExternalContractBean externalContract;


    private int externalContractID;

    public Integer getCbdCarID() {
        return cbdCarID;
    }

    public void setCbdCarID(Integer cbdCarID) {
        this.cbdCarID = cbdCarID;
    }

    public String getCarAddress() {
        return carAddress;
    }

    public void setCarAddress(String carAddress) {
        this.carAddress = carAddress;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

//    public String getLeaseStatus() {
//        if (this.leaseStatus==1){
//            return "已租赁";
//        }else if (this.leaseStatus==2){
//            return "未租赁";
//        }
//        return null;
//    }

    public void setLeaseStatus(Integer leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public Integer getInOrOutStatus() {
        return inOrOutStatus;
    }

    public void setInOrOutStatus(Integer inOrOutStatus) {
        this.inOrOutStatus = inOrOutStatus;
    }

//    public String getCbdCarStatus() {
//        //1代表有效，0代表无效。默认有效
//        if (this.cbdCarStatus==1){
//            return "有效";
//        }else if (this.cbdCarStatus==0){
//            return "无效";
//        }
//        return null;
//    }

    public void setCbdCarStatus(Integer cbdCarStatus) {
        this.cbdCarStatus = cbdCarStatus;
    }

//    public ExternalContractBean getExternalContract() {
//        return externalContract;
//    }
//
//    public void setExternalContract(ExternalContractBean externalContract) {
//        this.externalContract = externalContract;
//    }

    public int getExternalContractID() {
        return externalContractID;
    }

    public void setExternalContractID(int externalContractID) {
        this.externalContractID = externalContractID;
    }

    public Integer getLeaseStatus() {
        return leaseStatus;
    }

    public Integer getCbdCarStatus() {
        return cbdCarStatus;
    }
}
