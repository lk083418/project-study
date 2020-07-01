package imooc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWord2 {
    @PostMapping("/helloworld")
    public String helloWord2(){
        System.out.println("hello world!");
        return "hello world!2";
    }
}
