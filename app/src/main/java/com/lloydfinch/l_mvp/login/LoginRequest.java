package com.lloydfinch.l_mvp.login;

/**
 * Name: LoginRequest
 * Author: lloydfinch
 * Function: 网络请求实体
 * Date: 2020-03-13 11:10
 * Modify: lloydfinch 2020-03-13 11:10
 */
public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
