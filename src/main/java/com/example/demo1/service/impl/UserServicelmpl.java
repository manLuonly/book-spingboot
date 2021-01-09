package com.example.demo1.service.impl;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.dao.UserDAO;
import com.example.demo1.model.User;
import com.example.demo1.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServicelmpl implements UserService {

    @Resource
    private UserDAO userDAO;

//    @Transactional(readOnly = true)
//    @Override
//    public User findById(Integer id) {
//        return userDAO.findById(id);
//    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<User> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(userDAO.findByPage(pageNum,pageSize));
    }

    @Override
    public HttpResponse insert(User user) {
        userDAO.insert(user);
        return null;
    }

    @Override
    public HttpResponse update(User user) {
        userDAO.update(user);
        return null;
    }

    @Override
    public HttpResponse deleteById(Integer id) {
        userDAO.deleteById(id);
        return null;
    }
}
