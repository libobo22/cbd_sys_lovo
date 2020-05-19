package com.cbd.controller;
import com.cbd.Vo.CompanyVo.*;
import com.cbd.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Web企业前端控制器
 */
@Controller
public class CompanyController {

    @Autowired
    private ICompanyService service;


    //进入企业主页面页面
    @RequestMapping("main")
    public String companyMain(){
        return "page/company/companyIndex.html";
    }

    //查看所有合同
    @RequestMapping("findContract")
    @ResponseBody
    public List<ContractVo> findAllContract(int currPage, int numbers){
        return service.findAllContract(currPage, numbers);
    }

    //查看已租车位
    @RequestMapping("findLease")
    @ResponseBody
    public List<LeaseCarVo> findLeaseCar(int id, int currPage, int numbers){
        System.out.println(id+"/"+currPage);
        return service.findLease(id,currPage,numbers);
    }

    //查看CBD空闲车位
    @RequestMapping("findFree")
    @ResponseBody
    public List<CBDFreeCarVo> findFreeCar(int currPage, int numbers){
        return service.findFreeCar( currPage, numbers);
    }

    //查看账单信息
    @RequestMapping("findBill")
    @ResponseBody
    public List<BillVo> findBill(String start, String end, int currPage, int numbers){
        return service.findBill(start, end, currPage, numbers);
    }

    //查看合计账单
    @RequestMapping("findBillAll")
    @ResponseBody
    public List<AllBillVo> findBillAll(){
        return service.findBillAll();
    }

    //查看企业信息
    @RequestMapping("findMine")
    @ResponseBody
    public CompanyInfoVo findMine(){
        return service.findCompanyByID(1);
    }

    //修改企业
    @RequestMapping("updateMine")
    @ResponseBody
    public String update(String logName,String logPass,String linkman,String linkPhone){
          int i = service.updateCompanyInfo(1,logName,logPass,linkman,linkPhone);
          if (i>0){
              return "1";
          }
          return "0";
    }


}
