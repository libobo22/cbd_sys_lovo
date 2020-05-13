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
    List<LeaseCarDto> findLeaseCar(int id);

    /**查看CBD空闲车位*/
    List<CBDFreeCar> findCBDFreeCar(int id);

    /**查看账单*/
    List<BillDto> findAllBill();

    /**查看企业信息*/
    CompanyInfoDto findCompanyByID(int id);

    /**修改企业信息*/
    void updateCompanyInfo(int id,String logName,String logPass,String linkman,String linkPhone);

}
