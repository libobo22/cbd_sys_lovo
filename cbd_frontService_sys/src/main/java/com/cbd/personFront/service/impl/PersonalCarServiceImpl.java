package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.PersonalCarBean;
import com.cbd.personFront.dao.IPersonalCarDao;
import com.cbd.personFront.service.IPersonalCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "personalCarService")
public class PersonalCarServiceImpl implements IPersonalCarService {

    @Autowired
    IPersonalCarDao personalCarDao = null;

    @Override
    public void addPersonalCar(PersonalCarBean personalCarBean) {
        personalCarDao.addPersonalCar(personalCarBean);
    }

    @Override
    public List<PersonalCarBean> findByCar(String identityNum, int page, int number) {
        int index = (page-1)*number;
        return personalCarDao.findByCar(identityNum,index,number);
    }

    @Override
    public void updateCar(int carID, String realName, String phone, String identityNum) {
        personalCarDao.updateCar(carID,realName,phone,identityNum);
    }


}
