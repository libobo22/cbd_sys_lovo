package com.cbd.personFront.dao;

import com.cbd.personFront.bean.CarLeaseBean;

import java.util.List;

/**
 * 车位租凭持久成接口
 */
public interface ICarLeaseDao {
    /**
     * 根据租凭开始时间或结束时间，车位状态1：待出租，查找待预约车位集合,不输入信息查所有待出租车位。连表车位查询
     * @param leaseStartDate 租凭开始时间
     * @param leaseEndDate 结束时间
     * @param leaseStatus 车位状态 1待预约，2已预约，3已签约
     * @param leaseBuy 1：出租。2：出售
     * @param index 起始下标
     * @param number  每页显示多少条数
     * @return
     */
    List<CarLeaseBean> findByDateLease(String leaseStartDate, String leaseEndDate,int leaseStatus,int leaseBuy, int index, int number);


    /**
     * 根据车位状态2待出售，车位地址，车位编号，连车位表模糊查询待出售车位，不输入信息查询所带出售车位
     * @param carAddress 车位地址
     * @param carNumber 车位编号
     * @param index 起始下标数
     * @param number 每页显示多少条数
     * @return
     */
    List<CarLeaseBean> findByBuyCar(String carAddress,String carNumber,int leaseStatus,int leaseBuy,int index, int number);

    /**
     * 添加车位租凭
     * @param carLeaseBean 车位租凭
     */
    void addLeaseCar(CarLeaseBean carLeaseBean);



}
