package com.zh.sky.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:43
 */
@Data
public class EmployeeDTO implements Serializable {
    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;
}
