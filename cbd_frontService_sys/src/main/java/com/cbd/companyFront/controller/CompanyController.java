package com.cbd.companyFront.controller;
import com.cbd.companyFront.dto.ContractDto;
import com.cbd.companyFront.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 企业前端控制器
 */

@Controller
public class CompanyController {

    @Autowired
    private ICompanyService service;


    @RequestMapping("findCon")
    @ResponseBody
    public List<ContractDto> findAllContract(int currPage, int numbers){

        return service.findAllContractDto(currPage, numbers);
    }


}
