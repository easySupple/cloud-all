package com.lv.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/11 13:32
 * version $Id: CloudConfigApp.java$
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigApp.class, args);
    }
}
