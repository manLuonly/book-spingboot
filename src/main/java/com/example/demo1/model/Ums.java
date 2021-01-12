package com.example.demo1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Ums {
    /**
     *
     */
    @ApiModelProperty(value = "用户ID")
    private Integer id;
    /**
     *
     */
    @ApiModelProperty(value = "账号")
    private String username;
    /**
     *
     */
    @ApiModelProperty(value = "密码")
    private String password;
}
