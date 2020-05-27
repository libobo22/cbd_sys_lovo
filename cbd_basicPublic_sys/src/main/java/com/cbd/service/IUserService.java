package com.cbd.service;


import com.cbd.entity.User;

public interface IUserService {
    public boolean registerUser(User user);

    public User findById(int id);

    public boolean updateUserById(int id, String password, String homeAddress, String phone, String job, String email);

}
