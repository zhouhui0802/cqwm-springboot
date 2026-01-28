package com.zh.sky.result;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 15:43
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {

    private long total; //总记录数

    private List records; //当前页数据集合
}
