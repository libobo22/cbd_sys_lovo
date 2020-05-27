package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色权限中间表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class RolePower implements Serializable {

    /** 角色权限表的id */
    private int rolePowerId;

    /** 权限的id */
    private int powerId;

    /** 角色的id */
    private int roleId;
}
