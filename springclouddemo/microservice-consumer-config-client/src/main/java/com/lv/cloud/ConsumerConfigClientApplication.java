package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 14:10
 * version $Id: ConsumerApplication.java$
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConfigClientApplication.class, args);
    }
}
