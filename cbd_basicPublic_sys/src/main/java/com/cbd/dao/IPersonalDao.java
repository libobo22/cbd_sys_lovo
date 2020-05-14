package com.cbd.dao;

import com.cbd.bean.PersonalBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IPersonalDao {
    public void add(PersonalBean personalBean);
    public PersonalBean findById(int id);
    public void updateById(int id,String pwd,String address,String phone,String job,String email);
}
