package com.rick.common.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * -------------------------------------------
 * Title : TaskDemo
 * Description : 定时任务类
 * Create on : 2017年8月1日 下午12:54:05
 * Copyright (C) strongunion
 *
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */

@Component
public class TaskDemo {
    private static final Logger logger = LoggerFactory.getLogger(TaskDemo.class);

    @Scheduled(fixedRate = 10000)
    public void doSomething() {
//		System.out.println("=====每10秒输出一次=====");
    }

    @Scheduled(cron = "0/5 * * * * ?")
    public void testScheduled() {
//		System.out.println("*****每5s执行一次*****");
    }


}
