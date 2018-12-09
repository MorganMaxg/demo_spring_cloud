package com.ma.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }
}
