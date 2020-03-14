package com.lloydfinch.l_mvp;

import android.app.Application;

import com.lloydfinch.tools.tips.ToastTool;

/**
 * Name: MainApplication
 * Author: lloydfinch
 * Function: 此project的Application
 * Date: 2020-03-15 00:16
 * Modify: lloydfinch 2020-03-15 00:16
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastTool.bind(this);
    }
}
