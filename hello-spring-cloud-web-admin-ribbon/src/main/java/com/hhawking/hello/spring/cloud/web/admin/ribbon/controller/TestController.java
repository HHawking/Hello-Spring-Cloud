package com.hhawking.hello.spring.cloud.web.admin.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("test")
    @HystrixCommand(fallbackMethod = "testError")
    public String test(String msg){
        return restTemplate.getForObject("HTTP://hello-spring-cloud-admin/test?msg="+msg,String.class);
    }

    public String testError(String msg){
        return "Hi，your message is :\"" + msg + "\" but request error.";
    }
}
