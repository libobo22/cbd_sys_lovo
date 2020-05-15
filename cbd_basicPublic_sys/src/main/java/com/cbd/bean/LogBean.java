package com.cbd.bean;


import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class LogBean {
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer logID;
    private Integer logType;
    private Integer operationType;
    private String logInfo;
    private String dateTime = df.format(new Date());
    private String loginName;
    private String ip;
}
