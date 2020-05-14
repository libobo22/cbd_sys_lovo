package com.cbd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;

import java.io.Serializable;

/**
 * CBD车位实体类
 */
@Data
@TableName("t_cbdCar")
public class CBDCarBean implements Serializable {
    /**
     * 车位id
     */
    @TableId(value = "cbdCarID",type = IdType.AUTO)
    private Integer cbdCarID;
    /**
     * 车位地址
     */
    @TableField("carAddress")
    private String carAddress;
    /**
     * 车位编号
     */
    @TableField("carNumber")
    private String carNumber;

    /**
     * 租赁状态(1代表已租赁，2代表未租赁)，默认未租赁
     */
    @TableField("leaseStatus")
    private Integer leaseStatus=2;
    /**
     * 1代表内部车位，2代表外部车位。默认是内部车位
     */
    @TableField("inOrOutStatus")
    private Integer inOrOutStatus=1;
    /**
     * 1代表有效，0代表无效。默认有效
     */
    @TableField("cbdCarStatus")
    private Integer cbdCarStatus=1;
    /**
     * 外部合约（若该车位是外部租赁的，则有对应的外部合约）
     */
    @TableField(exist = false)
    private ExternalContractBean externalContract;

    @TableField("externalContractID")
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

    public String getLeaseStatus() {
        if (this.leaseStatus==1){
            return "已租赁";
        }else if (this.leaseStatus==2){
            return "未租赁";
        }
        return null;
    }

    public void setLeaseStatus(Integer leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public Integer getInOrOutStatus() {
        return inOrOutStatus;
    }

    public void setInOrOutStatus(Integer inOrOutStatus) {
        this.inOrOutStatus = inOrOutStatus;
    }

    public String getCbdCarStatus() {
        //1代表有效，0代表无效。默认有效
        if (this.cbdCarStatus==1){
            return "有效";
        }else if (this.cbdCarStatus==0){
            return "无效";
        }
        return null;
    }

    public void setCbdCarStatus(Integer cbdCarStatus) {
        this.cbdCarStatus = cbdCarStatus;
    }

    public ExternalContractBean getExternalContract() {
        return externalContract;
    }

    public void setExternalContract(ExternalContractBean externalContract) {
        this.externalContract = externalContract;
    }

    public int getExternalContractID() {
        return externalContractID;
    }

    public void setExternalContractID(int externalContractID) {
        this.externalContractID = externalContractID;
    }
}
