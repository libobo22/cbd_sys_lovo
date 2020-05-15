package com.cbd.personFront.dao;

import com.cbd.personFront.bean.BillBean;

import java.util.List;

/**
 * 个人用户账单持久层接口
 */
public interface IBillDao {

    /**
     * 根据当前用户身份证号查询用户账单
     * @param IdentityNum 当前用户身份证号
     * @param index 起始下标
     *  @param number 每页显示多少条数
     * @return
     */
    List<BillBean> findByBill(String IdentityNum, int index, int number);

    /**
     * 添加账单
     * @param billBean
     */
    void addBill(BillBean billBean);

}
