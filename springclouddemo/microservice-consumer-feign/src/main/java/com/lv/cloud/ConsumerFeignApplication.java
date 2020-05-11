package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 14:10
 * version $Id: ConsumerApplication.java$
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lv.cloud.service")
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }
}
