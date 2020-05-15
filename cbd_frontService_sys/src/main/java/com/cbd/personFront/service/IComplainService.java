package com.cbd.personFront.service;

import com.cbd.personFront.bean.ComplainBean;
import com.cbd.personFront.bean.PersonalContractBean;

import java.util.List;

/**
 *投诉业务接口类
 */
public interface IComplainService {

    /**
     * 添加投诉信息
     * @param complainBean
     */
    public void addComplain(ComplainBean complainBean);

    /**
     * 根据当前用户身份证号 查询投诉信息集合
     */
    List<PersonalContractBean> findByContract(String IdentityNum,int page, int number);

}
