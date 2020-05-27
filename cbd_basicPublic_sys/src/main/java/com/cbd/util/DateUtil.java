package com.cbd.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;


public class DateUtil {

    private static final Pattern DATE = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    private static final Pattern TIMESTAMP = Pattern.compile("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}");

    private DateUtil() {
        throw new UnsupportedOperationException();
    }

    public static Date covertToDate(String str) {
        if (str == null || !DATE.matcher(str).matches()) {
            return null;
        }
        return Date.valueOf(str);
    }

    public static Timestamp convertToTimestamp(String str) {
        if (str == null || !TIMESTAMP.matcher(str).matches()) {
            return null;
        }
        return Timestamp.valueOf(str);
    }

    public static Date getDaysAgoDate(Integer days) {
        if (days == null) {
            return null;
        }
        long time = ZonedDateTime.now().minusDays(days).toInstant().toEpochMilli();
        return new Date(time);
    }

    public static Timestamp getDaysAgoTimestamp(Integer days) {
        if (days == null) {
            return null;
        }
        long time = ZonedDateTime.now().minusDays(days).toInstant().toEpochMilli();
        return new Timestamp(time);
    }

    public static Date getYearAfter(Integer years) {
        if (years == null) {
            return null;
        }

        long time = ZonedDateTime.now().plusYears(5).toInstant().toEpochMilli();
        return new Date(time);
    }

    public static String getStringDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(date);
    }
}
