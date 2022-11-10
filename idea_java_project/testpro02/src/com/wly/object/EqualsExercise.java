package com.wly.object;

public class EqualsExercise {

    public static void main(String[] args) {

    }

}
class Person{//默认继承的是object类
    private String name;
    private int age;
    private char gender;



    //重写object下的eauals方法
    public boolean equals(Object obj){
        //如果是同一个对象直接返回true
        if(this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){
            Person p = (Person)obj;//进行向下转型，使得可以访问到obj子类下面的各个属性
            return this.name.equals(p.name) && this.age==p.age && this.gender==p.gender;
        }
        //如果不是同一个对象直接返回false
        return false;
    }



    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
