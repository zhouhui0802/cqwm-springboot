package com.zh.sky.vo;


import com.zh.sky.entity.OrderDetail;
import com.zh.sky.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 9:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO extends Orders implements Serializable {

    //订单菜品信息
    private String orderDishes;

    //订单详情
    private List<OrderDetail> orderDetailList;
}
