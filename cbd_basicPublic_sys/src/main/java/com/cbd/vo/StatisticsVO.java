package com.cbd.vo;


import com.cbd.entity.Statistics;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class StatisticsVO implements Serializable {

    /** 请求响应时间统计 */
    private List<Statistics> statisticsList;

    /** 在线总人数 */
    private Integer onlineNumber;
}
