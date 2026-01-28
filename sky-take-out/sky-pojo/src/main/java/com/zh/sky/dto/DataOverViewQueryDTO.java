package com.zh.sky.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 8:38
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataOverViewQueryDTO implements Serializable {
    private LocalDateTime begin;

    private LocalDateTime end;
}
