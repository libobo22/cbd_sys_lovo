package com.cbd.dao;


import com.cbd.entity.LoginLog;
import com.cbd.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface ILoginLogDao {

    public int addLoginLog(LoginLog loginLog);

    public List<UserLogin> findIdByUserName(@Param("username") String username);

    public List<LoginLog> findLoginLog(@Param("startDate") Timestamp startDate,
                                       @Param("endDate") Timestamp endDate,
                                       @Param("startIndex") int startIndex,
                                       @Param("pageSize") int pageSize);

    public int getTotalCount(@Param("startDate") Timestamp startDate,
                             @Param("endDate") Timestamp endDat);

    public List<LoginLog> findLoginLogByUserLoginId(@Param("userId") int userId,
                                                    @Param("startDate") Timestamp startDate,
                                                    @Param("endDate") Timestamp endDate,
                                                    @Param("startIndex") int startIndex,
                                                    @Param("pageSize") int pageSize);

    public int getTotalCountByUserId(@Param("userId") int userId,
                                     @Param("startDate") Timestamp startDate,
                                     @Param("endDate") Timestamp endDat);


}