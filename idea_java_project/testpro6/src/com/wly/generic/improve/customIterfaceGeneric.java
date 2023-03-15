package com.wly.generic.improve;

/**
 * @author 王露夷
 * @version 1.0
 */
public class customIterfaceGeneric {
    public static void main(String[] args) {
    }
}
//接口中静态成员不能使用泛型
interface i extends Iusb<String, Integer>{


}

interface Iusb<U,R>{


    R get();

    void hi(R r);

    default R method(U u){
        return null;
    }
}