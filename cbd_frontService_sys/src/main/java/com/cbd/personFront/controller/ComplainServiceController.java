package com.cbd.personFront.controller;

import com.cbd.personFront.bean.ComplainBean;
import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.service.IComplainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "投诉")
@RestController("/complain")
public class ComplainServiceController{

    @Autowired
    IComplainService complainService;

    @ApiOperation("添加投诉信息 ")
    @PostMapping("/ addComplain")
    public String addComplain(ComplainBean bean){
        complainService.addComplain(bean);
        return "ok";
    }


    @ApiOperation("根据用户身份证查询被投诉投诉和投诉信息")
    @GetMapping("findByContract/{IdentityNum}/{page}/{number}")
    public List<PersonalContractBean> findByContract(@PathVariable String IdentityNum,
                                                     @PathVariable int page,
                                                     @PathVariable int number){
        return complainService.findByContract(IdentityNum,page,number);
    }


}
