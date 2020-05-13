package com.cbd.personFront.dao;

import com.cbd.personFront.bean.PersonalCarBean;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;


public interface IPersonalCarDao {
    /**
     * 添加车位
     * @param personalCarBean
     */
     void addPersonalCar(PersonalCarBean personalCarBean);


}
