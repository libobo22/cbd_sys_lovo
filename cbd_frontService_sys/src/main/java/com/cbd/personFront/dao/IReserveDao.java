package com.cbd.personFront.dao;

import com.cbd.personFront.bean.ReserveBean;

import java.util.List;

/**
 * 预定车位持久接口
 */
public interface IReserveDao {

    /**
     * 添加车位预定,并将车位状态出租/出售状态改为以预定成1（已预约）
     * @param reserveBean
     */
    void addReserve(ReserveBean reserveBean);

    /**
     * 根据当前用户身份证号，查询预定车位集合（我预定的别人发布的车位）
     * @param reserveIdentityNum 预定车位用户身份证
     * @param index 下标
     * @param number 每页显示条数
     * @return
     */
    List<ReserveBean> findByReserve(String reserveIdentityNum, int index, int number);

    /**
     * 根据当前登录用户身份证号，查询被预定（自己发布车位用户）车位集合
     * @param beReserveIdentityNum 发布车位用户身份证号
     * @param index 下标
     * @param number 每页显示条数
     * @return
     */
    List<ReserveBean> findByBeReserve(String beReserveIdentityNum,int index, int number);

    /**
     * 根据预定车位id修改预定车位状
     * @param state 预定状态（1代表预定成功，2代表正在预定，3代表预定失败）
     * @param reserveId 预定车位ID
     */
    void updateState(String state,int reserveId);
}
