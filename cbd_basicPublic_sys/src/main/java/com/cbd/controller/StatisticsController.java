package com.cbd.controller;


import com.cbd.entity.Statistics;
import com.cbd.service.IStatisticsService;
import com.cbd.util.DateUtil;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class StatisticsController {

    @Resource
    private IStatisticsService statisticsService;

    @GetMapping("/statistics/get")
    public ReturnMessage<List<Statistics>> getRequestStatistics(@RequestParam(value = "days", required = false) Integer days) {
        Timestamp timestamp = DateUtil.getDaysAgoTimestamp(days);
        List<Statistics> statistics = statisticsService.getStatistics(timestamp);
        return ReturnMessageUtil.success(statistics);
    }
}
