package com.zl.im.lib;

import android.app.Application;

import io.realm.Realm;

public class LibApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
