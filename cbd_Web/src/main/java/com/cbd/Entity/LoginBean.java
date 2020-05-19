package com.cbd.Entity;

import lombok.Data;

/**
 *  登录
 * */
@Data
public class LoginBean {
    /**
     * 登录id
     * */
    private Integer loginID;

    /**
     * 登录名
     * */
    private String loginName;

    /**
     * 登录密码
     * */
    private String loginPwd;

    /**
     * 登录状态
     * 1.正常
     * 0.不可用
     * */
    private Integer status = 1;

    /**
     * 用户类型
     * */
    private Integer type;


}
