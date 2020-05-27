package com.cbd.dao;

import com.cbd.entity.OperationLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface IOperationLogDao {

    public int addOperationLog(OperationLog operationLog);

    public List<OperationLog> findOperationLog(@Param("startDate") Timestamp startDate,
                                               @Param("endDate") Timestamp endDate,
                                               @Param("startIndex") int startIndex,
                                               @Param("pageSize") int pageSize);
    public int getTotalCount(@Param("startDate") Timestamp startDate,
                             @Param("endDate") Timestamp endDat);

    public List<OperationLog> findOperationLogByUserLoginId(@Param("userId") int userId,
                                                            @Param("startDate") Timestamp startDate,
                                                            @Param("endDate") Timestamp endDate,
                                                            @Param("startIndex") int startIndex,
                                                            @Param("pageSize") int pageSize);
    public int getTotalCountByUserId(@Param("userId") int userId,
                                     @Param("startDate") Timestamp startDate,
                                     @Param("endDate") Timestamp endDat);
}