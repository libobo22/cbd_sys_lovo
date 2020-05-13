package com.cbd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("t_lesseeContract")
public class LesseeContractBean {
    /**
     * 租户合约ID
     */
    @TableId(value = "lesseeContractID",type = IdType.AUTO)
    private Integer lesseeContractID;
    /**
     * 企业名称
     */
    @TableField("companyName")
    private String companyName;
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
    private Integer contractStatus;
    /**
     * 该合同所对应的企业
     */
    private CompanyBean company;
    /**
     *该租户合约对应的所有车位信息
     */
    private List<CBDCarLeaseBean> cbdCarLeaseList;
}
