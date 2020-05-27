package com.cbd.service;


import com.cbd.entity.Business;


public interface IContractCompanyService {

    Business getCompanyById(int companyId);

    Business getCompanyByName(String companyName);
}
