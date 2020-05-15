package com.cbd.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DealRecordBean {
    private int dealRecordID;
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String date = df.format(new Date());
    private int type;
    private String buyRealName;
    private String buyPhone;
    private String buyemail;
    private String sellRealName;
    private String sellPhone;
    private String sellEmail;
    private String carPropertyNum;
    private String carAddress;
    private String carNumber;
    private String dealRecordNum;


}
