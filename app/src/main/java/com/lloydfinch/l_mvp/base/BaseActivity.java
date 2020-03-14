package com.lloydfinch.l_mvp.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Name: BaseActivity
 * Author: lloydfinch
 * Function: 此Activity存在的唯一目的是使用模板模式套住view的生命周期
 * Date: 2020-03-14 23:48
 * Modify: lloydfinch 2020-03-14 23:48
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected BaseView mRootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRootView = generateView();
        setContentView(mRootView);

        mRootView.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mRootView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mRootView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mRootView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mRootView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRootView.onDestroy();
    }

    protected abstract BaseView generateView();
}


