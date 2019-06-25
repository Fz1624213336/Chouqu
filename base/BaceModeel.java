package com.example.mvp1.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public abstract class BaceModeel {
    protected CompositeDisposable mCompositeDisposable=new CompositeDisposable();
    public void clear() {
        mCompositeDisposable.clear();
    }
}
