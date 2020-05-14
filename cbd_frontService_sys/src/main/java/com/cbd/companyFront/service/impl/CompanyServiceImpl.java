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
    public List<LeaseCarDto> findLeaseCar(int id) {
        return dao.findLeaseCar(id);
    }

    @Override
    public List<CBDFreeCar> findCBDFreeCar(int id) {
        return dao.findCBDFreeCar(id);
    }

    @Override
    public List<BillDto> findAllBill() {
        return dao.findAllBill();
    }

    @Override
    public CompanyInfoDto findCompanyByID(int id) {
        return dao.findCompanyByID(id);
    }

    @Override
    public void updateCompanyInfo(int id, String logName, String logPass, String linkman, String linkPhone) {
        dao.updateCompanyInfo(id, logName, logPass, linkman, linkPhone);
    }
}
