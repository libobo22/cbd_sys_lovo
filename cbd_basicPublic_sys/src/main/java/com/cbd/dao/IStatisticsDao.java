package com.cbd.dao;

import com.cbd.entity.RequestStatistics;
import com.cbd.entity.Statistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface IStatisticsDao {

    int save(RequestStatistics requestStatistics);

    List<Statistics> getStatistics(@Param("daysAgo") Timestamp daysAgo);
}
