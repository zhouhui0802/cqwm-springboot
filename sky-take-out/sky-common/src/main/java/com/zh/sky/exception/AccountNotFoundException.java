package com.zh.sky.exception;


/**
 * 账号不存在异常
 */

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:12
 */
public class AccountNotFoundException extends BaseException {
    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}
