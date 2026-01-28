package com.zh.sky.dto;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:57
 */

import lombok.Data;

import java.io.Serializable;

/**
 * C端用户登录
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;
}
