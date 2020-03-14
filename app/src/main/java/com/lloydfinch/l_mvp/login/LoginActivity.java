package com.lloydfinch.l_mvp.login;

import com.lloydfinch.l_mvp.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected LoginView generateView() {
        return new LoginView(this);
    }
}
