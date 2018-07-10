package com.example.gs.mvpdemo.mvp;

/**
 * Created by GaoSheng on 2016/11/26.
 * 17:20
 *
 * @VERSION V1.4
 * com.example.gs.mvpdemo.base
 * mvp之P
 */

public interface IPresenter<V extends IView> {

    /**
     * @param view binding
     */
    void attachView(V view);


    /**
     *Prevent memory leaks and be aware of the binding between presenter and activity
     */
    void detachView();


    /**
     *
     * @return Get View
     */
    IView getIView();

}
