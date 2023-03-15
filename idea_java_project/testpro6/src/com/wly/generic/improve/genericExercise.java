package com.wly.generic.improve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author 王露夷
 * @version 1.0
 */
public class genericExercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Mydate integerMydate = new Mydate(1999,12,10);
        Mydate integerMydate1 = new Mydate(1998,10,23);
        Mydate integerMydate2 = new Mydate(1997,10,10);
        employees.add(new Employee("jack",1000,integerMydate ));
        employees.add(new Employee("tom",1200,integerMydate1));
        employees.add(new Employee("tom",1300,integerMydate2));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //先对传入参数进行判断
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    return 0;
                }
                //比较名字
                int i = o1.getName().compareTo(o2.getName());
                if(i !=0){
                    return i;
                }
                //比较birthday,调用已经实现的并且封装过的方法
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        //遍历输出集合
        for (Employee employee :employees) {
            System.out.println(employee);
        }

    }
}

class Mydate implements Comparable<Mydate>{
    private int  month;
    private int day;
    private int year;


    public Mydate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(Mydate o) {//把对年月日的比较放在此处进行实现
        //下面的比较最好应该放在Mydate里去完成
        //如果名字相同，就比较年份
        int yearMinus = year- o.getYear();
        if(yearMinus !=0 ){
            return yearMinus;
        }
        //如果名字和年份都相同,比较月份
        int monthMinus = month- o.getMonth();
        if(monthMinus != 0){
            return monthMinus;
        }
        //如果名字和年份和月份都相同，就比较月份
        return day-o.getDay();
    }
}
class Employee{
    private String name;
    private int sal;
    private Mydate birthday;

    public Employee(String name, int sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

