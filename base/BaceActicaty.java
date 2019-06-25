package com.example.mvp1.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public abstract class BaceActicaty extends AppCompatActivity{
    //方卓 1810A


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutId());
        ButterKnife.bind(this);
        initMvp();
        initView();
        initData();
        initListener();
    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView() {

    }

    protected void initMvp() {

    }


    protected abstract int getlayoutId();
}
