package com.cbd.service;



import com.cbd.entity.Notification;
import com.cbd.util.Pagination;
import com.cbd.vo.NotificationVO;

import java.sql.Timestamp;


public interface INotificationService {

    Pagination<Notification> getByCondition(int userId, Timestamp startDate, Timestamp endDate, Integer status, int pageNo, int pageSize);

    Notification getByNotificationId(int notificationId);

    boolean updateStatusById(NotificationVO notificationVO);

    boolean saveByEntity(Notification notification);
}
