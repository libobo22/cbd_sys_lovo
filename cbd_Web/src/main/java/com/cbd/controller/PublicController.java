package com.cbd.controller;

import com.cbd.service.PublicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class PublicController {
    @Resource
    private PublicService service;

    @PostMapping("/register")
    public void register(@RequestParam("userName") String userName,
                         @RequestParam("password") String password,
                         @RequestParam("realName") String realName,
                         @RequestParam("indetityNum") String indetityNum,
                         @RequestParam("job") String job,
                         @RequestParam("homeAddress") String homeAddress,
                         @RequestParam("email") String email,
                         @RequestParam("phone") String phone) {
        service.addPersonal(userName,password,realName,indetityNum,job,homeAddress,email,phone);
    }
}
