package com.lv.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lv.cloud.entity.UserInfo;
import com.lv.cloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 14:09
 * version $Id: UserConsumerController.java$
 */
@RestController
public class UserConsumerController {

    @Autowired(required = false)
    private ConsumerService consumerService;

    @RequestMapping(value = "/consumer/add")
    public boolean addUser(UserInfo user) {
        Boolean flag = consumerService.add(user);
        return flag;
    }

    @RequestMapping(value = "/consumer/get/{id}")
    public UserInfo get(@PathVariable("id") int id) {
        return consumerService.get(id);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @RequestMapping(value = "/consumer/list")
    public List<UserInfo> getList() {
        List list = consumerService.getAll();
        return list;
    }

}
