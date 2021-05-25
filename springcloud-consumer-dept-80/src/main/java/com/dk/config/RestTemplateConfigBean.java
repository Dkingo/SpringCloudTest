package com.dk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wujunjin
 * @Date 2021/5/25 15:00
 */
@Configuration
public class RestTemplateConfigBean {

    @Bean
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }
}
