package com.cbd.test;

import com.cbd.bean.LogBean;

import com.cbd.service.ILogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLog {
    @Autowired
    public ILogService service;

    @Test
    public void add(){
        LogBean logBean = new LogBean();
        logBean.setLogType(1);
        logBean.setOperationType(1);
        logBean.setLogInfo("aaaaa");
        service.add(logBean);
    }

    @Test
    public void find(){
        List<LogBean> logBeans = new ArrayList<LogBean>();
        logBeans = service.findLogByItem(1,1);
        System.out.println(logBeans);
    }
}
