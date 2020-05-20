package com.cbd.controller;

import com.cbd.bean.CBDCarBean;
import com.cbd.bean.CompanyBean;
import com.cbd.bean.Pagination;
import com.cbd.service.ICBDCarService;
import com.cbd.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CBDCarController {

    @Autowired
    private ICBDCarService service;


    @GetMapping("/CBDCar/find")
    public Pagination<CBDCarBean> select(@RequestParam("current") int current,
                                         @RequestParam("pageSize") int pageSize){
        Pagination<CBDCarBean> findAll = service.findAll(current,pageSize);
        return findAll;
    }

    @PostMapping("/CBDCar/addCBD")
    public String addCBD(@RequestParam("address")String address,
                      @RequestParam("carNumber")String carNumber){
        CBDCarBean c = new CBDCarBean();

        c.setCarAddress(address);
        c.setCarNumber(carNumber);

        service.addCar(c);
        return "ok";
    }

}
