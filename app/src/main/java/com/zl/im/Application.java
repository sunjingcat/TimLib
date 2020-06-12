package com.zl.im;

import androidx.multidex.MultiDex;

import com.zl.im.lib.LibApp;

public class Application extends LibApp {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
