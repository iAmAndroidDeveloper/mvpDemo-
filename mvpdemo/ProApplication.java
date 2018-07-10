package com.example.gs.mvpdemo;


import android.app.Application;
import android.content.Context;

/**
 * Application, mainly used to do initial operations
 */
public class ProApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * @return
     * Global context
     */
    public static Context getmContext() {
        return mContext;
    }

}
