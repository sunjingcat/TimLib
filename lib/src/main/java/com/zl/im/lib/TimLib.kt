package com.zl.im.lib

import android.content.Context
import com.zl.im.lib.core.LibCore

object TimLib {
    lateinit var libCore: LibCore
    fun initWithAppKey(context: Context, appId: String, uploadMethod: String, debug: Boolean, host: String) {
        libCore = LibCore(context, appId, uploadMethod, debug, host);
    }
    fun connectWithTokenAndUserId(context: Context, userId:String, token:String, deviceToken:String) {
        libCore.connectWithTokenAndUserId(context,userId,token,deviceToken)
    }
}