package com.cbd.service.impl;

import com.cbd.dao.IComplaintUserDao;
import com.cbd.entity.User;
import com.cbd.service.IComplaintUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ComplaintUserServiceImpl implements IComplaintUserService {

    @Resource
    private IComplaintUserDao complaintUserDao;

    @Override
    public User getByUserId(int userId) {
        return complaintUserDao.getByUserId(userId);
    }

    @Override
    public boolean updateCredit(int userId, int credit) {
        return complaintUserDao.updateCredit(userId, credit) > 0;
    }
}
