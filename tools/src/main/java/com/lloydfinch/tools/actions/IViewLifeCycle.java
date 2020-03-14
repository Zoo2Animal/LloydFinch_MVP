package com.lloydfinch.tools.actions;

/**
 * Name: IViewLifeCycle
 * Author: lloydfinch
 * Function: View的生命周期(模仿Activity)
 * Date: 2020-03-14 23:37
 * Modify: lloydfinch 2020-03-14 23:37
 */
public interface IViewLifeCycle {
    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();
}
