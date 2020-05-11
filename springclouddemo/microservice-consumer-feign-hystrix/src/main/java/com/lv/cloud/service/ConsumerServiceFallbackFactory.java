package com.lv.cloud.service;

import com.lv.cloud.entity.UserInfo;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/11 10:50
 * version $Id: ConsumerServiceFallbackFactory.java$
 */
@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {
    @Override
    public ConsumerService create(Throwable throwable) {

        return new ConsumerService() {
            @Override
            public UserInfo get(int id) {
                UserInfo user = new UserInfo(id, "该用户不存在", -1);
                return user;
            }

            @Override
            public boolean add(UserInfo user) {
                return false;
            }

            @Override
            public List<UserInfo> getAll() {
                return null;
            }
        };
    }
}
