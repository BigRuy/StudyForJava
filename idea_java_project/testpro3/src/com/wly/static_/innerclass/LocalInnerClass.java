package com.wly.static_.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {

    }
}
class Outer02{//外部类
    private int n1;
    public void m1() {
        //局部内部类定义在外部类的局部位置，通常在方法
        class Inner02{//局部内部类
        //可以直接访问外部类的所有成员，包括私有的
            public void m2() {
                System.out.println(n1);
            }
        }
    }
}
