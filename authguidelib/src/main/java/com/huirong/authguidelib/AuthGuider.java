package com.huirong.authguidelib;

import android.content.Context;

import com.huirong.authguidelib.rom.Rom;
import com.huirong.authguidelib.rom.RomFactory;

/**
 * Created by HuirongZhang
 * on 26/12/2016.
 */

public class AuthGuider {

    private static Rom mCurrentRom;

    public AuthGuider(Context context, boolean isDebug) {
        SdkEnv.mContext = context;
        SdkEnv.DEBUG = isDebug;
        SdkEnv.mPackageName = context.getPackageName();
        init();
    }

    private void init() {
        mCurrentRom = RomFactory.getInstance().createRom();
    }

    public Rom getCurrentRom() {
        return mCurrentRom;
    }

    /**
     * 查询某权限当前状态
     *
     * @return
     */
    public int queryAuthStatus(int authCode) {
        if (mCurrentRom != null) {
            return mCurrentRom.queryAuthStatus(authCode);
        }
        return AuthConstant.AUTH_STATUS_UNADAPTED;
    }
}