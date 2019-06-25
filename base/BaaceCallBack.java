package com.example.mvp1.base;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public interface BaaceCallBack<T> {
    //成功接收
    void onSuccess(T ste);
    //失败接收
    void onFile(String meg);
}
