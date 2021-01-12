package com.example.demo1.service;

import com.example.demo1.model.Ums;

public interface UmsService {

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    Ums login(String username, String password);



    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return
     */
    String registered(String username, String password);


    /**
     * 修改密码
     * @param id 用户id
     * @param password 密码
     * @return
     */
    String updatePassword(Integer id, String password);
}
