package com.cbd.service.impl;

import com.cbd.dao.INotificationDao;
import com.cbd.entity.Notification;
import com.cbd.service.INotificationService;

import com.cbd.util.Pagination;
import com.cbd.vo.NotificationVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Service
public class NotificationServiceImpl implements INotificationService {

    private static final int DEFAULT_STATUS_UNREAD = 0;
    private static final int DEFAULT_TYPE = 0;

    @Resource
    private INotificationDao notificationDao;

    @Override
    public Pagination<Notification> getByCondition(int userId, Timestamp startDate, Timestamp endDate, Integer status, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<Notification> list = notificationDao.getNotificationListByCondition(userId, startDate, endDate, status, startIndex, pageSize);
        int totalCount = notificationDao.getTotalCountByCondition(userId, startDate, endDate, status);
        Pagination<Notification> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCount);
        pagination.setData(list);
        return pagination;
    }

    @Override
    public Notification getByNotificationId(int notificationId) {
        return notificationDao.getByNotificationId(notificationId);
    }

    @Override
    public boolean updateStatusById(NotificationVO notificationVO) {
        return notificationDao.updateStatusById(notificationVO.getNotificationList(), notificationVO.getStatus()) > 0;
    }

    @Override
    public boolean saveByEntity(Notification notification) {
        notification.setCreateDate(new Timestamp(System.currentTimeMillis()));
        notification.setStatus(DEFAULT_STATUS_UNREAD);
        if (notification.getType() == null) {
            notification.setType(DEFAULT_TYPE);
        }
        return notificationDao.saveByEntity(notification) > 0;
    }


}
