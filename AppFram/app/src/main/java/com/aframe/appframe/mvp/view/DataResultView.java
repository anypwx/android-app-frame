package com.aframe.appframe.mvp.view;

/**
 * Description
 * Created by pwx on 2016/12/21.
 * Company MingThink
 */

public interface DataResultView<T> {
    void success(T d);
    void fail(String s,int erCode);
}
