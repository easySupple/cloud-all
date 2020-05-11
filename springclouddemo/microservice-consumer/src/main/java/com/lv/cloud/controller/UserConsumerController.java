package com.lv.cloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lv.cloud.entity.UserInfo;
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

//    private String REST_URL_PREFIX = "http://localhost:8001";

    private static String REST_URL_PREFIX = "http://cloud-provider";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/add")
    public boolean addUser(UserInfo user) {
        Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
        return flag;
    }

    @RequestMapping(value = "/consumer/get/{id}")
    public UserInfo get(@PathVariable("id") int id) {
//        UserInfo user = restTemplate.getForObject(REST_URL_PREFIX + "/get/" + id, UserInfo.class);
        // 原始的testtemplate
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("token", 1);
        HttpEntity<String> entity = new HttpEntity<>(jsonObj.toString(), headers);
        String url = REST_URL_PREFIX + "/get/{1}";
        ResponseEntity<JSONObject> exchange = restTemplate.exchange(url,
                HttpMethod.GET, entity, JSONObject.class, id);
        JSONObject result = exchange.getBody();
        UserInfo user = JSON.toJavaObject(result, UserInfo.class);
        return user;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @RequestMapping(value = "/consumer/list")
    public List<UserInfo> getList() {
        List list = restTemplate.getForObject(REST_URL_PREFIX + "/getUser/list", List.class);

        return list;
    }

}
