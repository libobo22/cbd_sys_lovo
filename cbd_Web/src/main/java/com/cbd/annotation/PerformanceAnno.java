package com.cbd.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //注解方法
@Retention(RetentionPolicy.RUNTIME) //运行时可见
public @interface PerformanceAnno {
    /**
     *业务类型(1代表个人业务，2代表企业业务，3代表管理员业务，4代表超级管理业务)
     * @return
     */
    int type();

    /**
     * 描述信息
     * @return
     */
    String info();
}
