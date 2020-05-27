package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 个人用户表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
public class User extends UserLogin implements Serializable {

    /** 用户id */
    private int id;

    /** 真实姓名 */
    private String realName;

    /** 身份证 */
    private String idCard;

    /** 家庭住址 */
    private String homeAddress;

    /** 电话号码 */
    private String phone;

    /** 工作信息 */
    private String job;

    /** 电子邮件 */
    private String email;

    /** 身份证复印件 */
    private String idPhoto;

    /** 用户信用度 */
    private int credit;

//    public User(String userName, String password, int type, String realName, String idCard, String homeAddress, String phone, String job, String email, String idPhoto, int credit) {
//        super(userName, password, type);
//        this.realName = realName;
//        this.idCard = idCard;
//        this.homeAddress = homeAddress;
//        this.phone = phone;
//        this.job = job;
//        this.email = email;
//        this.idPhoto = idPhoto;
//        this.credit = credit;
//    }

}
