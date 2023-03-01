package com.wly.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王露夷
 * @version 1.0
 */
public class localDateTime_ {
    public static void main(String[] args) {
        //第三代日期类
        LocalDateTime ldt = LocalDateTime.now();//使用now返回当前日期时间的一个对象
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分钟ss秒");
        String s = dtf.format(ldt);
        System.out.println(s);

    }
}
