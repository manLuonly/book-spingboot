package com.example.demo1.dao;

import com.example.demo1.model.Ums;
import org.apache.ibatis.annotations.Param;

public interface UmsDAO {
    // 登录
    Ums login(@Param("username") String username, @Param("password") String password);

    // 注册
    String registered(@Param("username") String username, @Param("password") String password);

    // 修改密码
    String updatePassword(@Param("id") Integer id, @Param("password") String password);
}
