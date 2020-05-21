package com.cbd.controller;

import com.cbd.bean.CBDCarBean;
import com.cbd.bean.CompanyBean;
import com.cbd.bean.Pagination;
import com.cbd.service.ICompanyService;
import com.cbd.vo.CompanyInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    private ICompanyService service;

    @GetMapping("/Company/findAll")
    public Pagination<CompanyBean> select(@RequestParam("current") int current,
                                         @RequestParam("pageSize") int pageSize){
        Pagination<CompanyBean> findAll = service.findAll(current,pageSize);
        return findAll;
    }

    @GetMapping("/Company/findById")
    public CompanyBean findById(@RequestParam("id")int id){
        return service.findById(id);
    }

    @PostMapping("/Company/addCompany")
    public String addCompany(@RequestParam("companyName")String companyName,
                             @RequestParam("linkMan")String linkMan,
                             @RequestParam("linkPhone")String linkPhone,
                             @RequestParam("loginName")String loginName,
                             @RequestParam("loginPwd")String loginPwd,
                             @RequestParam("floor")int floor){
        CompanyBean c = new CompanyBean();
        c.setCompanyName(companyName);
        c.setLinkman(linkMan);
        c.setLinkPhone(linkPhone);
        c.setLoginName(loginName);
        c.setLoginPwd(loginPwd);
        c.setFloor(floor);
        service.add(c);
        return "ok";
    }

    @RequestMapping("/Company/dele")
    public String dele(@RequestParam("id")int  id){
        service.del(id);
        return "ok";
    }


    //================================

//    //查看企业信息
    @RequestMapping("/findMine")
    CompanyBean findCompanyByID(@RequestParam int id){
        return service.findById(id);
    };
//
//    //修改企业
//    @RequestMapping("/updateMine")
//    int updateCompanyInfo(@RequestParam int id,@RequestParam String logName,@RequestParam String logPass,@RequestParam String linkman,@RequestParam String linkPhone){
//
//    };



}
