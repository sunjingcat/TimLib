package com.zl.im.lib;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class LibApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
