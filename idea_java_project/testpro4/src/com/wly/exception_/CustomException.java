package com.wly.exception_;

/**
 * @author 王露夷
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {

    }
}
class AgeException extends RuntimeException{
    //构造器
    public AgeException(String message) {
        super(message);
    }
}
