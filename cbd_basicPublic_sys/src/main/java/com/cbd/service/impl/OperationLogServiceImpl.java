package com.cbd.service.impl;


import com.cbd.dao.IBusinessDao;
import com.cbd.dao.IOperationLogDao;
import com.cbd.dao.IUserDao;
import com.cbd.entity.Business;
import com.cbd.entity.OperationLog;
import com.cbd.entity.User;
import com.cbd.service.IOperationLogService;
import com.cbd.util.Pagination;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Service
public class OperationLogServiceImpl implements IOperationLogService {

    @Resource
    private IOperationLogDao operationLogDao;
    @Resource
    private IUserDao userDao;
    //    @Resource
//    private IManagerDao managerDao;
    @Resource
    private IBusinessDao businessDao;


    @Override
    public boolean addOperationLog(OperationLog operationLog) {
        return operationLogDao.addOperationLog(operationLog) > 0;
    }

    @Override
    public Pagination<OperationLog> findOperationLog(Timestamp startDate, Timestamp endDate, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<OperationLog> operationLogList = operationLogDao.findOperationLog(startDate, endDate, startIndex, pageSize);
        int totalCountByUserId = operationLogDao.getTotalCount(startDate, endDate);
        Pagination<OperationLog> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCountByUserId);
        pagination.setData(operationLogList);
        return pagination;
    }

    @Override
    public Pagination<OperationLog> findOperationLogByUserLoginId(int userId, Timestamp startDate, Timestamp endDate, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<OperationLog> operationLogList = operationLogDao.findOperationLogByUserLoginId(userId, startDate, endDate, startIndex, pageSize);
        int totalCountByUserId = operationLogDao.getTotalCountByUserId(userId, startDate, endDate);
        Pagination<OperationLog> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCountByUserId);
        pagination.setData(operationLogList);
        return pagination;
    }

    @Override
    public String findRealName(int id) {
        User user = userDao.findById(id);
//        String managerRealName = managerDao.findById(id).getRealName();
        Business business = businessDao.getById(id);

        if (user != null) {
            return user.getRealName();
        }
//        if (managerRealName != null) {
//            return managerRealName;
//        }
        if (business != null) {
            return business.getName();
        }
        return "";
    }


}
