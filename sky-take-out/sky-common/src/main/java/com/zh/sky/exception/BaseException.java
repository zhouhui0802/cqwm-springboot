package com.zh.sky.exception;


/**
 * 业务异常
 */

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:11
 */
public class BaseException extends RuntimeException{

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }
}
