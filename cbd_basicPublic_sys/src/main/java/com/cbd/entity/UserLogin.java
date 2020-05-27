package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户登录表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class UserLogin implements Serializable {

    /**
     * 登录用户的id
     */
    private int id;

    /**
     * 登录的用户名
     */
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户类型
     */
    private int type;

    private String realType;

    private List<Role> roleList;

    public UserLogin(String userName, String password, int type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public UserLogin() {
    }

    public String getRealType() {
        if (this.type == 1) {
            return "个人用户";
        }
        if (this.type == 2) {
            return "企业用户";
        }
        if (this.type == 3) {
            return "管理员";
        }
        return "";
    }
}
