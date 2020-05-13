package com.cbd.personFront.dao;

import com.cbd.personFront.bean.PersonalCarBean;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 车位持久层接口
 */
public interface IPersonalCarDao {
    /**
     * 添加车位
     * @param personalCarBean
     */
     void addPersonalCar(PersonalCarBean personalCarBean);

    /**
     * 根据车位主人身份证号查询，当前用户的所有车位
     * @param identityNum 身份证号
     * @param page 页码数
     * @param number 每页显示多少条数
     * @return
     */
    List<PersonalCarBean> findByCar(String identityNum, int page, int number);


    /**
     * 车位用户信息修改接口
     * 签约成功后根据车位ID修改车位主人信息
     * @param carID 车位id
     * @param realName 车位主人真实姓名
     * @param phone 电话
     * @param identityNum 身份证号
     */
    void updateCar(int carID,String realName,String phone,String identityNum);


}
