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

import java.util.List;

@Api(tags = "个人车位Controller")
@RestController("/personalCar")
public class PersonalCarController {

    @Autowired
    IPersonalCarService personalCarService;

//    @ApiOperation(value = "测试restFull风格",notes = "restfull风格请求")
//    @GetMapping("/helloswagger/{tag}")
//    public String  helloswagger(@PathVariable("tag")String tag){
//        return  "hello"+tag;
//    }
//
//    @ApiImplicitParams({@ApiImplicitParam(name = "userName",value = "用户名",type = "String"),
//            @ApiImplicitParam(name = "password",value = "密码",type = "String")})
//    @PostMapping("/postSwagger")
//    public  String postSwagger(String userName,String password){
//        return userName+"/"+password;
//    }


    @ApiOperation(value = "添加车位")
    @PostMapping("/addPersonalCar")
    public String addPersonalCar(@RequestBody PersonalCarBean personalCar){
        System.out.println(personalCar);
        personalCarService.addPersonalCar(personalCar);
        return "ok";
    }

    @ApiOperation(value = "根据用户身份证号查询，该用户拥有的所有车位")
    @PostMapping("/findByCarAll")
    public List<PersonalCarBean> findByAllCar(String identityNum,
                                              int page,
                                              int number){
        return personalCarService.findByCar(identityNum,page,number);
    }


  @ApiOperation(value = "签约成功后根据车位ID修改车位主人信息")
  @PostMapping("/updateCar")
  public String updateCar(int carID,String realName,String phone,String identityNum){
        personalCarService.updateCar(carID,realName,phone,identityNum);
        return "ok";
  }

}
