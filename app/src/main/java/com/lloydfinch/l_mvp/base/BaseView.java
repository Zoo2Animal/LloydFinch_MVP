package com.lloydfinch.l_mvp.base;

import android.content.Context;
import android.util.AttributeSet;

import com.lloydfinch.tools.actions.IViewLifeCycle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * Name: BaseView
 * Author: lloydfinch
 * Function: BaseView(这里强制写为ViewGroup，而不是View，因为一般的页面root都是ViewGroup，如果需要，可以自己copy一份来extends View)
 * Date: 2020-03-10 13:42
 * Modify: lloydfinch 2020-03-10 13:42
 */
public abstract class BaseView<P extends BasePresenter, Contract> extends ConstraintLayout implements IViewLifeCycle {

    /**
     * View层需要持有P，用来转发请求
     */
    protected P mPresenter;

    //<editor-fold desc="view的native方法">
    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    /**
     * 定义一个模版
     */
    private void init(Context context) {
        mPresenter = getPresenter();
        initView(context);
    }

    protected abstract void initView(Context context);
    //</editor-fold>

    //<editor-fold desc="view的生命周期">

    @Override
    public void onCreate() {
        mPresenter.bindView(this);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        mPresenter.unbind();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mPresenter.unbind();
    }

    //</editor-fold>

    public abstract Contract getContract();

    public abstract P getPresenter();
}
