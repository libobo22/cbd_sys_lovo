package com.cbd.bean;


import java.text.SimpleDateFormat;
import java.util.Date;

public class LogBean {
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer logID;
    private Integer logType;
    private Integer operationType;
    private String logInfo;
    private String dateTime = df.format(new Date());
    private String loginName;
    private String ip;

    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LogBean() {
    }

    public LogBean(Integer logID, Integer logType, Integer operationType, String logInfo, String dateTime, String loginName, String ip) {
        this.logID = logID;
        this.logType = logType;
        this.operationType = operationType;
        this.logInfo = logInfo;
        this.dateTime = dateTime;
        this.loginName = loginName;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LogBean{" +
                "logID=" + logID +
                ", logType=" + logType +
                ", operationType=" + operationType +
                ", logInfo='" + logInfo + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", loginName='" + loginName + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

}
