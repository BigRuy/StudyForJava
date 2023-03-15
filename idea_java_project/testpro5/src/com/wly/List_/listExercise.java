package com.wly.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王露夷
 * @version 1.0
 */
public class listExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            list.add("hello"+i);
        }
        list.add(1,"wly");//第二个位置插入
        list.get(4);//获取第五个位置的元素
        list.remove(5);//删除第六个位置的元素
        list.set(6,"ruy");//修改第七个元素的位置


        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
