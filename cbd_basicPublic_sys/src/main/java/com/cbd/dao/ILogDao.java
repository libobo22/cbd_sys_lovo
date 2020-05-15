package com.cbd.dao;

import com.cbd.bean.LogBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ILogDao {
    public void add(LogBean logBean);
    public List<LogBean> findLogByItem(int logType,int operationType);
}
