package com.example.demo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.generator.mapper.UserInfoMapper;
import com.example.demo.generator.service.UserInfoService;
import com.example.demo.generator.domain.UserInfo;
import org.springframework.stereotype.Service;

/**
* @author 1
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2024-09-26 21:49:10
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService {

}




