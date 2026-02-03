package com.zh.sky.task;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/2/3 8:05
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义定时任务类
 */

@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务 每隔5秒触发一次
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask(){
        log.info("start task: {}",new Date());
    }
}
