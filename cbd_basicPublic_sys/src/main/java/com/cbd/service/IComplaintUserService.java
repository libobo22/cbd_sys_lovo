package com.cbd.service;


import com.cbd.entity.User;


public interface IComplaintUserService {

    User getByUserId(int userId);

    boolean updateCredit(int userId, int credit);
}
