package com.huirong.authguidelib.rom;

/**
 * Created by HuirongZhang
 * on 26/12/2016.
 * <p>
 * 定义相关功能接口
 */

public abstract class Rom {

    protected boolean mIsAdapted = true;

    /**
     * 查询某权限当前状态
     *
     * @param authCode AuthConstant中对应的权限值。
     * @return AuthConstant中对应的权限状态值。
     */
    public abstract int queryAuthStatus(int authCode);

    /**
     * 跳转到该权限的ROM设置页面.
     *
     * @param authCode AuthConstant中对应的权限值.
     * @return
     */
    public abstract boolean startAuthGuide(int authCode);
}
