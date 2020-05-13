package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//内部合约实体类
public class LesseeContractEntity {
    private int id;
    private String companyName;//企业名称
    private String linkMan;
    private String linkPhone;
    private String contractStartDate;//合同开始日期
    private String  contractEndDate;//合同结束日期
    private  float dealPrice;//成交价格
    private String contractOfCopy;//合同复印件
    private String contractNumber;//合同编号
    private String contractExtensionNumber;//续约合同编号
    private String contractStatus;//合同状态(1代表有效，0代表无效)
    private CompanyEntity companyEntity;


}
