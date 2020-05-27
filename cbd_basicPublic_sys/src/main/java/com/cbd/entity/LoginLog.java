package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 登录日志
 *
 * @author liheng
 * @date 2020-05-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginLog implements Serializable {
    /** 登录日志id */
    private Integer logId;

    /** 用户真实姓名 */
    private String username;

    /** 登录日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp date;

    /** 登录IP */
    private String ipAddr;

    /** 登录地址 */
    private String address;

    /** 用户对象 */
    private UserLogin userLogin;

//    public static LoginLog loginLogAndUserLogin(int userId){
//        LoginLog loginLog = new LoginLog();
//        loginLog.setDate(new Timestamp(System.currentTimeMillis()));
//        UserLogin userLogin = new UserLogin();
//        userLogin.setId(userId);
//        loginLog.setUserLogin(userLogin);
//        return loginLog;
//
//    }

//    public LoginLog() {
//    }
//
//    public LoginLog(String username, String ipAddr, String address, int userId) {
//        LoginLog loginLog = new LoginLog();
//        this.username = username;
//        this.date = (new Timestamp(System.currentTimeMillis()));
//        this.ipAddr = ipAddr;
//        this.address = address;
//        UserLogin userLogin = new UserLogin();
//        userLogin.setId(userId);
//        loginLog.setUserLogin(userLogin);
//    }
}

