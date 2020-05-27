package com.cbd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 企业用户表
 *
 * @author qinliubing
 * @date 2020-05-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business extends UserLogin implements Serializable {

    /**
     * 企业用户id
     */
    private int id;

    /**
     * 企业名
     */
    private String name;

    /**
     * 企业楼层位置
     */
    private String floor;

    /**
     * 企业联系人
     */
    private String contact;

    /**
     * 企业联系电话
     */
    private String contactPhone;

    /**
     * 企业用户状态
     */
    private int status;

    public Business(String userName, String password, int type, String name, String floor, String contact, String contactPhone, int status) {
        super(userName, password, type);
        this.name = name;
        this.floor = floor;
        this.contact = contact;
        this.contactPhone = contactPhone;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor='" + floor + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", status=" + status +
                ", userName=" + this.getUserName() +
                ", password=" + this.getPassword() +
                '}';
    }
}
