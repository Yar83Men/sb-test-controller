package com.sbtestcontroller.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "Java") String name) {
        return String.format("Hello %s", name);
    }
}
