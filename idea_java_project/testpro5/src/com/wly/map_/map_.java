package com.wly.map_;

import java.util.HashMap;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class map_ {
    public static void main(String[] args) {
        //map接口实现类的特点
        HashMap hashMap = new HashMap();
        hashMap.put("1","jack");
        hashMap.put("2","tom");
        System.out.println(hashMap);

        //演示 常用方法
        hashMap.remove("1");


    }
}
