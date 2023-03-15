package com.wly.generic.improve;

import java.util.ArrayList;

/**
 * @author 王露夷
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class generic02_ {
    public static void main(String[] args) {

        //表示存放到集合中的元素是Dog类型
        //编译器发现添加到集合中的元素不满足要求，就会报错
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("旺财",10));
        //遍历的时候可以直接取出dog类型，不需要再进行向下转型
        for (Dog dog :dogs) {
            System.out.println(dog.getName());
        }


    }
}
class person<E>{
    E s;

    public person(E s) {
        this.s = s;
    }
    public E f(){
        return s;
    }
}


class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
