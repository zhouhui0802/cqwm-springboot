package com.zh.sky.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:46
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsSalesDTO implements Serializable {

    //商品名称
    private String name;

    //销量
    private Integer number;
}
