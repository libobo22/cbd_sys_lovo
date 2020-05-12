package com.cbd.companyFront.service.impl;
import com.cbd.companyFront.dao.ICompanyDao;
import com.cbd.companyFront.dto.*;
import com.cbd.companyFront.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业实现类
 */
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {


    @Autowired
    private ICompanyDao dao;


    @Override
    public List<ContractDto> findAllContractDto() {
        return dao.findAllContractDto();
    }

    @Override
    public List<LeaseCarDto> findLeaseCar() {
        return dao.findLeaseCar();
    }

    @Override
    public List<CBDFreeCar> findCBDFreeCar() {
        return dao.findCBDFreeCar();
    }

    @Override
    public List<BillDto> findAllBill() {
        return dao.findAllBill();
    }

    @Override
    public CompanyInfoDto findByID(int id) {
        return dao.findByID(id);
    }
}
