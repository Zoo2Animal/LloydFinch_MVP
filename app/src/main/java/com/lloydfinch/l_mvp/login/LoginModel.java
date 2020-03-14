package com.lloydfinch.l_mvp.login;

import android.text.TextUtils;

import com.lloydfinch.l_mvp.base.BaseModel;

/**
 * Name: LoginModel
 * Author: lloydfinch
 * Function: LoginPresenter
 * Date: 2020-03-13 18:20
 * Modify: lloydfinch 2020-03-13 18:20
 */
public class LoginModel extends BaseModel<LoginPresenter, LoginContract.LoginModelContract> {


    public LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public LoginContract.LoginModelContract getContract() {
        return new LoginContract.LoginModelContract() {
            @Override
            public void executeLogin(LoginRequest request) {
                /**
                 * step3 model发起请求
                 */
                doLogin(request);
            }
        };
    }

    /**
     * test code
     */
    private void doLogin(LoginRequest request) {

        LoginResult result;
        if (TextUtils.equals("lloyd", request.getUsername()) && TextUtils.equals("123", request.getPassword())) {
            result = new LoginResult("登录成功", 200);
        } else {
            result = new LoginResult("登录失败", 404);
        }

        /**
         * step4 model使用presenter转发回调
         */
        mPresenter.getContract().dispatchLoginResult(result);

    }
}
