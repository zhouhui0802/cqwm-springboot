package com.zh.sky.exception;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:19
 */
public class UserNotLoginException extends BaseException{

    public UserNotLoginException() {
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }
}
