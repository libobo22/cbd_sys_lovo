package com.cbd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class LogOutController {

    @PostMapping("/LogOut/logOut")
    public void LogOut (@RequestBody HttpServletRequest request){
        request.getSession().removeAttribute("username");
        request.getSession().invalidate();
    }

}
