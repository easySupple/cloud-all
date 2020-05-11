package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 13:52
 * version $Id: ProviderApplication.java$
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider2Application {
    public static void main(String[] args) {

        SpringApplication.run(Provider2Application.class, args);
    }
}
