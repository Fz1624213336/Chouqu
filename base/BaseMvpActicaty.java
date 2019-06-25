package com.example.mvp1.base;



/**
 * Created by 方小茗 on 2019/6/4.
 */

public abstract class BaseMvpActicaty<P extends BasePersdefr, M extends BaceModeel, V extends BaceViewd> extends BaceActicaty {
    protected P mpersdefr;

    @Override
    protected void initMvp() {
        mpersdefr=initMyPersdefr();
        if(mpersdefr!=null){
            mpersdefr.attcher(initMyView());
            mpersdefr.onSucces(initMyModel());
        }
    }

    protected abstract M initMyModel();

    protected abstract V initMyView();

    protected abstract P initMyPersdefr();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mpersdefr!=null){
            mpersdefr.destory();
            mpersdefr=null;
        }
    }
}
