package com.hhawking.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-admin")
public interface AdminService {

    @GetMapping(value = "test")
    String test(@RequestParam(value = "msg") String msg);
}
