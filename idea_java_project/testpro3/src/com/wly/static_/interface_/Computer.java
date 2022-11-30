package com.wly.static_.interface_;

public class Computer {
    public void work(UsbInterface usbInterface) {
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
