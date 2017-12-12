package com.example.chewei.myrxjavaproject;

import android.app.Application;

/**
 * Created by ${chewei} on 2017/2/24.
 * params:2017/2/24
 */

public class App extends Application {
    public static App mDemoApp = null;
    /**
     * 获取App全局对象
     *
     * @return
     */
    public static App getApp() {
        if(mDemoApp == null){
            mDemoApp = new App();
        }
        return  mDemoApp;
    }
}
