package com.zh.sky.vo;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 9:49
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 菜品总览
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishOverViewVO implements Serializable {

    // 已启售数量
    private Integer sold;

    // 已停售数量
    private Integer discontinued;
}
