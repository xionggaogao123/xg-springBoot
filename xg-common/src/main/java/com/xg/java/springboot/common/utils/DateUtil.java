package com.xg.java.springboot.common.utils;

import org.joda.time.DateTime;
import org.joda.time.format.*;

import java.util.Date;

/**
 * Created by xionggao on 2017/6/26.
 * 时间格式化组件
 */
public class DateUtil {

    private static final DateTimeParser[] parsers = new DateTimeParser[]{
            DateTimeFormat.forPattern("yyyy-MM-dd").getParser(),
            DateTimeFormat.forPattern("yyyyMMdd").getParser()
    };
    private static final DateTimeFormatter dateFormatter;

    static {
        dateFormatter = (new DateTimeFormatterBuilder()).append((DateTimePrinter)null, parsers).toFormatter();
    }

    public DateUtil() {}

    public static boolean isValidDate(String value){
        try {
            dateFormatter.parseDateTime(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static Date withTimeAtStartOfDay(Date date) {
        return (new DateTime(date)).withTimeAtStartOfDay().toDate();
    }

    public static Date withTimeAtEndOfDay(Date date) {
        return (new DateTime(date)).withTimeAtStartOfDay().plusDays(1).minusSeconds(1).toDate();
    }

}
