package com.cbd.service.impl;

import com.cbd.bean.PersonalBean;
import com.cbd.dao.IPersonalDao;
import com.cbd.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personalService")
public class PersonalServiceImpl implements IPersonalService {
    @Autowired
    private IPersonalDao dao;

    @Override
    public void add(PersonalBean personalBean) {
        dao.add(personalBean);
    }

    @Override
    public PersonalBean findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void update(int id, String pwd, String address, String phone, String job, String email) {
        dao.updateById(id,pwd,address,phone,job,email);
    }
}
