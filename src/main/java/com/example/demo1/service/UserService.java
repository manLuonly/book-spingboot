package com.example.demo1.service;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link User}
     */
    PageInfo<User> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param user
     * @return
     */
    HttpResponse insert(User user);

    /**
     * 修改
     *
     * @param user
     */
    HttpResponse update(User user);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    HttpResponse deleteById(Integer id);
}
