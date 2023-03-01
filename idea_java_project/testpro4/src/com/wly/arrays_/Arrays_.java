package com.wly.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Arrays_ {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        //遍历数组
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        //直接使用arrays.toString方法显示数组
        System.out.println(Arrays.toString(integers));

        //演示sort方法的使用
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        //定制排序
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(integers));

        //二分查找
        int i = Arrays.binarySearch(integers,4);
        System.out.println(i);


    }
}
