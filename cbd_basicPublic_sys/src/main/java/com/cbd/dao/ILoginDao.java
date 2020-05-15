package com.cbd.dao;

import com.cbd.bean.LoginBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ILoginDao {
    public LoginBean findLoginByItem(String loginName,String loginPwd);

    public void addLogin(LoginBean loginBean);

    public void updateLogin(int id, int status);
}
