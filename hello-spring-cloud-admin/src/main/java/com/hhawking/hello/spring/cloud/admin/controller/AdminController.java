package com.hhawking.hello.spring.cloud.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "test")
    public String test(String msg){
        return "msg:"+msg+"_____post:"+port;
    }
}
