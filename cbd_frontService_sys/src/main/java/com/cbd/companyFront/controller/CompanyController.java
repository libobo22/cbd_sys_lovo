package com.cbd.companyFront.controller;
import com.cbd.companyFront.dto.*;
import com.cbd.companyFront.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
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
        return service.findLeaseCar(id,currPage,numbers);
    }

    //查看CBD空闲车位
    @RequestMapping("findFree")
    @ResponseBody
    public List<CBDFreeCar> findFreeCar(int currPage,int numbers){
        return service.findCBDFreeCar(2, currPage, numbers);
    }

    //查看账单信息
    @RequestMapping("findBill")
    @ResponseBody
    public List<BillDto> findBill(String start,String end,int currPage,int numbers){
        return service.findAllBill(start, end, currPage, numbers);
    }

    //查看合计账单
    @RequestMapping("findBillAll")
    @ResponseBody
    public List<AllBillDto> findBillAll(){
        return service.findBillAll();
    }

    //查看企业信息
    @RequestMapping("findMine")
    @ResponseBody
    public CompanyInfoDto findMine(){
        return service.findCompanyByID(1);
    }

    //修改企业
    @RequestMapping("updateMine")
    public void update(String logName,String logPass,String linkman,String linkPhone){
        service.updateCompanyInfo(1,logName,logPass,linkman,linkPhone);
    }


}
