package com.example.demo1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    /**
     *
     */
    @ApiModelProperty(value = "ID")
    private Integer id;
    /**
     *
     */
    @ApiModelProperty(value = "用户名")
    private String username;
    /**
     *
     */
    @ApiModelProperty(value = "地址")
    private String address;
    /**
     *
     */
    @ApiModelProperty(value = "电话")
    private String phone;
    /**
     *
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
    /**
     *
     */
    @ApiModelProperty(value = "余额")
    private String balance;
    /**
     *
     */
    @ApiModelProperty(value = "IP")
    private String ip;
}
