package com.lakshithafdo.github_action;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "Hello Spring Boot and Github Action";
    }
}
