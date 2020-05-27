package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class Manager implements Serializable {

    /** 管理员id */
    private int id;

    /** 管理员真实姓名 */
    private String realName;

    /** 管理员电话 */
    private String phone;

    /** 管理员工号 */
    private String jobNumber;
}
