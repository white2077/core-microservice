package com.white.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "data from test controller 1";
    }
    @GetMapping
    public String test1() {
        return "this is test service 1.1";
    }
}
