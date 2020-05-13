package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//CBD实体类
public class CBDentity {
    private int cbdCarID;
    private String carAddress;
    private String carNumber; //车位编号
    private String leaseStatus;//租赁状态(1代表已租赁，2代表未租赁)
    private String inOrOutStatus;//1代表内部车位，2代表外部车位
    private String cbdCarStatus;
    private ExternalContractEntity externalContract;//外部合约


}
