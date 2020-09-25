package com.example.dubbo.consumer.controller;

import com.example.dubbo.consumer.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者--控制层
 * @auth Jessy Heung
 * @date 2020-09-25
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    /**
     * 打开浏览器，输入/demo/sayHello
     * @return
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        logger.info("【消费者】【控制层】---请求入口");
        return demoService.sayHello("Jessy");
    }
}
