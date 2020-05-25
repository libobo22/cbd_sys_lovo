package com.cbd.controller;

import com.cbd.bean.LoginBean;
import com.cbd.bean.PersonalBean;
import com.cbd.service.ILoginService;
import com.cbd.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalController {
    @Autowired
    private IPersonalService personalService;
    @Autowired
    private ILoginService loginService;

    @RequestMapping("register/{userName}/{password}/{realName}/{indetityNum}/{job}/{homeAddress}/{email}/{phone}")
    public void addPersonal(
            @PathVariable("userName") String userName,
            @PathVariable("password") String password,
            @PathVariable("realName") String realName,
            @PathVariable("indetityNum") String indetityNum,
            @PathVariable("job") String job,
            @PathVariable("homeAddress") String homeAddress,
            @PathVariable("email") String email,
            @PathVariable("phone") String phone
    ){
        LoginBean loginBean = new LoginBean();
        loginBean.setLoginName(userName);
        loginBean.setLoginPwd(password);
        loginBean.setType(1);
        loginService.addLogin(loginBean);
        PersonalBean personalBean = new PersonalBean();
        personalBean.setLoginBean(loginBean);
        personalBean.setHomeAddress(homeAddress);
        personalBean.setRealName(realName);
        personalBean.setJob(job);
        personalBean.setPhone(phone);
        personalBean.setEmail(email);
        personalBean.setIdentityNum(indetityNum);
        personalService.add(personalBean);
    }

}
