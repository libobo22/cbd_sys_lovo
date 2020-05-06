package com.commons.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseData {
    /**
     * 响应状态码
     */
    public Integer code;
    /**
     * 响应信息描述
     */
    public String message;
    /**
     * 响应数据
     */
    public Map<String,Object> data=new HashMap<String, Object>();

    public ResponseData() {
    }

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseData(Integer code, String message, Map<String, Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * 响应OK
     * @return
     */
    public static ResponseData ok(){
        ResponseData responseData = new ResponseData(200,"ok");
        return responseData;
    }
    /**
     * 未找到
     * @return
     */
    public static ResponseData notFound(){
        return new ResponseData(404,"notFound");
    }

    /**
     * 用户名或密码错误
     * @return
     */
    public static ResponseData userNameOrPasswordError(){
        return new ResponseData(401,"userNameOrPasswordError");
    }

    /**
     * 个人用户
     * @return
     */
    public static ResponseData personalUser(){
        ResponseData responseData = new ResponseData(302,"people");
        return responseData;
    }
    /**
     * 企业用户
     */
    public static ResponseData conpanyUser(){
        ResponseData responseData = new ResponseData(302,"enterpriseUser");
        return responseData;
    }

    /**
     * 后台管理员
     * @return
     */
    public static ResponseData adminUser(){
        ResponseData responseData = new ResponseData(302,"admin");
        return responseData;
    }

    /**
     * 超级管理员
     * @return
     */
    public static ResponseData superAdminUser(){
        ResponseData responseData = new ResponseData(302,"superAdmin");
        return responseData;
    }
}
