package com.cbd.bean;

import lombok.Data;

/**
 * cbd车位租赁实体类
 */
@Data
public class CBDCarLeaseBean {
    /**
     * cbd车位租赁ID
     */
    private Integer cbdCarLeaseID;
    /**
     * CBD车位
     */
    private CBDCarBean cbdCar;
    /**
     * 租户合同
     */
    private LesseeContractBean lesseeContract;
}
