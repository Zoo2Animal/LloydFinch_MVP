package com.lloydfinch.l_mvp.bean;

/**
 * Name: BaseEntity
 * Author: lloydfinch
 * Function: 网络请求相应实体
 * Date: 2020-03-10 14:03
 * Modify: lloydfinch 2020-03-10 14:03
 */
public class BaseEntity {

    private String msg;
    private int code;

    public BaseEntity(int code) {
        this.code = code;
    }

    public BaseEntity(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean success() {
        return 200 == code;
    }
}
