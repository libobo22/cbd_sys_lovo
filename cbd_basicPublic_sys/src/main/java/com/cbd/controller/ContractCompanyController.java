package com.cbd.controller;


import com.cbd.entity.Business;
import com.cbd.service.IContractCompanyService;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ContractCompanyController {

    @Resource
    private IContractCompanyService contractCompanyService;

    @GetMapping("company/getById/{companyId}")
    public ReturnMessage<Business> getCompanyById(@PathVariable("companyId") int companyId) {
        Business company = contractCompanyService.getCompanyById(companyId);
        return ReturnMessageUtil.success(company);
    }

    @GetMapping("/company/getByName/{companyName}")
    ReturnMessage<Business> getCompanyByName(@PathVariable("companyName") String companyName) {
        Business company = contractCompanyService.getCompanyByName(companyName);
        return ReturnMessageUtil.success(company);
    }
}
