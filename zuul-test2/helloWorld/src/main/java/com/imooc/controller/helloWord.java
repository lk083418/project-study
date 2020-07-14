package com.imooc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWord {
    @PostMapping("/helloworld")
    public String helloWord(){
        ////("hello world!");
        return "hello world!";
    }

    @PostMapping("/helloworld2")
    public String helloWord2(@RequestHeader(value = "Authorization") String authorization,
                             @RequestParam(value = "limit") String limit){
        ////("hello world!");
        System.out.println(limit);
        return limit;
    }
}
