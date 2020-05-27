package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 留言
 */
@Data
public class Review implements Serializable {
    /**
     * 留言ID
     */
    private int reviewId;
    /**
     * 交易类型：1招租，2出售
     */
    private int type;
    /**
     * 留言者姓名
     */
    private String reviewUserName;
    /**
     * 留言信息
     */
    private String reviewMessage;
    /**
     * 交易信息ID
     */
    private int infoId;
    /**
     * 预约者ID
     */
    private int orderUserId;
}
