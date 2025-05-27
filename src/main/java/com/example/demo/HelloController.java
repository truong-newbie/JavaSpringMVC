package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index1() {
        return "Hello World Do Dang Truong";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello. I am user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello. I am admin";
    }
}
