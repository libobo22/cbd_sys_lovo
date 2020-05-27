package com.cbd.util;

import com.cbd.entity.Complaint;
import com.cbd.entity.Notification;
import com.cbd.entity.User;

import java.sql.Timestamp;


public class ComplaintUtil {

    private ComplaintUtil() {
        throw new UnsupportedOperationException();
    }

    /** 投诉有效 */
    public static final int STATUS_EFFECT = 1;
    /** 投诉无效 */
    public static final int STATUS_INVALIDATE = 2;
    /** 投诉消息提醒标题 */
    public static final String NOTIFY_TITLE = "您有投诉待查看";


    private static String createComplaintSuccessContent(Timestamp date) {
        return "您于" + date + "发起的投诉,经核实投诉成功,被投诉方已被扣除响应的信誉";
    }

    private static String createComplaintFailureContent(Timestamp date) {
        return "您于" + date + "发起的投诉,经核实投诉失败";
    }

    private static String createRespondentContent() {
        return "您的交易被投诉,经核实投诉生效,已扣除信誉分,请珍惜您的信誉";
    }

    public static Notification getComplaintSuccessNotification(Complaint complaint) {
        Notification notification = new Notification();
        notification.setTitle(NOTIFY_TITLE);
        notification.setContent(createComplaintSuccessContent(complaint.getDate()));
        User user = new User();
        user.setId(complaint.getComplaintUser().getId());
        notification.setUser(user);
        return notification;
    }

    public static Notification getRespondentNotification(Complaint complaint) {
        Notification notification = new Notification();
        notification.setTitle(NOTIFY_TITLE);
        notification.setContent(createRespondentContent());
        User user = new User();
        user.setId(complaint.getRespondentUser().getId());
        notification.setUser(user);
        return notification;
    }

    public static Notification getComplaintFailureNotification(Complaint complaint) {
        Notification notification = new Notification();
        notification.setTitle(NOTIFY_TITLE);
        notification.setContent(createComplaintFailureContent(complaint.getDate()));
        User user = new User();
        user.setId(complaint.getComplaintUser().getId());
        notification.setUser(user);
        return notification;
    }
}
