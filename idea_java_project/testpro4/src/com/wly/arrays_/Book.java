package com.wly.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Book {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("西游记新版",120);
        books[2] = new Book("青年文摘",130);
        books[3] = new Book("java从入门到放弃",140);
        Arrays.sort(books,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book1.price- book2.price;
            }
        });
        System.out.println(Arrays.toString(books));
    }
    private String name;//书名
    private int price;//价格


    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
