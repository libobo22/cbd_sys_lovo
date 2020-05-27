package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author liren
 * @date 2020-05-12
 */
@Data
public class RequestStatistics implements Serializable {

    /** 编号 */
    private int id;

    /** 请求时间 */
    private Timestamp requestTime;

    /** 请求资源路径 */
    private String requestUri;

    /** 耗费时间 */
    private int expendTime;
}
