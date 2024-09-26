package com.example.demo;

import com.example.demo.generator.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Resource
    public UserInfoService userInfoService;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
