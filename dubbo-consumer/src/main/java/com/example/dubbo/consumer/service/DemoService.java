package com.example.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.api.manager.DemoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消费者-服务层
 * @auth Jessy Heung
 * @date 2020-09-25
 */
@Service    //此处为 spring 的注解
public class DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    @Reference  //dubbo 注解
    private DemoApi demoApi;

    public String sayHello(String name){
        logger.info("【消费者】【服务层】---请求参数 name ：{}",name);
        return demoApi.sayHello(name);
    }
}
