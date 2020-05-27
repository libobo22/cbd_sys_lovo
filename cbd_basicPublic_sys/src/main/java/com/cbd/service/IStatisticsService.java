package com.cbd.service;

import com.cbd.entity.RequestStatistics;
import com.cbd.entity.Statistics;
import java.sql.Timestamp;
import java.util.List;


public interface IStatisticsService {

    boolean save(RequestStatistics requestStatistics);

    List<Statistics> getStatistics(Timestamp daysAgo);
}
