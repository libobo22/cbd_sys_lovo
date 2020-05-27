package com.cbd.service.impl;


import com.cbd.dao.IContractCompanyDao;
import com.cbd.entity.Business;
import com.cbd.service.IContractCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ContractCompanyServiceImpl implements IContractCompanyService {

    @Resource
    private IContractCompanyDao contractCompanyDao;

    @Override
    public Business getCompanyById(int companyId) {
        return contractCompanyDao.getCompanyById(companyId);
    }

    @Override
    public Business getCompanyByName(String companyName) {
        return contractCompanyDao.getCompanyByName(companyName);
    }
}
