package com.zh.sky.exception;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:14
 */
/**
 * 登录失败
 */

public class LoginFailedException extends BaseException{

    public LoginFailedException(String msg){
        super(msg);
    }
}
