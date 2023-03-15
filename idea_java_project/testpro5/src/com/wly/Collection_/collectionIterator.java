package com.wly.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author 王露夷
 * @version 1.0
 */
public class collectionIterator {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("西游记","吴承恩",10));
        col.add(new Book("三国演义","罗贯中",10));
        col.add(new Book("红楼梦","曹雪芹",10));

        //获取迭代器
        Iterator iterator = col.iterator();
        //使用迭代器对集合进行遍历
        while (iterator.hasNext()) {//调用next方法前一定要先调用hasNext方法
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        //再次遍历需要重置一次迭代器
        iterator = col.iterator();

        //或者使用增强for循环
        for (Object obj: col) {
            System.out.println(obj);
        }
    }
}

class Book{
    private String name;
    private String aut;
    private double price;

    public Book(String name, String aut, double price) {
        this.name = name;
        this.aut = aut;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", aut='" + aut + '\'' +
                ", price=" + price +
                '}';
    }
}
