package com.cbd.service;

import com.cbd.entity.LoginLog;
import com.cbd.entity.UserLogin;
import com.cbd.util.Pagination;

import java.sql.Timestamp;
import java.util.List;



public interface ILoginLogService {

    public boolean addLoginLog(LoginLog loginLog);

    public List<UserLogin> findIdByUserName(String username);

    public Pagination<LoginLog> findLoginLog(Timestamp startDate, Timestamp endDate, int pageNo, int pageSize);

    public Pagination<LoginLog> findLoginLogByUserLoginId(int userId, Timestamp startDate,
                                                          Timestamp endDate, int pageNo, int pageSize);
    public String findRealName(int id);

}
