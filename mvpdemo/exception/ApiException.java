package com.example.gs.mvpdemo.exception;

/**
 * Created by gaosheng on 2016/11/6.
 * 21:58
 * com.example.gaosheng.myapplication.exception
 *Custom exceptions, handling errors when parsing the network
 */

public class ApiException extends RuntimeException {

    public int code;
    public String message;

    public ApiException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
