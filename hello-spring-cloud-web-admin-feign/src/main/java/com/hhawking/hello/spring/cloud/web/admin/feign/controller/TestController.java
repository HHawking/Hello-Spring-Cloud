package com.hhawking.hello.spring.cloud.web.admin.feign.controller;

import com.hhawking.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "test")
    public String test(String msg){
        return adminService.test(msg);
    }
}