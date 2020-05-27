package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * CBD车位成交记录
 *
 * @author liren
 * @date 2020-05-11
 */
@Data
public class CBDParkingSpaceDealingHistory implements Serializable {

    /** 成交记录ID */
    private Integer id;

    /** 合同编号 */
    private String contractNumber;

    /** 车位地址 */
    private String address;

    /** 车位编号 */
    private String serialNumber;
}
