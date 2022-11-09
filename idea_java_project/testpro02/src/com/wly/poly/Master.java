package com.wly.poly;

public class Master {
    private String name;

    public Master(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //主人给小狗喂骨头
    public void feed(Dog dog,Bone bone) {
        System.out.println("主人名字"+name+"给"+dog.getName()+"吃"+bone.getName());
    }

    //使用多态解决喂食问题
    public void feed(Animal animal,Food food) {

    }

}
