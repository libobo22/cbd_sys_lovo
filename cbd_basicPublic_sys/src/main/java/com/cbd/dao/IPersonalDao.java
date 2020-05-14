package com.cbd.dao;

import com.cbd.bean.PersonalBean;

public interface IPersonalDao {
    public void add(PersonalBean personalBean);
    public PersonalBean findById(int id);
    public void updateById(int id);
}
