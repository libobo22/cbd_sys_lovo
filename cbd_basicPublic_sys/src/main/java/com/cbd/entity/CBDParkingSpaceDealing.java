package com.cbd.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * CBD车位交易信息
 *
 * @author liren
 * @date 2020-05-11
 */
@Data
public class CBDParkingSpaceDealing implements Serializable {

    /** 交易ID */
    private Integer id;

    /** 车位对象 */
    private CBDParkingSpace cbdParkingSpace;

    /** 合同对象 */
    private CompanyContract companyContract;
}
