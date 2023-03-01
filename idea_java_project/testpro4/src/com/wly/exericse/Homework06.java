package com.wly.exericse;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        a a = new a();
         Person person= new Person("唐僧","ma");
    }
}
interface Vehicles{//交通工具接口类
    public void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("船");
    }
}
class  a{//交通工具工厂类
    public void getHorse(Vehicles vehicles){
        Horse horse = new Horse();
        horse.work();
    }
    public void getBoat(Vehicles vehicles){
        Boat boat = new Boat();
        boat.work();
    }
}
class Person{
    private String name;
    private String vehicles;

    public Person(String name, String vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}