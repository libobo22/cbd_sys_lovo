package com.cbd.controller;


import com.cbd.entity.Notification;
import com.cbd.service.INotificationService;
import com.cbd.util.Pagination;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import com.cbd.vo.NotificationVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * @author liren
 * @date 2020-05-12
 */
@RestController
public class NotificationController {

    @Resource
    private INotificationService notificationService;

    @GetMapping("/notification/getList")
    public ReturnMessage<Pagination<Notification>> getNotificationList(@RequestParam("userId") int userId,
                                                                       @RequestParam(value = "startDate", required = false) Timestamp startDate,
                                                                       @RequestParam(value = "endDate", required = false) Timestamp endDate,
                                                                       @RequestParam(value = "status", required = false) Integer status,
                                                                       @RequestParam("pageNo") int pageNo,
                                                                       @RequestParam("pageSize") int pageSize) {
        Pagination<Notification> pagination = notificationService.getByCondition(userId, startDate, endDate, status, pageNo, pageSize);
        return ReturnMessageUtil.success(pagination);
    }

    @GetMapping("/notification/get/{notificationId}")
    public ReturnMessage<Notification> getNotification(@PathVariable("notificationId") int notificationId) {
        Notification notification = notificationService.getByNotificationId(notificationId);
        return ReturnMessageUtil.success(notification);
    }

    @PutMapping("/notification/update/status")
    public ReturnMessage<?> updateStatus(@RequestBody NotificationVO notificationVO) {
        boolean result = notificationService.updateStatusById(notificationVO);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }
}
