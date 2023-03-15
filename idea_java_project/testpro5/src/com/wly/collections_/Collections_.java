package com.wly.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("smith");
        arrayList.add("tom");
        arrayList.add("rose");
        //反转集合中元素
        Collections.reverse(arrayList);
        //对集合元素进行随机的排序
        Collections.shuffle(arrayList);
        //对集合元素按照自然顺序进行升序排序
        Collections.sort(arrayList);
        //按字符串大小进行排序
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        //交换集合中指定的两个元素的位置
        Collections.swap(arrayList,0,1);
        //按照元素的自然顺序，返回集合中最大的元素
        Collections.max(arrayList);
        //返回长度最大的元素
        Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });

        //查看指定元素在集合中出现的次数
        Collections.frequency(arrayList,"tom");



    }
}
