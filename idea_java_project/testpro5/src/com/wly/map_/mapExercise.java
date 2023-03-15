package com.wly.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 王露夷
 * @version 1.0
 */
public class mapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employe jack = new Employe("jack", 20000, 1);
        Employe tom = new Employe("tom",12000,2);
        Employe rose = new Employe("rose",22300,3);
        hashMap.put(jack.getId(),jack);
        hashMap.put(tom.getId(),tom);
        hashMap.put(rose.getId(), rose);

        //遍历1
        Set set = hashMap.keySet();
        for (Object key :set) {
            Employe employe = (Employe)hashMap.get(key);
            //System.out.println(employe.getClass());
            if(employe.getSal()>18000){
                System.out.println(key+"-"+hashMap.get(key));
            }
        }
        //遍历2
        Set entrySet = hashMap.entrySet();
        for (Object entry :entrySet) {
            Map.Entry entry1 = (Map.Entry) entry;
            Employe employe = (Employe) entry1.getValue();
            if(employe.getSal()>18000){
                System.out.println(entry1.getKey()+"-"+entry1.getValue());
            }
        }


    }
}
class Employe{
    private String name;
    private float sal;
    private int id;

    public Employe(String name, float sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
