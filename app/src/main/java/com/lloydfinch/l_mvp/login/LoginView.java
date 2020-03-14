package com.lloydfinch.l_mvp.login;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

import com.lloydfinch.l_mvp.base.BaseView;
import com.lloydfinch.l_mvp.databinding.ActivityLoginBinding;
import com.lloydfinch.tools.thread.SafeHandler;
import com.lloydfinch.tools.tips.ToastTool;

import androidx.annotation.Nullable;

/**
 * Name: LoginView
 * Author: lloydfinch
 * Function: 登录的View层
 * Date: 2020-03-13 11:31
 * Modify: lloydfinch 2020-03-13 11:31
 */
public class LoginView extends BaseView<LoginPresenter, LoginContract.LoginViewContract> {

    private ActivityLoginBinding binding;

    public LoginView(Context context) {
        this(context, null);
    }

    public LoginView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoginView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // initView(context);
    }

    @Override
    protected void initView(Context context) {
        binding = ActivityLoginBinding.inflate(((Activity) context).getLayoutInflater());
        /**
         * 这里通过addView()将Activity的root添加到自身，使得自己插入到DecorView和ContentView之间，
         * 达到attach到ViewTree上的效果，但是缺点是ViewTree深了一层
         */
        addView(binding.getRoot());
        binding.btnLogin.setOnClickListener(v -> {
            doLogin();
        });
    }

    @Override
    public LoginContract.LoginViewContract getContract() {
        return new LoginContract.LoginViewContract() {

            @Override
            public void handleLoginResult(LoginResult result) {
                /**
                 * step6 view处理最终结果
                 */
                if (result.success()) {
                    /**
                     * 成功
                     */
                } else {
                    /**
                     * 失败
                     */
                }

                SafeHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        ToastTool.showShort(result.getMsg());
                    }
                });
            }
        };
    }

    @Override
    public LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    private void doLogin() {

        try {
            /**
             * 这里有空指针异常，偷懒try-catch到
             */
            String name = binding.etName.getText().toString();
            String password = binding.etPwd.getText().toString();

            LoginRequest request = new LoginRequest(name, password);

            /**
             * step1 view使用presenter发起请求
             */
            mPresenter.getContract().dispatchLoginRequest(request);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
