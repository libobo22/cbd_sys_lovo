package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.PersonalCarBean;
import com.cbd.personFront.dao.IPersonalCarDao;
import com.cbd.personFront.service.IPersonalCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "personalCarService")
public class PersonalCarServiceImpl implements IPersonalCarService {

    @Autowired
    IPersonalCarDao personalCarDao = null;

    @Override
    public void addPersonalCar(PersonalCarBean personalCarBean) {
        personalCarDao.addPersonalCar(personalCarBean);
    }


}
