package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/11 10:20
 * version $Id: ZullApplication.java$
 */
@SpringBootApplication
@EnableZuulProxy
public class ZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class, args);
    }
}
