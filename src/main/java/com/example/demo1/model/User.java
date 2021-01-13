package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

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
    /**
     *
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;
    /**
     *
     */
    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date update_time;
}
