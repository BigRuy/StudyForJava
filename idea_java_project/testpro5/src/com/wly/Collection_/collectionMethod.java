package com.wly.Collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王露夷
 * @version 1.0
 */
public class collectionMethod {
    public static void main(String[] args) {

        List list = new ArrayList();

        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);

        //删除指定元素
        list.remove(0);
        list.remove(true);

        //查找某个元素是否存在

    }
}
