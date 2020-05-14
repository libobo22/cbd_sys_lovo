package com.cbd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_company")
public class CompanyBean {
    /**
     * 企业ID
     */
    @TableId(value = "companyID",type = IdType.AUTO)
    private Integer companyID;
    /**
     * 登录名
     */
    @TableField("loginName")
    private String loginName;
    /**
     * 登录密码
     */
    @TableField("loginPwd")
    private String loginPwd;
    /**
     * 公司名称
     */
    @TableField("companyName")
    private String companyName;
    /**
     * 楼层
     */
    @TableField("floor")
    private Integer floor;
    /**
     * 联系人
     */
    @TableField("linkman")
    private String linkman;
    /**
     * 联系电话
     */
    @TableField("linkPhone")
    private String linkPhone;
}
