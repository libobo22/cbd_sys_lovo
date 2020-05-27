package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 角色表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class Role implements Serializable {

    /** 角色的id */
    private int roleId;

    /** 角色名 */
    private String roleName;

    private List<Power> powerList;
}
