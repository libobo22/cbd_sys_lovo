package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 消息提醒
 *
 * @author liren
 * @date 2020-05-11
 */
@Data
@NoArgsConstructor
public class Notification implements Serializable {

    /** 消息提醒ID */
    private Integer id;

    /** 消息标题 */
    private String title;

    /** 消息内容 */
    private String content;

    /** 消息类型 */
    private Integer type;

    /** 消息状态 */
    private Integer status;

    /** 类型字符串 */
    private String realType;

    /** 消息创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createDate;

    /** 用户对象 */
    private User user;

    public void setType(Integer type) {
        this.type = type;
        initRealType();
    }

    public String getRealType() {
        initRealType();
        return realType;
    }

    public void initRealType() {

        if (this.type == null) {
            return;
        }

        if (this.type == 0) {
            this.realType = "系统消息";
        } else if (this.type == 1) {
            this.realType = "用户消息";
        }
    }
}
