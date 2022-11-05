package com.wly.encapsulation;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(1000);
        person.setSalary(2000);
        person.showInfo();
    }
}

class Person{
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//工资私有化

    //生成get和set方法
    //根据要求完善代码
    //定义无参构造器
    public Person() {
    }
    //定义有参构造器
    public Person(String name, int age, double salary) {
       setName(name);
       setAge(age);
       setSalary(salary);
    }
    //定义显示方法
    public void showInfo() {
        System.out.println("名字="+name+" 年龄="+age+" 薪水="+salary);
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
        if(age>=1 && age<=120){
            this.age = age;
        }else{
            System.out.println("年龄必须在1-120岁");
            this.age = 18;//给一个默认值
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
