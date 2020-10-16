package com.anthony.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yebicheng
 * @create 2020/10/16 11:50
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello,World!!!";
    }

}
