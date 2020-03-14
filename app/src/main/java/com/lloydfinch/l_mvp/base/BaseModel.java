package com.lloydfinch.l_mvp.base;

/**
 * Name: BaseModel
 * Author: lloydfinch
 * Function: BaseModel
 * Date: 2020-03-10 13:42
 * Modify: lloydfinch 2020-03-10 13:42
 */
public abstract class BaseModel<P extends BasePresenter, Contract> {

    /**
     * M层需要持有P，用来转发结果
     */
    protected P mPresenter;

    public BaseModel(P mPresenter) {
        this.mPresenter = mPresenter;
    }

    public abstract Contract getContract();

}
