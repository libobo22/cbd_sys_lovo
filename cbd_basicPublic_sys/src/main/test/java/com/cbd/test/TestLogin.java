package com.cbd.test;

import com.cbd.bean.LoginBean;
import com.cbd.service.ILoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLogin {
    @Autowired
    private ILoginService service;

    @Test
    public void find(){
        LoginBean bean = new LoginBean();
        bean = service.login("user1","222222");
        System.out.println(bean);
    }

    @Test
    public void update(){
        service.delLogin(2,0);
    }

    @Test
    public void add(){
        LoginBean loginBean = new LoginBean();
        loginBean.setLoginName("user3");
        loginBean.setLoginPwd("123456");
        loginBean.setType(1);
        service.addLogin(loginBean);
    }

}
