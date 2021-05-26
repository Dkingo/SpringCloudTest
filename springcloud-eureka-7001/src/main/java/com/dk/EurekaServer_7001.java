package com.dk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author wujunjin
 * @Date 2021/5/26 9:19
 */
@SpringBootApplication
@EnableEurekaServer        //服务器的启动类，可以接受别人注册进来
public class EurekaServer_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class, args);
    }
}
