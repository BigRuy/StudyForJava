package com.wly.date_;

import java.sql.Date;
import java.time.Instant;

/**
 * @author 王露夷
 * @version 1.0
 */
public class instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        java.util.Date date = Date.from(now);//通过该方法可以将instant对象转换成Date
        Instant instant = date.toInstant();
    }
}
