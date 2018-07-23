package com.alva.arbook.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("ok")
    public String hello(){
        return  "hello world";
    }

}
