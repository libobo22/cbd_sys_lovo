package com.cbd.personFront.bean;

import lombok.Data;

/**
 * 车位实体类
 */
@Data
public class PersonalCarBean {

    /**
     * 车位id
     */
    private int carID;

    /**
     * 车位产权证编号
     */
    private String carPropertyNum;

    /**
     * 车位地址
     */
    private String carAddress;

    /**
     * 车位编号
     */
    private String carNumber;

    /**
     * 产权证复印件
     */
    private String propertyCopy;

    /**
     * 车位主人真实名字
     */
    private String realName;

    /**
     * 电话号
     */
    private String phone;

    /**
     * 身份证号
     */
    private String identityNum;

    public PersonalCarBean() {
    }

    public PersonalCarBean(String carPropertyNum, String carAddress, String carNumber, String propertyCopy, String realName, String phone, String identityNum) {
        this.carPropertyNum = carPropertyNum;
        this.carAddress = carAddress;
        this.carNumber = carNumber;
        this.propertyCopy = propertyCopy;
        this.realName = realName;
        this.phone = phone;
        this.identityNum = identityNum;
    }
}
