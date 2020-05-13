package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//性能统计实体类
public class PerformanceEntity {
    private int id;
    private int responseTime;//响应时间
    private String type;//业务类型(1代表个人业务，2代表企业业务，3代表管理员业务，4代表超级管理业务)
    private String methodName;//方法名
    private String dateTime;//时间

}
