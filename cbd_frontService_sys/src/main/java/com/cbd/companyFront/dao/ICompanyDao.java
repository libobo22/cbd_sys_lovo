package com.cbd.companyFront.dao;
import com.cbd.companyFront.dto.*;

import java.util.List;

/**
 * 企业dao层接口
 */
public interface ICompanyDao {

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
