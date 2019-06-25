package com.example.mvp1.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public abstract class BaceFramentActivaty extends Fragment{
    private Unbinder mUnbinder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getkayoutId(), container,false);
        mUnbinder= ButterKnife.bind(this,inflate);
        initMvp();
        initView(inflate);
        initData();
        initListener();
        return inflate;
    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView(View inflate) {

    }

    protected void initMvp() {

    }

    protected abstract int getkayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
