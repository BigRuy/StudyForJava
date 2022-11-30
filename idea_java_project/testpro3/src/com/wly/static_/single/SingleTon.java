package com.wly.static_.single;

public class SingleTon {
    public static void main(String[] args) {
        //通过方法就可以获得对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

    }
    
}

//饿汉式
//女朋友类
//只能有一个女朋友
class GirlFriend{
    private String name;

    //保障只能创建一个对象
    //将构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }
    //在类的内部创建对象
    //为了能够在静态方法里访问这个对象，需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("小红");
    //提供一个公共的静态方法，可以返回这个对象
    public static GirlFriend getInstance(){
        return gf;
    }
}
//懒汉式
class Cat{
    private String name;
    private static Cat cat;

    private  Cat(String name) {
        this.name = name;
    }
    //只有这个静态方法被调用时，对象才会被创建
    //第二次调用这个方法时，依旧会返回同一个对象，保证了单例模式
    public static Cat getInstance(){
        if(cat==null){
            cat = new Cat("小黄");
        }
        return cat;
    }
}


