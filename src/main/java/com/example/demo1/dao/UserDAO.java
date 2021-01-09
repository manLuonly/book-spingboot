package com.example.demo1.dao;

import com.example.demo1.model.User;
import com.github.pagehelper.Page;

public interface UserDAO {

    /**
     * 分页查询
     *
     * @return {@link User}
     */
    Page<User> findByPage(int pageNum, int pageSize );

    /**
     * 新增
     *
     * @param user
     */
    void insert(User user);

    /**
     * 修改
     *
     * @param user
     */
    void update(User user);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);
}
