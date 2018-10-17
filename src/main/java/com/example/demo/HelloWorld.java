package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/",produces ="text/plain;charset=UTF-8" )
    public String hello() {
        return "你好,SpringBoot !";
    }
}
