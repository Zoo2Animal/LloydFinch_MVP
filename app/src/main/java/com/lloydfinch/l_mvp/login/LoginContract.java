package com.lloydfinch.l_mvp.login;

/**
 * Name: LoginContract
 * Author: lloydfinch
 * Function: 登录模块Contract
 * Date: 2020-03-10 13:58
 * Modify: lloydfinch 2020-03-10 13:58
 * <p>
 * <p>
 * Contract存在的意义:将mvp实现的逻辑抽离出来，实现面向接口编程
 */
public interface LoginContract {

    interface LoginModelContract {

        void executeLogin(LoginRequest request);
    }

    interface LoginViewContract {

        void handleLoginResult(LoginResult result);
    }

    interface LoginPresenterContract {
        void dispatchLoginRequest(LoginRequest request);

        void dispatchLoginResult(LoginResult result);
    }

}
