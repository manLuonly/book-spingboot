package com.example.demo1.common;

/**
 * 全局接口状态码
 * @author xfly
 */
public enum ApiCode {
    /**
     * 枚举状态码
     */
    API_OK(200, "操作成功"),
    ERROR(500, "操作失败,请稍后重试"),
    VALIDATE_FAILED(-4, "参数检验失败"),
    /**
     * 用户名或密码错误
     */
    USERNAME_OR_PASSWORD_ERROR(405, "用户名或密码错误"),

    /**
     * 用户名已存在
     */
    API_USERNAME_EXIST(1001, "username exists");

    private final int code;

    private final String msg;

    private ApiCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}