package com.example.mvp1.base;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public abstract class BaceMvpFrament<P extends BasePersdefr,M extends BaceModeel,V extends BaceViewd>extends BaceFramentActivaty{
    protected  P myPresenter;

    @Override
    protected void initMvp() {
        myPresenter = initMvpPresenter();
        if (myPresenter!=null){
            myPresenter.attcher(initMvpView());
            myPresenter.initModel(initMvpModel());
        }
    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initMvpPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (myPresenter!=null){
            myPresenter.destory();
            myPresenter = null;
        }
    }

}
