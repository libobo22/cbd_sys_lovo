package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.ComplainBean;
import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.dao.IComplainDao;
import com.cbd.personFront.service.IComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "complainService")
public class ComplainServiceImpl implements IComplainService {

    @Autowired
    IComplainDao complainDao;

    @Override
    public void addComplain(ComplainBean complainBean) {
        complainDao.addComplain(complainBean);
    }

    @Override
    public List<PersonalContractBean> findByContract(String identityNum, int page, int number) {
        int index = (page-1)*number;
        return complainDao.findByContract(identityNum,index,number);
    }
}
