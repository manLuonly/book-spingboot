package com.example.demo1.controller;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.service.UmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 */
//@RestController
@RequestMapping("/book")
@Api(tags = "登录接口")
public class UmsController {
    @Autowired
//    @Resource
    private UmsService umsService;


    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public HttpResponse login(@ApiParam("账号") @RequestParam String username,
                              @ApiParam("密码") @RequestParam String password) {
        String login = umsService.login(username, password);

        if (login == null) {
//            return HttpResponse.validateFailed("用户名或密码错误");
            return  null;
        }
//        return HttpResponse.validateFailed("成功");
        return null;
    }
}
