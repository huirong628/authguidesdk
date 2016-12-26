package com.huirong.authguidelib;

import android.content.Context;

import com.huirong.authguidelib.rom.Rom;

/**
 * Created by HuirongZhang
 * on 26/12/2016.
 */

public class AuthGuider {

    private static Rom mCurrentRom;

    public AuthGuider(Context context, boolean isDebug) {
        SdkEnv.context = context;
        SdkEnv.DEBUG = isDebug;
    }

    /**
     * 查询某权限当前状态
     *
     * @return
     */
    public int queryAuthStatus(int authCode) {
        return mCurrentRom != null && authCode >= 1 && authCode <= 27 ? mCurrentRom.queryAuthStatus(authCode) : 6;
    }
}
