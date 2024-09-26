package com.example.demo.generator;

import com.example.demo.generator.service.UserInfoService;
import com.example.demo.generator.domain.UserInfo;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(userInfoService);
    }


    @Resource
    UserInfoService userInfoService;
    @Test
    public void testMysql(){
        UserInfo userInfo = userInfoService.getById(2);
        System.out.println(userInfo.getName());
    }
}
