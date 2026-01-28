package com.zh.sky.exception;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:16
 */

/**
 * 密码修改失败异常
 */
public class PasswordEditFailedException extends BaseException{

    public PasswordEditFailedException(String msg){
        super(msg);
    }
}
