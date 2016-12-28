package com.huirong.authguidelib.rom;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by HuirongZhang
 * on 27/12/2016.
 */

public class RomBuildProperty {

    /**
     * build.prop定义了系统初始（或永久）的一些参数属性、功能的开放等.
     */
    private static final String FILE_PATH_NAME = "build.prop";

    private static RomBuildProperty sProperty;

    private final Properties mProperties;

    public static RomBuildProperty getProperty() {
        if (sProperty == null) {
            sProperty = new RomBuildProperty();
        }
        return sProperty;
    }

    private RomBuildProperty() {
        mProperties = new Properties();
        try {
            mProperties.load(new FileInputStream(new File(Environment.getRootDirectory(), FILE_PATH_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        return mProperties.isEmpty();
    }

    public boolean containsKey(Object key) {
        return mProperties.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return mProperties.containsValue(value);
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return mProperties.entrySet();
    }
}
