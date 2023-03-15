package com.wly.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 王露夷
 * @version 1.0
 */
public class hashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",10));
        hashSet.add(new Employee("jack",12));
        hashSet.add(new Employee("jack",10));

        System.out.println("hashSet="+ hashSet);

    }
}


class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return 200;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
