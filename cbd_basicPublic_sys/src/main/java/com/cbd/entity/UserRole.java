package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户角色中间表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class UserRole implements Serializable {

    /** 用户角色表的id */
    private int userRoleId;

    /** 用户的id */
    private int userId;

    /** 角色的id */
    private int roleId;
}
