package com.cbd.util;



import com.cbd.entity.Notification;
import com.cbd.entity.ParkingSpace;
import com.cbd.entity.User;

import java.sql.Date;

public class AddPsUtil {

    private AddPsUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * 添加车位申请消息提醒标题
     */
    public static final String NOTIFY_TITLE = "您申请添加的车位已审批";


    private static String addPsPassContent(Date date) {
        return "您于" + date + "发起的添加车位申请,后台已审批通过";
    }

    private static String addPsNotPassContent(Date date) {
        return "您于" + date + "发起的添加车位申请,后台审批未通过";
    }

    public static Notification addPsPassNotification(ParkingSpace parkingSpace) {
        Notification notification = new Notification();
        notification.setTitle(NOTIFY_TITLE);
        notification.setContent(addPsPassContent(parkingSpace.getApplyDate()));
        User user = new User();
        user.setId(parkingSpace.getUserId());
        notification.setUser(user);
        return notification;
    }

    public static Notification addPsNotPassNotification(ParkingSpace parkingSpace) {
        Notification notification = new Notification();
        notification.setTitle(NOTIFY_TITLE);
        notification.setContent(addPsNotPassContent(parkingSpace.getApplyDate()));
        User user = new User();
        user.setId(parkingSpace.getUserId());
        notification.setUser(user);
        return notification;
    }

}
