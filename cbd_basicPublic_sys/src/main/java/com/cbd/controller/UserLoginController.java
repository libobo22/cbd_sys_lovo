package com.cbd.controller;



import com.cbd.entity.UserLogin;
import com.cbd.service.IUserLoginService;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserLoginController {

    @Resource
    private IUserLoginService userLoginService;

    @GetMapping("/userLogin/login")
    public ReturnMessage<UserLogin> getUserLogin(@RequestParam("userName") String userName,
                                                 @RequestParam("password") String password,
                                                 @RequestParam("ipAddr") String ipAddr) {
        UserLogin userLogin = userLoginService.login(userName, password);
        if (userLogin == null) {
            return ReturnMessageUtil.error("登录失败");
        } else {
            return ReturnMessageUtil.success(userLogin);
        }

    }
}
