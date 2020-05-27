package com.cbd.vo;

import com.cbd.entity.Notification;
import lombok.Data;

import java.util.List;


@Data
public class NotificationVO {

    private List<Notification> notificationList;

    private int status;
}
