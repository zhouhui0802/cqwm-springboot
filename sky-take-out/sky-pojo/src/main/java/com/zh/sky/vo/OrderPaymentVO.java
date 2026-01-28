package com.zh.sky.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 9:52
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPaymentVO implements Serializable {

    private String nonceStr; //随机字符串
    private String paySign; //签名
    private String timeStamp; //时间戳
    private String signType; //签名算法
    private String packageStr; //统一下单接口返回的 prepay_id 参数值
}
