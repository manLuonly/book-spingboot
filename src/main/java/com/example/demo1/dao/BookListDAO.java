package com.example.demo1.dao;

import com.example.demo1.model.BookList;
import com.github.pagehelper.Page;

/**
 *
 */
public interface BookListDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link BookList}
     */
    BookList findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link BookList}
     */
    Page<BookList> findByPage(int pageNum, int pageSize );

    /**
     * 新增
     *
     * @param bookList
     */
    void insert(BookList bookList);

    /**
     * 修改
     *
     * @param bookList
     */
    void update(BookList bookList);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}