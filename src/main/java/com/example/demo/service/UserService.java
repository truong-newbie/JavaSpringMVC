package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String handleHello() {
        return "hello from service";
    }

}
