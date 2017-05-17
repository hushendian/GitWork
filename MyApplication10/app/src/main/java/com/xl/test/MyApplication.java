package com.xl.test;

import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by hushendian on 2017/5/15.
 */

public class MyApplication extends LitePalApplication {


    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

}
