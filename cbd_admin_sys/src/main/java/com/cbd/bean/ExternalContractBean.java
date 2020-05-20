package com.cbd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * 外部合约实体类
 */
@Data
@TableName("t_externalContract")
public class ExternalContractBean {
    /**
     * 外部合约ID
     */
    @TableId(value = "externalContractID",type = IdType.AUTO)
    private Integer externalContractID;
    /**
     * 合同单位
     */
    @TableField("contractCompany")
    private String contractCompany;
    /**
     * 联系人
     */
    @TableField("linkman")
    private String linkman;
    /**
     * 联系电话
     */
    @TableField("linkPhone")
    private String linkPhone;
    /**
     * 车位所属单位详细地址
     */
    @TableField("companyAddress")
    private String companyAddress;
    /**
     * 合同生效日期
     */
    @TableField("contractStartDate")
    private String contractStartDate;
    /**
     * 合同截至日期
     */
    @TableField("contractEndDate")
    private String contractEndDate;
    /**
     * 成交价格
     */
    @TableField("dealPrice")
    private float dealPrice;
    /**
     * 合同复印件
     */
    @TableField("contractOfCopy")
    private String contractOfCopy;
    /**
     * 合同编号
     */
    @TableField("contractNumber")
    private String contractNumber;
    /**
     * 续约合同编号
     */
    @TableField("contractExtensionNumber")
    private String contractExtensionNumber;
    /**
     * 合同状态(1代表有效，0代表无效)
     */
    @TableField("contractStatus")
    private Integer contractStatus=1;
    /**
     * 该外部合约对应的所有车位信息
     */
    @TableField(exist = false)
    private List<CBDCarBean> cbdCarList;


    @TableField("carAddress")
    private String carAddress;

    @TableField("carNumber")
    private String carNumber;

}
