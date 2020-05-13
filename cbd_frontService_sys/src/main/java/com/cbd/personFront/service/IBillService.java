package com.cbd.personFront.service;

import com.cbd.personFront.bean.BillBean;

import java.util.List;

/**
 * 个人用户账单业务接口
 */
public interface IBillService {

    /**
     * 根据当前用户身份证号查询用户账单
     * @param IdentityNum 当前用户身份证号
     * @param page 页码数
     *  @param number 每页显示多少条数
     * @return
     */
    List<BillBean> findByBill(String IdentityNum,int page, int number);

    /**
     * 添加账单
     * @param billBean
     */
    void addBill(BillBean billBean);
}
