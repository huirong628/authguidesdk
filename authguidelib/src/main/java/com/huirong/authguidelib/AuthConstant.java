package com.huirong.authguidelib;

/**
 * Created by HuirongZhang
 * on 26/12/2016.
 * auth defined
 */

public final class AuthConstant {

    /**
     * 权限值
     */
    public static final int AUTH_CODE_SEND_SMS = 1;

    public static final int AUTH_CODE_READ_SMS = 2;

    /**
     * 自启动权限：在ROM设置中通常与开机自启、系统拉活、关联唤醒的权限有关。
     */
    public static final int AUTH_CODE_AUTOSTART = 11;

    /**
     * 后台运行权限：打开后ROM不限制APP后台运行，锁屏不会杀死进程打电话权限。
     */
    public static final int AUTH_CODE_BACKGROUND = 12;

    /**
     * 权限状态值
     */

    /**
     * 未适配：当前ROM上该权限无法完成引导
     */
    public static final int AUTH_STATUS_UNADAPTED = 6;

}