package com.scottfu.wyh.androidutils.mvp;

import android.view.View;

/**
 * Created by fujindong on 2017/6/2.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void initViews(View view);
}
