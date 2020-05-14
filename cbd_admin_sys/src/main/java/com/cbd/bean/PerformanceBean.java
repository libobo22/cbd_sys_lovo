package com.cbd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_performance")
public class PerformanceBean {
    /**
     * 性能ID
     */
    @TableId(value = "performanceID",type = IdType.AUTO)
    private Integer performanceID;
    /**
     * 响应时间
     */
    @TableField("responseTime")
    private Integer responseTime;
    /**
     * 业务类型(1代表个人业务，2代表企业业务，3代表管理员业务，4代表超级管理业务)
     */
    @TableField("type")
    private Integer type;
    /**
     * 方法名
     */
    @TableField("methodName")
    private String methodName;
    /**
     * 描述
     */
    @TableField("info")
    private String info;
    /**
     * 时间
     */
    @TableField("dataTime")
    private String dataTime;
}
