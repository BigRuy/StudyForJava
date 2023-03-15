package com.wly.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class setMethod_ {
    public static void main(String[] args) {

        Set set = new HashSet();
        //不能存放重复的元素
        //存放与取出是没有顺序的
        set.add("tom");
        set.add("john");
        set.add(null);
        set.add(null);
        System.out.println(set);

        //遍历:使用迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //遍历：使用增强for
        for (Object o :set) {
            System.out.println(o);
        }


    }
}
