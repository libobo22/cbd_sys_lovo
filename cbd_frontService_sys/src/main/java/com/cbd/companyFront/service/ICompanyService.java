package com.cbd.companyFront.service;
import com.cbd.companyFront.dto.*;

import java.util.List;

/**
 * 企业业务接口
 */
public interface ICompanyService {

    /**查看所有合同*/
    List<ContractDto> findAllContractDto();

    /**查看已租车位*/
    List<LeaseCarDto> findLeaseCar();

    /**查看CBD空闲车位*/
    List<CBDFreeCar> findCBDFreeCar();

    /**查看账单*/
    List<BillDto> findAllBill();

    /**修改企业信息*/
    CompanyInfoDto findByID(int id);

}
