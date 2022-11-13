package com.wly.AllExercise;

public class First {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",18,"打螺丝");
        person[1] = new Person("jerry",23,"程序员");
        person[2] = new Person("Lily",34,"销售");
        //根据每个对象的年龄大小进行冒泡排序
        for (int i = 0; i <person.length-1 ; i++) {
            for (int j = 0; j < person.length-1-i ; j++) {
                Person personTemp;
                if(person[j].getAge()>person[j+1].getAge()){
                    personTemp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = personTemp;
                }
            }
        }
        //打印输出排序之后的对象数组
        for (int i = 0; i < person.length ; i++) {
            System.out.println(person[i]);
        }

    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
