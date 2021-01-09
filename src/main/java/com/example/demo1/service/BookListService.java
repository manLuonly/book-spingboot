package com.example.demo1.service;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.model.BookList;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface BookListService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link BookList}
     */
    PageInfo<BookList> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param bookList
     */
    HttpResponse insert(BookList bookList);

    /**
     * 修改
     *
     * @param bookList
     */
    HttpResponse update(BookList bookList);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    HttpResponse deleteById(Integer id);

}