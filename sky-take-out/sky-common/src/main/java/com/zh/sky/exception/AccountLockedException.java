package com.zh.sky.exception;


/**
 * 账号被锁定异常
 */

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:10
 */
public class AccountLockedException extends BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }
}
