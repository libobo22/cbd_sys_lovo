package com.cbd.companyFront.controller;
import com.cbd.companyFront.dto.ContractDto;
import com.cbd.companyFront.dto.LeaseCarDto;
import com.cbd.companyFront.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    //进入企业主页面页面
    @RequestMapping("main")
    public String companyMain(){
        return "companyIndex.html";
    }

    //查看所有合同
    @RequestMapping("findContract")
    @ResponseBody
    public List<ContractDto> findAllContract(int currPage, int numbers){
        return service.findAllContractDto(currPage, numbers);
    }


    //查看已租车位
    @RequestMapping("findLease")
    @ResponseBody
    public List<LeaseCarDto> findLeaseCar(int id,int currPage, int numbers){
        System.out.println(id+"/"+numbers);
        return service.findLeaseCar(id,currPage,numbers);
    }

}
