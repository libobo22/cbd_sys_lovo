package com.cbd.service.impl;


import com.cbd.dao.IUserDao;
import com.cbd.dao.IUserLoginDao;

import com.cbd.entity.User;
import com.cbd.service.IUserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    private static final int DEFAULT_CREDIT=100;
    @Resource
    private IUserDao userDao;
    @Resource
    private IUserLoginDao userLoginDao;

    @Autowired
    SqlSession sqlSession;
    @Override
    public boolean registerUser(User user) {
        user.setCredit(DEFAULT_CREDIT);
        int a= userLoginDao.addUserLogin(user);
        int b= userDao.registerUser(user);
        userLoginDao.addUserRole(user.getId(),1);
       return a>0&& b>0;

    }

    @Override
    public User findById(int id) {

        return userDao.findById(id);
    }

    @Override
    public boolean updateUserById(int id,String password, String homeAddress, String phone, String job, String email) {
        int a=userLoginDao.updateUserLoginById(id, password);
        int b=userDao.updateUserById(id, homeAddress, phone, job, email);
        return a>0&& b>0;
    }
}
