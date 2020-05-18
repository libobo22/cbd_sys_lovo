package com.cbd.controller;


import com.cbd.bean.LoginBean;
import com.cbd.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private ILoginService service;

    @RequestMapping("login/{loginName}/{pwd}")
    public LoginBean login(@PathVariable("loginName") String userName,@PathVariable("pwd") String pwd){
        LoginBean loginBean = service.login(userName,pwd);
        return loginBean;
    }

    @RequestMapping("delLogin/{loginId}")
    public void delLogin(@PathVariable("loginId") int loginId){
        service.delLogin(loginId,0);
    }
}
