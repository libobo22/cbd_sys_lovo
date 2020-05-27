package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class Power implements Serializable {
    /** 权限id */
    private int powerId;

    /** 权限名 */
    private String powerName;

    /** 权限URI */
    private String uri;

}
