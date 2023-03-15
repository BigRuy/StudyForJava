package com.wly.set_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class treeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        //使用默认的构造器
        treeMap.put("jack","捷克");
        treeMap.put("rose","肉丝");

        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //要求按照字符串的大小进行排序
                return ((String)o1).compareTo((String)o2);
                //要求按照字符串长度进行排序
                //return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap1.put("jack","捷克");
        treeMap1.put("rose","肉丝");
        System.out.println(treeMap1);



    }
}
