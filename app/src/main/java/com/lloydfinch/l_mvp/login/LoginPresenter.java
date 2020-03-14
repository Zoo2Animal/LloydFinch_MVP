package com.lloydfinch.l_mvp.login;

import com.lloydfinch.l_mvp.base.BasePresenter;

/**
 * Name: LoginPresenter
 * Author: lloydfinch
 * Function: LoginPresenter
 * Date: 2020-03-13 18:18
 * Modify: lloydfinch 2020-03-13 18:18
 */
public class LoginPresenter extends BasePresenter<LoginView, LoginModel, LoginContract.LoginPresenterContract> {

    @Override
    public LoginModel getModel() {
        return new LoginModel(this);
    }

    @Override
    public LoginContract.LoginPresenterContract getContract() {
        return new LoginContract.LoginPresenterContract() {
            @Override
            public void dispatchLoginRequest(LoginRequest request) {
                /**
                 * step2 presenter使用model转发请求
                 */
                getModel().getContract().executeLogin(request);
            }

            @Override
            public void dispatchLoginResult(LoginResult result) {
                /**
                 * step5 presenter将结果转发给view
                 */
                LoginView view = getView();
                if (null != view) {
                    view.getContract().handleLoginResult(result);
                }
            }
        };
    }
}
