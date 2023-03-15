package com.wly.homework;

import java.util.*;

/**
 * @author 王露夷
 * @version 1.0
 */
public class homework02 {
    public static void main(String[] args) {
        Map m = new HashMap();
        emy jack = new emy("jack", 1200);
        emy tom = new emy("tom", 1300);
        emy rose = new emy("rose", 1400);
        m.put(jack.getName(),jack.getSal());
        m.put(rose.getName(),rose.getSal());
        m.put(tom.getName(),tom.getSal());

        //更改工资
        m.put("jack",2600);
        //为所有的员工的工资加100
        Set entrySet = m.entrySet();
        for (Object o :entrySet) {
            Map.Entry o1 = (Map.Entry) o;
            int newsal = addSal((int)o1.getValue());
            o1.setValue(newsal);
            System.out.println(o1.getKey()+"-"+o1.getValue());

        }
        //遍历
        Set set = m.keySet();
        for (Object o :set) {
            System.out.println(o);
        }

        Collection values = m.values();
        for (Object o :values) {
            System.out.println(o);

        }
    }
    public static int addSal(int sal){
        int newsal;
        newsal = sal+100;
        return newsal;
    }
}


class emy{
    private String name;
    private int sal;

    public emy(String name, int sal) {
        this.name = name;
        this.sal = sal;
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

    @Override
    public String toString() {
        return "emy{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
