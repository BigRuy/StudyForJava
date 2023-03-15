package com.wly.generic;

import java.util.ArrayList;

/**
 * @author 王露夷
 * @version 1.0
 */
public class generic01_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dog("旺财",10));
        arrayList.add(new dog("小黄",5));

        //遍历
        for (Object o :arrayList) {
            dog dog = (dog) o;
            System.out.println(dog.getName()+"-"+dog.getAge());
        }


    }
}

class dog{
    private String name;
    private int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}