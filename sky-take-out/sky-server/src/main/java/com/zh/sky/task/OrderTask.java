package com.zh.sky.task;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/2/3 8:09
 */

import com.zh.sky.entity.Orders;
import com.zh.sky.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * 自定义定时任务，实现订单状态定时处理
 */
@Component
@Slf4j
public class OrderTask {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 处理支付超时订单
     * 下单后超过15分钟仍未支付则判定为支付超时订单
     */
    @Scheduled(cron = "0 * * * * ?")
    public void processTimeoutOrder(){

        log.info("处理支付超时订单：{}", new Date());

        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);

        // select * from orders where status = 1 and order_time < 当前时间-15分钟
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTime(Orders.PENDING_PAYMENT, time);
        if(ordersList!=null && ordersList.size()>0){
            ordersList.forEach(orders -> {
                orders.setStatus(Orders.CANCELLED);
                orders.setCancelReason("支付超时，自动取消");
                orders.setCancelTime(LocalDateTime.now());
                orderMapper.update(orders);
            });
        }
    }


    /**
     * 处理“派送中”状态的订单
     * 每天凌晨1点检查一次是否存在“派送中”的订单，如果存在则修改订单状态为“已完成”
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void processDeliveryOrder(){

        log.info("处理派送中订单：{}", new Date());

        LocalDateTime time = LocalDateTime.now().plusMinutes(-60);
        // select * from orders where status = 4 and order_time < 当前时间-1小时
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTime(Orders.DELIVERY_IN_PROGRESS, time);

        if(ordersList!=null && ordersList.size()>0){
            ordersList.forEach(orders -> {
                orders.setStatus(Orders.COMPLETED);
                orderMapper.update(orders);
            });
        }
    }

}
