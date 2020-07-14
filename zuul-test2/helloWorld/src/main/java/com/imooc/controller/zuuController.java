package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zuuController {
    @PostMapping("/plat/smapp/v1/oauth/token")
    public String helloWord3(){
        ////("hello world!");
        return "/plat/smapp/v1/oauth/token";
    }

    @PostMapping("/sdn/v1/vpn/action/create-composedvpnc")
    public String helloWord4(){
        ////("hello world!");
        return "/sdn/v1/vpn/action/create-composedvpnc";
    }
}
