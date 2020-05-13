package com.cbd.personFront.controller;

import com.cbd.personFront.bean.CarLeaseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "租凭车位Controller")
@RestController("/carLease")
public class CarLeaseController {

    @ApiOperation(value = "发布招租车位信息")
    @PostMapping("/addCarLease")
    public String addCarLease(CarLeaseBean carLeaseBean){
        System.out.println(carLeaseBean.getPrice());
        return "发布招租信息成功";
    }


}
