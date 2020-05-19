package com.cbd.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message<T> implements Serializable {

    private Integer code;

    private String info;

    private T data;
}
