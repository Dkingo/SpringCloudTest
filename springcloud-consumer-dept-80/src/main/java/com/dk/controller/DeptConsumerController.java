package com.dk.controller;

import com.dk.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wujunjin
 * @Date 2021/5/25 14:56
 */
@RestController
@RequestMapping("consumer")
public class DeptConsumerController {

    //消费者不应该有service层
    //RestTemplate模板，直接调用注册到spring
    //提供多种便捷访问远程http服务的方法，基于restful风格
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }
}
