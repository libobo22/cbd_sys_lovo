package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liren
 * @date 2020-05-11
 */
@Data
public class Statistics implements Serializable {

    /** 请求时间段 */
    private String level;

    /** 总计请求数 */
    private long totalCount;

}
