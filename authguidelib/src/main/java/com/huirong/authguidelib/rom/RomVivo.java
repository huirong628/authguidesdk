package com.huirong.authguidelib.rom;

import android.content.Intent;

import com.huirong.authguidelib.AuthConstant;
import com.huirong.authguidelib.SdkEnv;
import com.huirong.authguidelib.pref.AuthGuidePref;

/**
 * Created by HuirongZhang
 * on 28/12/2016.
 */

public class RomVivo extends Rom {

    public RomVivo() {

    }

    public boolean isAdapted() {
        return mIsAdapted;
    }

    @Override
    public int queryAuthStatus(int authCode) {
        int currentStatus = AuthGuidePref.getAuthStatus(authCode);
        if (currentStatus == AuthConstant.AUTH_STATUS_UNADAPTED) {
            return currentStatus;
        } else {
            if (authCode == AuthConstant.AUTH_CODE_AUTOSTART || authCode == AuthConstant.AUTH_CODE_BACKGROUND) {
                return currentStatus;
            } else {

            }
        }
        return 0;
    }

    @Override
    public boolean startAuthGuide(int authCode) {
        boolean result = true;
        int authStatus = AuthGuidePref.getAuthStatus(authCode);
        if (authStatus != AuthConstant.AUTH_STATUS_UNADAPTED) {
            // TODO: 28/12/2016 打开rom的权限设置界面
            showAuthSetting();
        } else {
            result = false;
        }
        return result;
    }

    private void showAuthSetting() {
        Intent intent = new Intent();
        intent.setClassName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
        intent.putExtra("packagename", SdkEnv.mPackageName);
        SdkEnv.mContext.startActivity(intent);
    }
}