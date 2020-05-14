package com.cbd.companyFront.dto;

import lombok.Data;

/**
 * 企业---修改信息实体类
 */
@Data
public class CompanyInfoDto {

    /**企业ID*/
    private int companyID;

    /**企业登录名*/
    private String logName;

    /**企业登录密码*/
    private String logPass;

    /**企业名称*/
    private String companyName;

    /**企业楼层位置*/
    private String floor;

    /**联系人*/
    private String linkMan;

    /**联系电话*/
    private String linkPhone;


    public CompanyInfoDto() {
    }

    public CompanyInfoDto(int companyID, String logName, String logPass,
                          String companyName, String floor, String linkMan, String linkPhone) {
        this.companyID = companyID;
        this.logName = logName;
        this.logPass = logPass;
        this.companyName = companyName;
        this.floor = floor;
        this.linkMan = linkMan;
        this.linkPhone = linkPhone;
    }
}
