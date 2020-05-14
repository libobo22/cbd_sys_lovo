package com.cbd.service.impl;

import com.cbd.bean.LoginBean;
import com.cbd.dao.ILoginDao;
import com.cbd.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("loginService")
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private ILoginDao dao;

    @Override
    public LoginBean login(String name, String pwd) {
        return dao.findLoginByItem(name,pwd);
    }

    @Override
    public void addLogin(LoginBean loginBean) {
        dao.addLogin(loginBean);
    }

    @Override
    public void delLogin(int id, int status) {
        dao.updateLogin(id,status);
    }
}
