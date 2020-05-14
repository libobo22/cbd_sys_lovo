package com.cbd.service.impl;

import com.cbd.bean.LogBean;
import com.cbd.dao.ILogDao;
import com.cbd.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("logService")
public class LogServiceImpl implements ILogService {
    @Autowired
    private ILogDao dao;

    @Override
    public void add(LogBean logBean) {
        dao.add(logBean);
    }

    @Override
    public List<LogBean> findLogByItem(int logType, int operationType) {
        return dao.findLogByItem(logType,operationType);
    }
}
