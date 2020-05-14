package com.cbd.personFront.dao;

import com.cbd.personFront.bean.PersonalContractBean;

import java.util.List;

/**
 * 投诉持久持久层接口
 */
public interface IComplainDao {

    /**
     * 添加投诉信息
     * @param contractBean
     */
    public void addComplain(PersonalContractBean contractBean);

    /**
     * 根据当前用户身份证号 查询投诉信息集合
     */
    List<PersonalContractBean> findByContract(String IdentityNum, int page, int number);


}
