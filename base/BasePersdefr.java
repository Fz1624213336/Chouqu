package com.example.mvp1.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 方小茗 on 2019/6/4.
 */

 public abstract class BasePersdefr <M extends BaceModeel,V extends BaceViewd>{
     protected List<BaceModeel> mBaceModeels=new ArrayList<>();
     protected M myModel;
     protected V myView;
    public void initModel(M mydel){
        this.myModel=mydel;
        mBaceModeels.add(myModel);
    }
    public  void attcher(V myView) {
        this.myView=myView;
    }

    public void onSucces(M myModel) {
        this.myModel=myModel;

    }

    public void destory() {
        if(myView!=null){
            myView=null;
        }
        if(mBaceModeels!=null&&mBaceModeels.size()>0){
            for (BaceModeel baceModel:mBaceModeels) {
                baceModel.clear();
            }
        }
        if(myModel!=null){
            myModel=null;
        }
    }
}
