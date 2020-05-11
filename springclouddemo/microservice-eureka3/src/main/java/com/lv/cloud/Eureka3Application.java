package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 15:25
 * version $Id: Eureka1Application.java$
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3Application.class, args);
    }
}
