package com.zh.sky.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 15:40
 */

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AliOssProperties {
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}
