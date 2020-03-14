package com.lloydfinch.l_mvp.base;

import java.lang.ref.WeakReference;

import androidx.annotation.Nullable;

/**
 * Name: BasePresenter
 * Author: lloydfinch
 * Function: BasePresenters
 * Date: 2020-03-10 13:42
 * Modify: lloydfinch 2020-03-10 13:42
 */
public abstract class BasePresenter<V extends BaseView, M extends BaseModel, Contract> {

    /**
     * P层需要持有M，用来真正的执行请求
     */
    protected M mMode;
    private WeakReference<V> weakReference;

    public BasePresenter() {
        mMode = getModel();
    }

    public void bindView(V v) {
        if (null != weakReference) {
            throw new IllegalStateException("Please call unbind first!!!");
        }
        weakReference = new WeakReference<>(v);
    }

    public void unbind() {
        if (null != weakReference) {
            weakReference.clear();
            weakReference = null;
        }
    }

    @Nullable
    protected V getView() {
        if (null != weakReference) {
            return weakReference.get();
        }
        return null;
    }


    public abstract M getModel();

    public abstract Contract getContract();


}
