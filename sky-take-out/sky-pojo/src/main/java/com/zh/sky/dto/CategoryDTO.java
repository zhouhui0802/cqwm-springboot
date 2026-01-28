package com.zh.sky.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO  DTO里面的都是数据传输，查询的  VO的包是显示在数据前台的展示
 * @date 2026/1/28 8:34
 */
@Data
public class CategoryDTO implements Serializable {
    //主键
    private Long id;

    //类型 1 菜品分类 2 套餐分类
    private Integer type;

    //分类名称
    private String name;

    //排序
    private Integer sort;
}
