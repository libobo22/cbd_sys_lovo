package com.cbd.test;

import com.cbd.bean.LoginBean;
import com.cbd.bean.PersonalBean;
import com.cbd.service.IPersonalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPersonal {
    @Autowired
    public IPersonalService service;

    @Test
    public void find(){
        System.out.println(service.findById(1));
    }

    @Test
    public void add(){
        LoginBean loginBean = new LoginBean();
        loginBean.setLoginID(7);
        PersonalBean personalBean = new PersonalBean();
        personalBean.setHomeAddress("测试");
        personalBean.setLoginBean(loginBean);
        service.add(personalBean);
    }

    @Test
    public void update(){
        service.update(1,"222222","修改","1231","fff","fff");
    }
}
