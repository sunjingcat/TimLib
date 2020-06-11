package com.zl.im.lib.realm;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmConfig {

    public static void init(Context context,String userId){
        String path = "DaKa-IMLib-"+userId+".realm";
                RealmConfiguration config = new RealmConfiguration.Builder().name(path)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }
}
