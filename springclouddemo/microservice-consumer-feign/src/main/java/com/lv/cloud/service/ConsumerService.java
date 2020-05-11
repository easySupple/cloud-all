package com.lv.cloud.service;

import com.lv.cloud.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/4/30 16:38
 * version $Id: ConsumerService.java$
 */
@FeignClient(value = "cloud-provider")
public interface ConsumerService {

    /*调用接口中的get方法，即可以向cloud-provider微服务发送/get/{id}请求*/
    @RequestMapping(value="/get/{id}", method= RequestMethod.GET)
    public UserInfo get(@PathVariable("id") int id);

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public boolean add(UserInfo user);

    @RequestMapping(value="/getUser/list", method=RequestMethod.GET)
    public List<UserInfo> getAll();

}
