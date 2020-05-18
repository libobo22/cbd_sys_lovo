package com.cbd.companyFront.service.impl;
import com.cbd.companyFront.dao.ICompanyDao;
import com.cbd.companyFront.dto.*;
import com.cbd.companyFront.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业实现类
 */
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {


    @Autowired
    private ICompanyDao dao;


    @Override
    public List<ContractDto> findAllContractDto(int currPage,int numbers) {
        currPage = (currPage-1)*numbers;
        return dao.findAllContractDto(currPage,numbers);
    }

    @Override
    public List<LeaseCarDto> findLeaseCar(int id,int currPage,int numbers) {
        currPage = (currPage-1)*numbers;
        return dao.findLeaseCar(id,currPage,numbers);
    }

    @Override
    public List<CBDFreeCar> findCBDFreeCar(int id,int currPage,int numbers) {
        currPage = (currPage-1)*numbers;
        return dao.findCBDFreeCar(id,currPage,numbers);
    }

    @Override
    public List<BillDto> findAllBill(String start,String end,int currPage,int numbers) {
        if (start!=null & start!="" & start.length()!=0){
            Date.valueOf(start);
        }
        if (end!=null & end!="" & end.length()!=0){
            Date.valueOf(end);
        }

        currPage = (currPage-1)*numbers;
        Map<String,Object> map = new HashMap<>();
        map.put("start",start);
        map.put("end", end);
        map.put("currPage", currPage);
        map.put("numbers", numbers);

        return dao.findAllBill(map);
    }

    @Override
    public List<AllBillDto> findBillAll() {
        return dao.findBillAll();
    }

    @Override
    public  CompanyInfoDto findCompanyByID(int id) {
        return dao.findCompanyByID(id);
    }

    @Override
    public void updateCompanyInfo(int id, String logName, String logPass, String linkman, String linkPhone) {
        dao.updateCompanyInfo(id, logName, logPass, linkman, linkPhone);
    }
}
