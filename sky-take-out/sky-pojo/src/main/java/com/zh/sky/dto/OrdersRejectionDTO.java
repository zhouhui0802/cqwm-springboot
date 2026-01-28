package com.zh.sky.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:52
 */
@Data
public class OrdersRejectionDTO implements Serializable {
    private Long id;

    //订单拒绝原因
    private String rejectionReason;
}
