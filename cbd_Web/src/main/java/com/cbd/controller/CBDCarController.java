package com.cbd.controller;

import com.cbd.Vo.CBDCarVo;
import com.cbd.service.CBDCarService;
import com.cbd.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBDCarController {

    @Autowired
    private CBDCarService service;


    @GetMapping("CBDCar/find")
    public Pagination<CBDCarVo> select( int current,
                                        int pageSize){
        Pagination<CBDCarVo> findAll = service.select(current,pageSize);
        return findAll;
    }

    @PostMapping("CBDCar/addCBD")
    public String addCBD(String address,
                      String carNumber){
        CBDCarVo c = new CBDCarVo();

        c.setCarAddress(address);
        c.setCarNumber(carNumber);

        service.addCBD(address,carNumber);
        return "ok";
    }



}
