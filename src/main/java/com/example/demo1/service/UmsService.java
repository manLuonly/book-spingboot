package com.example.demo1.service;

import com.example.demo1.model.Ums;

public interface UmsService {

    /**
     * 登录功能
     *  @param username 用户名
     * @param password 密码
     * @return
     */
    Ums login(String username, String password);
}
