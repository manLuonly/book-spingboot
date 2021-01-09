package com.example.demo1.controller;

import com.example.demo1.common.HttpResponse;
import com.example.demo1.model.Ums;
import com.example.demo1.service.UmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 *
 */
@RestController
@RequestMapping("/book")
@Api(tags = "登录接口")
public class UmsController {
    @Autowired
    private UmsService umsService;


    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public HttpResponse login(@ApiParam("账号") @RequestParam String username,
                              @ApiParam("密码") @RequestParam String password) {
        Ums login =  umsService.login(username, password);

        if (login == null) {
            return HttpResponse.validateFailed("用户名或密码错误");
        }
        /** 构建hasmap，返回构建的数据 */
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("username", username);
        return HttpResponse.success(dataMap);
    }
}
