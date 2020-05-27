package com.cbd.util;


import com.cbd.entity.ApplySign;
import com.cbd.entity.Notification;
import com.cbd.entity.User;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class ApplyUtil {

    private ApplyUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * 签约申请消息提醒标题
     */
    public static final String NOTIFY_TITLE = "您有签约申请待查看";


    private static String applyPassContent(Date date) {
        return "您于" + date + "发起的网上签约申请,后台已审批通过,请前往我的合同中查看确认";
    }

    private static String applyNotPassContent(Date date) {
        return "您于" + date + "发起的网上签约申请,后台审批未通过";
    }

    public static List<Notification> getApplyPassNotification(ApplySign apply) {
        Notification sellNotification = new Notification();
        sellNotification.setTitle(NOTIFY_TITLE);
        sellNotification.setContent(applyPassContent(apply.getApplyDate()));
        User sellUser = new User();
        sellUser.setId(apply.getSellUser().getId());
        sellNotification.setUser(sellUser);

        Notification buyNotification = new Notification();
        buyNotification.setTitle(NOTIFY_TITLE);
        buyNotification.setContent(applyPassContent(apply.getApplyDate()));
        User buyUser = new User();
        buyUser.setId(apply.getBuyUser().getId());
        buyNotification.setUser(buyUser);

        List<Notification> list = new ArrayList<>();
        list.add(sellNotification);
        list.add(buyNotification);
        return list;
    }

    public static List<Notification> getApplyNotPassNotification(ApplySign apply) {
        Notification sellNotification = new Notification();
        sellNotification.setTitle(NOTIFY_TITLE);
        sellNotification.setContent(applyNotPassContent(apply.getApplyDate()));
        User sellUser = new User();
        sellUser.setId(apply.getSellUser().getId());
        sellNotification.setUser(sellUser);

        Notification buyNotification = new Notification();
        buyNotification.setTitle(NOTIFY_TITLE);
        buyNotification.setContent(applyNotPassContent(apply.getApplyDate()));
        User buyUser = new User();
        buyUser.setId(apply.getBuyUser().getId());
        buyNotification.setUser(buyUser);

        List<Notification> list = new ArrayList<>();
        list.add(sellNotification);
        list.add(buyNotification);
        return list;
    }

}
