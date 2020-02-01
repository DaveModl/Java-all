package com.java.object.exception;

import java.io.IOException;

public class MyException extends IOException {
    public  MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
