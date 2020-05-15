package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.dao.IPersonalContractDao;
import com.cbd.personFront.service.IPersonalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 个人用户合同义务实现类
 */
@Service(value = "personalContractService")
public class PersonalContractServiceImpl implements IPersonalContractService {

    @Autowired
    IPersonalContractDao contractDao;

    @Override
    public List<PersonalContractBean> findByPersonalContract(String identityNum, int page, int number) {
        int index = (page-1)*number;
        return contractDao.findByPersonalContract(identityNum,index,number);
    }

    @Override
    public PersonalContractBean findByContractInfo(int contractId) {
        return contractDao.findByContractInfo(contractId);
    }

    @Override
    public List<PersonalContractBean> findByHistory(String IdentityNum, int page, int number) {
        return null;
    }

    @Override
    public void updateStatus(int auditStatus, int newStatus, int contractID, String userStatus) {

    }

    @Override
    public void addContract(PersonalContractBean personalContractBean) {

    }
}
