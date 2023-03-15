package com.wly.List_;



import java.util.ArrayList;
import java.util.List;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class listSort {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("西游记","吴承恩",12));
        list.add(new Book("三国演","罗贯中",13));
        list.add(new Book("红楼梦","曹雪芹",14));

        sort(list);
        for (Object o :list) {
            Book book = (Book) o;
            System.out.println("名字："+book.getName()+"\t\t"+"作者："+ book.getAut()+"\t\t"+"价钱"+ book.getPrice());
        }


    }

    public static void sort(List list){
        int size = list.size();
        for (int i = 0; i <size-1 ; i++) {
            for (int j = 0 ;j<size-1-i; j++){
                Book book1 = (Book) list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
