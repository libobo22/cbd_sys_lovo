package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEntity {
    //企业信息实体类
    private int id;
    private String loginName;
    private String loginPwd;
    private String companyName;
    private int floor;//楼层
    private String linkMan;
    private String linkPhone;

}
