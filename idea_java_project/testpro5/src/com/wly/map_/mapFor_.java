package com.wly.map_;

import java.util.*;

/**
 * @author 王露夷
 * @version 1.0
 */
public class mapFor_ {
    public static void main(String[] args) {
        //演示map的六个遍历方式
        HashMap hashMap = new HashMap();
        //第一种：先取出所有的key，通过key取出对应的value
        Set keySet = hashMap.keySet();

        //增强for循环
        for (Object key :keySet) {
            System.out.println(hashMap.get(key));
        }
        //迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(hashMap.get(key));
        }
        //第二种，取出所有的values
        Collection values = hashMap.values();

        //增强for循环
        for (Object value :values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        //第三种：通过entrySet来获取key-value
        Set entrySet = hashMap.entrySet();

        //增强for
        for (Object entry :entrySet) {
            //将entry对象转成Map.entry
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }

        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry m =(Map.Entry)next;
            System.out.println(m.getKey()+"_"+m.getValue());
        }


    }
}
