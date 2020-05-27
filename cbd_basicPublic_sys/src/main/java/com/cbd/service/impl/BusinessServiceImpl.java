package com.cbd.service.impl;


import com.cbd.dao.IBusinessDao;
import com.cbd.dao.IUserLoginDao;
import com.cbd.entity.Business;
import com.cbd.service.IBusinessService;
import com.cbd.util.Pagination;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BusinessServiceImpl implements IBusinessService {

    //有效状态
    private static final int STATUS_VALID = 1;
    //用户类型
    private static final int TYPE_BUSINESS = 2;

    @Resource
    private IBusinessDao businessDao;
    @Resource
    private IUserLoginDao userLoginDao;


    @Override
    public Pagination<Business> getByCondition(String name, String floor, String contact, String contactPhone, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<Business> list = businessDao.getListByCondition(name, floor, contact, contactPhone, startIndex, pageSize);
        int totalCount = businessDao.getTotalCountByCondition(name, floor, contact, contactPhone);
        Pagination<Business> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCount);
        pagination.setData(list);
        return pagination;
    }

    @Override
    public Business getById(int id) {
        return businessDao.getById(id);
    }

    @Override
    public boolean updateStatusById(int status, int id) {
        return businessDao.updateStatusById(status, id) > 0;
    }

    @Override
    public boolean saveByEntity(Business business) {
        business.setStatus(STATUS_VALID);
        business.setType(TYPE_BUSINESS);
        int b = userLoginDao.addUserLogin(business);
        int a = businessDao.saveByEntity(business);
        return a > 0 && b > 0;
    }



    @Override
    public boolean updateBusinessById(int id, String userName, String password, String contact, String contactPhone) {
       int a=userLoginDao.updateBusinessLoginById(id, userName, password);
        int b= businessDao.updateBusinessById(id, contact, contactPhone);
        return a > 0 && b > 0;
    }
}
