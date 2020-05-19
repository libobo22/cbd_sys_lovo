package com.cbd.personFront.controller;

import com.cbd.personFront.bean.CarLeaseBean;
import com.cbd.personFront.service.ICarLeaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "租凭车位Controller")
@RestController("/carLease")
public class CarLeaseController {

    @Autowired
    ICarLeaseService leaseService;

    @ApiOperation(value = "发布招租车位信息")
    @PostMapping("/addCarLease")
    public String addCarLease(String leaseEndDate, float price, int leaseStatus,int leaseBuy, int personalCarId,String releaseIdentityNum){
        CarLeaseBean leaseBean = new CarLeaseBean(leaseEndDate,price,leaseStatus,leaseBuy,personalCarId,releaseIdentityNum);
        leaseService.addLeaseCar(leaseBean);
        return "ok";
    }

}
