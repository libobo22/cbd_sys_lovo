package com.cbd.service;

import com.cbd.bean.LogBean;

import java.util.List;

public interface ILogService {

    public void add(LogBean logBean);

    public List<LogBean> findLogByItem(int logType,int operationType);
}
