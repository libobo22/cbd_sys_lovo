package com.cbd.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //注解方法
@Retention(RetentionPolicy.RUNTIME) //运行时可见
public @interface LogAnno {
    /** 记录日志操作描述 */
    String logInfo();

    /** 区分前后台类型（1表示前台，2表示后台） */
    int logType();

    /** 操作类型（1代表登录，2代表操作）*/
    int operationType();
}
