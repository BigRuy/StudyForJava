package com.wly.set_;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 王露夷
 * @version 1.0
 */
public class hashSetExercise2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employeer("jack",100, new MyDate(1111,22,22)));
        hashSet.add(new Employeer("jack",100,new MyDate(1111,22,33)));


        System.out.println(hashSet);
    }
}

class Employeer{
    private String name ;
    private int  sal;
    private MyDate birthday;


    public Employeer(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
    //name和birthday相同时，equals比较返回的是true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeer employeer = (Employeer) o;
        return Objects.equals(name, employeer.name) && Objects.equals(birthday, employeer.birthday);
    }
    //
    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employeer{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year+"_"+month+"_"+day;
    }
}
