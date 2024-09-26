package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 1
* @description 针对表【user_info】的数据库操作Mapper
* @createDate 2024-09-26 21:49:10
* @Entity generator.domain.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




