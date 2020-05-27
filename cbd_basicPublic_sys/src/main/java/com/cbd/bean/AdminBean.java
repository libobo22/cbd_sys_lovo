package com.cbd.bean;

import lombok.Data;


/**
 * 管理员
 * */
@Data
public class AdminBean {
    private Integer adminID;
    private String jobNumber;
    private String phone;
    private LoginBean loginBean;
}
