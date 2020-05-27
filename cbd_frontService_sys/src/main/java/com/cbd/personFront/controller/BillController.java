package com.cbd.personFront.controller;

import com.cbd.personFront.bean.BillBean;
import com.cbd.personFront.service.IBillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "账单")
@RestController("/bill")
public class BillController {

    @Autowired
    IBillService billService;

    @ApiOperation(value = "根据用户身份证查询，该用户的所有账单")
    @PostMapping("/findByBill")
    public List<BillBean> findByBill( String identityNum,
                                      String startDate,
                                     String endDate,
                                     int page,
                                     int number){

        return billService.findByBill(identityNum,startDate,endDate,page,number);
    }

    @ApiOperation(value = "添加个人用户账单")
    @PostMapping("/addBill")
    public String addBill(BillBean billBean){
        billService.addBill(billBean);
        return "ok";
    }


}
