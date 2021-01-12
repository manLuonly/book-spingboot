package com.example.demo1.service.impl;

import com.example.demo1.dao.UmsDAO;
import com.example.demo1.model.Ums;
import com.example.demo1.service.UmsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsServicelmpl implements UmsService {
    @Resource
    private UmsDAO umsDAO;

    @Override
    public Ums login(String username, String password) {
            return umsDAO.login(username,password);
    }

    @Override
    public String registered(String username, String password) {
        return umsDAO.registered(username,password);
    }

    @Override
    public String updatePassword( Integer id,String password ) { return umsDAO.updatePassword(id,password); };
}
