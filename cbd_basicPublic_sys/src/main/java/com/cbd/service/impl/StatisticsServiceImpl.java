package com.cbd.service.impl;


import com.cbd.dao.IStatisticsDao;
import com.cbd.entity.RequestStatistics;
import com.cbd.entity.Statistics;
import com.cbd.service.IStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Service
public class StatisticsServiceImpl implements IStatisticsService {

    @Resource
    private IStatisticsDao statisticsDao;

    @Override
    public boolean save(RequestStatistics requestStatistics) {
        return statisticsDao.save(requestStatistics) > 0;
    }

    @Override
    public List<Statistics> getStatistics(Timestamp daysAgo) {
        return statisticsDao.getStatistics(daysAgo);
    }
}
