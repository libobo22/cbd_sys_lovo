package com.cbd.service;

import com.cbd.bean.LoginBean;

public interface ILoginService {
    public LoginBean login(String name , String pwd);

    public void delLogin(int id,int status);

    public void addLogin(LoginBean loginBean);
}
