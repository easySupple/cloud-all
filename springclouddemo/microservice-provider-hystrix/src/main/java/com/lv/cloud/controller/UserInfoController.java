package com.lv.cloud.controller;

import com.lv.cloud.entity.UserInfo;
import com.lv.cloud.service.UserInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 13:51
 * version $Id: UserInfoController.java$
 */
@RestController
public class UserInfoController {


    @Autowired
    private UserInfoService service;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="hystrixGetUser") //一旦服务调用失败，就调用hystrixGetUser方法
    public UserInfo getUser(@PathVariable("id") int id, @RequestParam(required = false) String token) {
        System.out.println("token:" + token);
        UserInfo user = service.getUser(id);
        if(user == null){
            throw new RuntimeException("不存在id=" + id + "对应的用户信息");
        }
        return user;
    }

    public UserInfo hystrixGetUser(@PathVariable("id") int id, @RequestParam(required = false) String token){
        UserInfo user = new UserInfo(id, "不存在该用户", 0);
        return user;
    }



}
