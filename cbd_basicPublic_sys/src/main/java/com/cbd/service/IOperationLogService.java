package com.cbd.service;


import com.cbd.entity.OperationLog;
import com.cbd.util.Pagination;

import java.sql.Timestamp;



public interface IOperationLogService {

    public boolean addOperationLog(OperationLog operationLog);

    public Pagination<OperationLog> findOperationLog(Timestamp startDate, Timestamp endDate, int pageNo, int pageSize);

    public Pagination<OperationLog> findOperationLogByUserLoginId(int userId, Timestamp startDate,
                                                                  Timestamp endDate, int pageNo, int pageSize);

    public String findRealName(int id);
}
