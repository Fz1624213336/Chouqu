package com.example.mvp1.base;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.mvp1.dao.DaoMaster;
import com.example.mvp1.dao.DaoSession;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public class BaceApplication extends Application{
    private static BaceApplication application;
    private static DaoSession daoSession;

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        itip();
    }

    private void itip() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "geeknews.db");
        SQLiteDatabase db = devOpenHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static BaceApplication getApplication() {
        return application;
    }
}
