package com.lloydfinch.l_mvp.login;

import com.lloydfinch.l_mvp.bean.BaseEntity;

/**
 * Name: LoginResult
 * Author: lloydfinch
 * Function: 网络请求返回实体
 * Date: 2020-03-13 11:09
 * Modify: lloydfinch 2020-03-13 11:09
 */
public class LoginResult extends BaseEntity {
    public LoginResult(String msg, int code) {
        super(msg, code);
    }
}
