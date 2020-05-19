package com.cbd.companyFront.service;
import com.cbd.companyFront.dto.*;

import java.util.List;

/**
 * 企业业务接口
 */
public interface ICompanyService {

    /**查看所有合同*/
    List<ContractDto> findAllContractDto(int currPage,int numbers);

    /**查看已租车位*/
    List<LeaseCarDto> findLeaseCar(int id,int currPage,int numbers);

    /**查看CBD空闲车位*/
    List<CBDFreeCar> findCBDFreeCar(int id,int currPage,int numbers);

    /**查看账单*/
    List<BillDto> findAllBill(String start, String end, int currPage, int numbers);

    /**合计账单*/
    List<AllBillDto> findBillAll();

    /**查看企业信息*/
    CompanyInfoDto findCompanyByID(int id);

    /**修改企业信息*/
    int updateCompanyInfo(int id, String logName, String logPass, String linkman, String linkPhone);
    
}
