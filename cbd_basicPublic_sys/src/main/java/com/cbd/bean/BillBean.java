package com.cbd.bean;


import lombok.Data;

import java.util.Date;
@Data
public class BillBean {
    private int billID;
    private String billType;
    private float expend;
    private float income;
    private String dealRemark;
    private Date dealTime;
}