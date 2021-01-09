package com.example.demo1.controller;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.model.BookList;
import com.example.demo1.service.BookListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/book")
@Api(tags = "书籍管理接口")
public class BookListController {
    @Autowired
    private BookListService bookListService;

    @GetMapping("/selectById/{id}")
    @ApiOperation("通过ID查询单个")
    public BookList findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return bookListService.findById(id);
    }

    @GetMapping("/findByPage")
    @ApiOperation(value = "获取书籍列表分页查询", notes = "获取书籍列表")
    public HttpResponse findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                   @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return HttpResponse.success(bookListService.findByPage(pageNum, pageSize));
    }

    @PostMapping("/addBook")
    @ApiOperation(value = "添加书籍")
    public HttpResponse insert(@RequestBody BookList bookList) {
        return  HttpResponse.success(bookListService.insert(bookList),"添加成功");
    }

    @PostMapping("/updateBook")
    @ApiOperation(value = "修改书籍")
    public HttpResponse update(@RequestBody BookList bookList) {
        return HttpResponse.success(bookListService.update(bookList),"修改成功");
    }

    @GetMapping("/deleteById/{id}")
    @ApiOperation(value = "删除书籍", notes = "根据 id 删除数据")
    public HttpResponse deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return HttpResponse.success(bookListService.deleteById(id),"删除成功");
    }
}
