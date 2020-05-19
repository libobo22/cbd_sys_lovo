package com.cbd.Vo;

import lombok.Data;

/**
 * 个人用户
 * */
@Data
public class PersonalBean {
    private Integer persionId;
    private String realName;
    private String homeAddress;
    private String phone;
    private String identityNum;
    private String job;
    private String email;
    private Integer dealNum = 0;
    private Integer complainNum = 0;
    private LoginBean loginBean;
}
