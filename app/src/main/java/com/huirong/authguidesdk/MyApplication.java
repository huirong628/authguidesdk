package com.huirong.authguidesdk;

import android.app.Application;
import android.content.Context;

/**
 * Created by HuirongZhang
 * on 27/12/2016.
 */

public class MyApplication extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
