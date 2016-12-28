package com.huirong.authguidelib.rom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by HuirongZhang
 * on 26/12/2016.
 */

public class RomUtil {

    private enum ROM_TYPE {
        MIUI_ROM,
        FUNTOUCH_ROM
    }

    /**
     * miui 标识
     */
    private static final String MIUI_KEY = "ro.miui.ui.version.name";
    private static final String MIUI_VALUE = "ro.miui.ui.version.name";

    /**
     * EMUI 标识
     */

    /**
     * Funtouch 标识
     */
    private static final String FUNTOUCH_KEY = "ro.vivo.os.name";
    private static final String FUNTOUCH_VALUE = "Funtouch";


    public static ROM_TYPE getRomType() {
        RomBuildProperty property = RomBuildProperty.getProperty();
        if (property.containsKey(FUNTOUCH_KEY)) {
            return ROM_TYPE.FUNTOUCH_ROM;
        } else if (property.containsKey(MIUI_KEY)) {
            return ROM_TYPE.MIUI_ROM;
        }
        return null;
    }

    /**
     * 判断是否是MUIUI ROM
     *
     * @return
     */
    public static boolean isRomMiui() {
        return getSystemProperty(MIUI_KEY).toLowerCase().contains("miui");
    }

    /**
     * 判断是否是Funtouch Rom(vivo手机)
     *
     * @return
     */
    public static boolean isRomFuntouch() {
        return getSystemProperty(FUNTOUCH_KEY).toLowerCase().contains("funtouch");
    }

    /**
     * {@hide}
     * SystemProperties:
     * Gives access to the system properties store.  The system properties store contains a list of string key-value pairs.
     *
     * @param key
     * @return
     */
    public static String getSystemProperty(String key) {
        String propertyValue = null;
        try {
            Class cla = Class.forName("android.os.SystemProperties");
            Method method = cla.getMethod("get", new Class[]{String.class});
            Object obj = method.invoke(cla, new Object[]{key});
            if (obj != null && obj instanceof String) {
                propertyValue = (String) obj;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}
