package com.cbd.util;


public class ReturnMessageUtil {

    private ReturnMessageUtil() {
        throw new UnsupportedOperationException();
    }

    public static ReturnMessage success() {
        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.setCode(ReturnMessage.Code.SUCCESS.getValue());
        returnMessage.setInfo(ReturnMessage.Info.SUCCESS.getValue());
        return returnMessage;
    }

    public static ReturnMessage success(Object object) {
        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.setCode(ReturnMessage.Code.SUCCESS.getValue());
        returnMessage.setInfo(ReturnMessage.Info.SUCCESS.getValue());
        returnMessage.setData(object);
        return returnMessage;
    }

    public static ReturnMessage success(Object object, String info) {
        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.setCode(ReturnMessage.Code.SUCCESS.getValue());
        returnMessage.setInfo(info);
        returnMessage.setData(object);
        return returnMessage;
    }

    public static ReturnMessage error() {
        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.setCode(ReturnMessage.Code.ERROR.getValue());
        returnMessage.setInfo(ReturnMessage.Info.ERROR.getValue());
        return returnMessage;
    }

    public static ReturnMessage error(String info) {
        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.setCode(ReturnMessage.Code.ERROR.getValue());
        returnMessage.setInfo(info);
        return returnMessage;
    }
}
