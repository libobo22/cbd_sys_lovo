package com.cbd.Vo;

import lombok.Data;

@Data

public class AdminCompanyVo {
    /**
     * 企业ID
     */

    private Integer companyID;
    /**
     * 登录名
     */

    private String loginName;
    /**
     * 登录密码
     */

    private String loginPwd;
    /**
     * 公司名称
     */

    private String companyName;
    /**
     * 楼层
     */

    private Integer companyFloor;
    /**
     * 联系人
     */

    private String linkman;
    /**
     * 联系电话
     */

    private String linkPhone;
}
