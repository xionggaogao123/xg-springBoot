package com.xg.java.springboot.common.module;

import java.io.Serializable;

/**
 * Created by xionggao on 2017/6/26.
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -7466776806637903813L; //选中类名，按alt + enter

    private T result;
    private Boolean success;
    private String errors;

    public Boolean isSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.success = true;
        this.result = result;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.success = false;
        this.errors = errors;
    }

    public static <T> Response<T> ok(T data){
        Response<T> response = new Response<>();
        response.setResult(data);
        return response;
    }

    public static <T> Response<T> fail(String error) {
        Response<T> response = new Response<>();
        response.setErrors(error);
        return response;
    }
}
