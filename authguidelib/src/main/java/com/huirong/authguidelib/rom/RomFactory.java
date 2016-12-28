package com.huirong.authguidelib.rom;

/**
 * Created by HuirongZhang
 * on 26/12/2016.
 */

public class RomFactory {

    private static RomFactory sInstance;

    public static RomFactory getInstance() {
        if (sInstance == null) {
            sInstance = new RomFactory();
        }
        return sInstance;
    }

    public Rom createRom() {
        Rom rom = null;
        if (RomUtil.isRomMiui()) {
            rom = new RomMiui();
        } else if (RomUtil.isRomFuntouch()) {
            rom = new RomVivo();
        }
        return rom;
    }
}
