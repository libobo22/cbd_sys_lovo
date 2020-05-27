package com.cbd.controller;


import com.cbd.Vo.AdminCompanyVo;
import com.cbd.service.AdminCompanyService;
import com.cbd.service.CompanyService;
import com.cbd.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminCompanyController {

    @Autowired
    private AdminCompanyService service;

    @GetMapping("Company/findAll")
    public Pagination<AdminCompanyVo> select(@RequestParam("current") int current,
                                             @RequestParam("pageSize") int pageSize){
        Pagination<AdminCompanyVo> findAll = service.select(current,pageSize);
        return findAll;
    }

    @GetMapping("Company/findById")
    public AdminCompanyVo findById(@RequestParam("id")int id){
        return service.findById(id);
    }

    @PostMapping("Company/addCompany")
    public String addCompany(@RequestParam("companyName")String companyName,
                             @RequestParam("linkMan")String linkMan,
                             @RequestParam("linkPhone")String linkPhone,
                             @RequestParam("loginName")String loginName,
                             @RequestParam("loginPwd")String loginPwd,
                             @RequestParam("floor")int floor){
        AdminCompanyVo c = new AdminCompanyVo();
        c.setCompanyName(companyName);
        c.setLinkman(linkMan);
        c.setLinkPhone(linkPhone);
        c.setLoginName(loginName);
        c.setLoginPwd(loginPwd);
        c.setCompanyFloor(floor);
        service.addCompany(c);
        return "ok";
    }

    @RequestMapping("Company/dele")
    public String dele(@RequestParam("id")int  id){
        service.dele(id);
        return "ok";
    }


    //================================

    //    //查看企业信息
//    @RequestMapping("findMine")
//    AdminCompanyVo findCompanyByID(@RequestParam int id){
//        return service.findById(id);
//    };
//
//    //修改企业
//    @RequestMapping("/updateMine")
//    int updateCompanyInfo(@RequestParam int id,@RequestParam String logName,@RequestParam String logPass,@RequestParam String linkman,@RequestParam String linkPhone){
//
//    };



}
