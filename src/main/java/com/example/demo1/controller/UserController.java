package com.example.demo1.controller;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.model.User;
import com.example.demo1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理接口")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findByPage")
    @ApiOperation(value = "获取用户列表分页查询", notes = "获取用户列表")
    public HttpResponse findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                   @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return HttpResponse.success(userService.findByPage(pageNum, pageSize));
    }

    @PostMapping("/addUser")
    @ApiOperation(value = "添加用户")
    public HttpResponse insert(@RequestBody User user) {
       return HttpResponse.success(userService.insert(user),"添加成功");
    }

    @PostMapping("/updateUser")
    @ApiOperation(value = "修改用户")
    public HttpResponse update(@RequestBody User user) {
        return  HttpResponse.success(userService.update(user),"修改成功");
    }

    @GetMapping("/deleteById/{id}")
    @ApiOperation(value = "删除用户", notes = "根据 id 删除数据")
    public HttpResponse deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return HttpResponse.success(userService.deleteById(id),"删除成功");
    }
}
