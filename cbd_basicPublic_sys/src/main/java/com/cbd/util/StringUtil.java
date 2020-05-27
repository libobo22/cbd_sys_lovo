package com.cbd.util;

import java.util.regex.Pattern;


public class StringUtil {

    private static final Pattern NUMBER = Pattern.compile("\\d+");

    private StringUtil() {
        throw new UnsupportedOperationException();
    }

    public static boolean isNullOrEmpty(String str) {
        return (null == str || "".equals(str));
    }

    public static boolean isNumber(String str) {
        return NUMBER.matcher(str).matches();
    }

}
