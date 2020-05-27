package com.cbd.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnMessage<T> implements Serializable {

    private Integer code;

    private String info;

    private T data;

    public enum Code {
        SUCCESS(200), ERROR(400);

        @Getter
        private final int value;

        Code(int value) {
            this.value = value;
        }

    }

    public enum Info {

        SUCCESS("成功"), ERROR("失败");

        @Getter
        private final String value;

        Info(String value) {
            this.value = value;
        }

    }
}
