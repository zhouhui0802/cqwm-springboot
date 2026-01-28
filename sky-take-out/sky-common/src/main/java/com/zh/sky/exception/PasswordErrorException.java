package com.zh.sky.exception;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:16
 */
/**
 * 密码错误异常
 */
public class PasswordErrorException extends BaseException{
    public PasswordErrorException() {
    }

    public PasswordErrorException(String msg) {
        super(msg);
    }
}
