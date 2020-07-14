package com.imooc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HeaderController {
    @PostMapping("/getHeader")
    public String getHeader(HttpServletRequest request, @RequestParam(value = "name") String name){
        String header = request.getHeader("Authorization");

        ////("aa");
        return header;
    }
}
