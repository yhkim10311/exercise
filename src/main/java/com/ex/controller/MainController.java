package com.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String testMain() {
        return "This is beta test!!!";
    }

    @GetMapping("/health")
    public Long health() {
        return System.currentTimeMillis();
    }
}
