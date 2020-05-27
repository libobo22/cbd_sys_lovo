package com.cbd.dao;


import com.cbd.entity.Notification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface INotificationDao {

    List<Notification> getNotificationListByCondition(@Param("userId") Integer userId, @Param("startDate") Timestamp startDate, @Param("endDate") Timestamp endDate, @Param("status") Integer status, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    Notification getByNotificationId(int notificationId);

    int getTotalCountByCondition(@Param("userId") int userId, @Param("startDate") Timestamp startDate, @Param("endDate") Timestamp endDate, @Param("status") Integer status);

    int updateStatusById(@Param("notificationList") List<Notification> notificationList, @Param("status") int status);

    int saveByEntity(Notification notification);
}
