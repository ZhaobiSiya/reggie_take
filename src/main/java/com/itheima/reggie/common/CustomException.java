package com.itheima.reggie.common;

import jdk.jshell.spi.ExecutionControl;

public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
