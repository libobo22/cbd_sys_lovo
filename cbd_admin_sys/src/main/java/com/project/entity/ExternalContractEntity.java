package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//外部合约实体类
public class ExternalContractEntity {

    private int id;
    private String contractCompany;//合同单位
    private String linkMan;
    private String linkPhone;
    private String companyAddress;
    private String contractStartDate;//合同生效日期
    private String contractEndDate;//合同结束日期
    private float dealPrice;//成交价格
    private String contractOfCopy;//合同复印件
    private String contractNumber;//合同编号
    private String contractExtensionNumber;//合同续约编号
    private String contractStatus;//合同状态(1代表有效，0代表无效)



}
