package com.hhawking.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.hhawking.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String test(String msg) {
        return "Hi，your message is :\"" + msg + "\" but request error.";
    }
}
