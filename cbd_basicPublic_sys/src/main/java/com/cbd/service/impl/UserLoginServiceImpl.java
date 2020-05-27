package com.cbd.service.impl;

import com.cbd.dao.ILoginLogDao;
import com.cbd.dao.IPowerDao;
import com.cbd.dao.IUserLoginDao;
import com.cbd.entity.LoginLog;
import com.cbd.entity.Power;
import com.cbd.entity.Role;
import com.cbd.entity.UserLogin;
import com.cbd.service.IUserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class UserLoginServiceImpl implements IUserLoginService {
   @Resource
   private IUserLoginDao userLoginDao;
   @Resource
   private IPowerDao roleDao;
   @Resource
   private ILoginLogDao loginLogDao;

    @Override
    public UserLogin login(String userName, String password) {
        UserLogin userLogin= userLoginDao.login(userName,password);
        List<Role> roleList = userLogin.getRoleList();
        for (Role role : roleList) {
            int roleId = role.getRoleId();
            List<Power> powerList = roleDao.findByRole(roleId);
            role.setPowerList(powerList);
        }
        if(userLogin!=null){
            LoginLog loginLog= new LoginLog();
            loginLog.setUsername(userLogin.getUserName());
            loginLog.setDate(new Timestamp(System.currentTimeMillis()));
            loginLog.setUserLogin(userLogin);
            //调用添加日志方法
            loginLogDao.addLoginLog(loginLog);
        }
        return userLogin;
    }
}
