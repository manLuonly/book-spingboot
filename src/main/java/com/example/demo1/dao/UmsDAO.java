package com.example.demo1.dao;

import org.apache.ibatis.annotations.Param;

public interface UmsDAO {
    //登录
    String login(@Param("username") String username, @Param("password") String password);
}
