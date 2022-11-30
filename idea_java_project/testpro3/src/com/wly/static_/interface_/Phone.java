package com.wly.static_.interface_;

//phone类实现了UsbInterface接口
//phone类需要实现UsbInterface接口 规定和声明的方法
public class Phone implements UsbInterface {//实现接口，就是把接口的方法实现
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
