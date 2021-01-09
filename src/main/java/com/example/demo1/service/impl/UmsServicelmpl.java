package com.example.demo1.service.impl;

import com.example.demo1.dao.UmsDAO;
import com.example.demo1.service.UmsService;

import javax.annotation.Resource;


public class UmsServicelmpl implements UmsService {
    @Resource
    private UmsDAO umsDAO;

    @Override
    public String login(String username, String password) {
            return umsDAO.login(username,password);
    }
}
