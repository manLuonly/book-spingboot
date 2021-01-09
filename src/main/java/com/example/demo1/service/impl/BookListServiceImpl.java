package com.example.demo1.service.impl;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.dao.BookListDAO;
import com.example.demo1.model.BookList;
import com.example.demo1.service.BookListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class BookListServiceImpl implements BookListService {

    @Resource
    private BookListDAO bookListDAO;

    @Transactional(readOnly = true)
    @Override
    public BookList findById(Integer id) {
        return bookListDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<BookList> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(bookListDAO.findByPage(pageNum,pageSize));
    }

    @Override
    public HttpResponse insert(BookList bookList) {
         bookListDAO.insert(bookList);
         return null;
    }

    @Override
    public HttpResponse update(BookList bookList) {
        bookListDAO.update(bookList);
        return null;
    }

    @Override
    public HttpResponse deleteById(Integer id) {
        bookListDAO.deleteById(id);
        return null;
    }

}