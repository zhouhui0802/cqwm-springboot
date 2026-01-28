package com.zh.sky.dto;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:50
 */
@Data
public class OrdersPageQueryDTO implements Serializable {

    private int page;

    private int pageSize;

    private String number;

    private  String phone;

    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    private Long userId;
}
