package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 操作日志
 *
 * @author liheng
 * @date 2020-05-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationLog implements Serializable {
    /**操作日志id */
    private Integer id;

    /** 用户姓名 */
    private String username;

    /** 操作日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp date;

    /** 操作内容 */
    private String content;

    /** 用户对象 */
    private UserLogin userLogin;

//    public OperationLog() {
//    }
//
//    public OperationLog(String username, String content, int id) {
//        OperationLog operationLog = new OperationLog();
//        this.username = username;
//        this.date = (new Timestamp(System.currentTimeMillis()));
//        this.content = content;
//        UserLogin userLogin = new UserLogin();
//        userLogin.setId(id);
//        operationLog.setUserLogin(userLogin);
//    }
}
