package com.example.demo1.model;

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
    private Integer id;
    /**
     *
     */
    private String bookname;
    /**
     *
     */
    private Integer numbering;
    /**
     *
     */
    private String author;
    /**
     *
     */
    private String address;
    /**
     *
     */
    private BigDecimal price;
    /**
     *
     */
    private Date createTime;
}