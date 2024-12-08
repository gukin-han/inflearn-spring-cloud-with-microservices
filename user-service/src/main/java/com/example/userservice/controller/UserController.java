package com.example.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class UserController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/message")
    public String getMessage(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello World in First Service";
    }
}
