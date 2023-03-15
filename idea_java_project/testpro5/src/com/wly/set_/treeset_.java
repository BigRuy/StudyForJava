package com.wly.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 王露夷
 * @version 1.0
 */
public class treeset_ {
    public static void main(String[] args) {
        //指定排序规则
         TreeSet treeSet= new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面调用String的compareTo进行字符串大小进行比较
                return ((String)o1).compareTo((String)o2);
            }
        });
    }
}
