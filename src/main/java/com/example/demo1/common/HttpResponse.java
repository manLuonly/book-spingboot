package com.example.demo1.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@JsonPropertyOrder({"code", "msg", "data"})
public class HttpResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自定义返回码
     */
    private int code;

    /**
     * 自定义返回说明
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public HttpResponse(T code, String msg, T object) {

    }

    /**
     * 成功返回，无数据
     *
     * @return 自定义的 ApiResponse 对象
     */
    public static <T> HttpResponse<Object> success(T object,String msg ) {
        return new HttpResponse<>(ApiCode.API_OK.code(), msg, null);
    }

    /**
     * 成功返回，有数据
     *
     * @param object 返回数据
     * @param <T>    返回数据类型
     * @return 自定义的 ApiResponse 对象
     */
    public static <T> HttpResponse success(T object) {
        return new HttpResponse<>(ApiCode.API_OK.code(), ApiCode.API_OK.getMsg(), object);
    }

    /**
     * 失败返回
     *
     * @return 自定义的 ApiResponse 对象
     */

    public static HttpResponse error() {
        return new HttpResponse<>(ApiCode.ERROR.code(), ApiCode.ERROR.getMsg(), null);
    }


    /**
     * 参数验证失败返回结果
     *
     * @param msg 提示信息
     */
    public static <T> HttpResponse<T> validateFailed(String msg) {
        return (HttpResponse<T>) new HttpResponse<Serializable>(ApiCode.USERNAME_OR_PASSWORD_ERROR.code(), msg, null);
    }
//    public static HttpResponse<Object> fail(List<User> apiCode) {
//        return new HttpResponse<>(ApiCode.ERROR.code(), ApiCode.ERROR.getMsg(), null);
//    }
}
