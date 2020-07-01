package com.imooc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWord {
    @PostMapping("/helloworld")
    public String helloWord(){
        System.out.println("hello world!");
        return "hello world!";
    }
}
