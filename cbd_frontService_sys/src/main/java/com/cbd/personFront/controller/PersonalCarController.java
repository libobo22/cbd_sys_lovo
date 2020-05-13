package com.cbd.personFront.controller;

import com.cbd.personFront.bean.PersonalCarBean;
import com.cbd.personFront.service.IPersonalCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "个人车位Controller")
@RestController("/personalCar")
public class PersonalCarController {

    @Autowired
    IPersonalCarService personalCarService;

    @ApiOperation(value = "测试restFull风格",notes = "restfull风格请求")
    @GetMapping("/helloswagger/{tag}")
    public String  helloswagger(@PathVariable("tag")String tag){
        return  "hello"+tag;
    }

    @ApiImplicitParams({@ApiImplicitParam(name = "userName",value = "用户名",type = "String"),
            @ApiImplicitParam(name = "password",value = "密码",type = "String")})
    @PostMapping("/postSwagger")
    public  String postSwagger(String userName,String password){
        return userName+"/"+password;
    }

    @ApiOperation(value = "添加车位")
    @PostMapping("/addPersonalCar")
    public String addPersonalCar(PersonalCarBean personalCarBean){
        personalCarService.addPersonalCar(personalCarBean);
        return "ok";
    }


}
