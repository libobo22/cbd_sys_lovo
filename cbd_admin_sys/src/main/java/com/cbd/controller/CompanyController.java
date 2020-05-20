package com.cbd.controller;

import com.cbd.bean.CBDCarBean;
import com.cbd.bean.CompanyBean;
import com.cbd.bean.Pagination;
import com.cbd.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
