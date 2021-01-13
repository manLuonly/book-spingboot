package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
@Data
public class BookList implements Serializable {
    private static final long serialVersionUID = -4175515813618975289L;
    /**
     *
     */
    @ApiModelProperty(value = "ID")
    private Integer id;
    /**
     *
     */
    @ApiModelProperty(value = "书名")
    private String bookname;
    /**
     *
     */
    @ApiModelProperty(value = "编号")
    private Integer numbering;
    /**
     *
     */
    @ApiModelProperty(value = "作者")
    private String author;
    /**
     *
     */
    @ApiModelProperty(value = "地址")
    private String address;
    /**
     *
     */
    @ApiModelProperty(value = "书籍价格")
    private BigDecimal price;
    /**
     *
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;
}