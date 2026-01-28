package com.zh.sky.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:47
 */
@Data
public class OrdersCancelDTO implements Serializable {
    private Long id;
    //订单取消原因
    private String cancelReason;
}
