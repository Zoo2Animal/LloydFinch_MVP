package com.lloydfinch.tools.actions;

/**
 * Name: IDefaultLifyCycle
 * Author: lloydfinch
 * Function: 生命周期的轻量级实现
 * Date: 2020-03-14 23:39
 * Modify: lloydfinch 2020-03-14 23:39
 */
public interface ILightLifeCycle extends IViewLifeCycle {

    @Override
    default void onCreate() {

    }

    @Override
    default void onStart() {

    }

    @Override
    default void onResume() {

    }

    @Override
    default void onPause() {

    }

    @Override
    default void onStop() {

    }

    @Override
    default void onDestroy() {

    }
}
