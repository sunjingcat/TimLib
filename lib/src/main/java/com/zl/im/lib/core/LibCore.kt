package com.zl.im.lib.core

import androidx.annotation.IntDef
import androidx.annotation.StringDef
import com.google.common.util.concurrent.FutureCallback

import com.google.common.util.concurrent.Futures
import com.troila.im.gen.LoginRequest
import com.troila.im.gen.Platform
import com.troila.im.gen.Response
import com.troila.im.gen.TimMessageServiceGrpc
import com.zl.im.lib.BuildConfig
import com.zl.im.lib.listener.ConnectionStatusChangeListener
import com.zl.im.lib.utils.LogUtils
import io.grpc.Grpc
import io.grpc.ManagedChannelBuilder
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy


class LibCore(appId: String, uploadMethod: String, debug: Boolean, host: String) {
    val version = "0.0.1"

    @IntDef(ConnectionStatusType.disconnect, ConnectionStatusType.connecting, ConnectionStatusType.connected)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConnectionStatusType {
        companion object {
            const val disconnect = 0
            const val connecting = 1
            const val connected = 2
        }
    }

    @StringDef(UploadModeType.LOCAL, UploadModeType.ALIYUN)
    @Retention(RetentionPolicy.SOURCE)
    annotation class UploadModeType {
        companion object {
            const val LOCAL = "local"
            const val ALIYUN = "aliyun"
        }
    }

    @IntDef(ConnectionCode.SessionExpired, ConnectionCode.ChannelException)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConnectionCode {
        companion object {
            const val SessionExpired = 1013
            const val ChannelException = 1017
        }
    }

    var connectionStatusChangeListener: ConnectionStatusChangeListener = TODO()
        set(value) {
            field = value
        }
    var appId = ""
    var uploadMethod = "local"
    var userId = ""
    var token = ""
    var sessionId = ""
    var debug = false
    var connectionStatus = ConnectionStatusType.disconnect
    var loginStatus = false
    var hostConfig = ""

    init {
        this.appId = appId
        this.uploadMethod = uploadMethod
        this.debug = debug
        this.hostConfig = host
    }

    fun getHost(): String {
        if (this.hostConfig.isNotEmpty()) {
            return this.hostConfig
        }
        return "http://172.27.104.2"
    }

    fun getMetadata(): Map<String, String> {
        var map = mapOf("Session-Id" to this.sessionId)
        return map
    }

    fun login() {
        LogUtils.v("'start login'")
        this.connectionStatusChangeListener.onConnectionStatusChanged(ConnectionStatusType.connecting)
        val loginRequest = loginRequest(this.userId, this.token)

        //request 方法


    }
    fun loginRequest(userId:String, token:String):LoginRequest{
        return  LoginRequest.newBuilder().setAppId(this.appId.toLong())
                .setUserId(userId)
                .setToken(token)
                .setPlatform(Platform.ANDROID)
                .setOsVersion(BuildConfig.VERSION_NAME)
                .setDeviceToken("唯一标识")
                .setSdkVersion(version).build();

    }
    fun request(loginRequest:LoginRequest){
      val  mChannel = ManagedChannelBuilder.forAddress(this.hostConfig, 8080)
                .usePlaintext()
                .build();
        mChannel.getState(true)
        mChannel.notifyWhenStateChanged(mChannel.getState(true), Runnable {
            kotlin.run {
                LogUtils.v("连接状态发生变化")
            }
        })
        val login = TimMessageServiceGrpc.newFutureStub(mChannel).login(loginRequest)
        Futures.addCallback(login, object: FutureCallback<Response>{
            override fun onSuccess(result: Response?) {
                TODO("Not yet implemented")
//                result.code==  TODO 写到这里啦
            }

            override fun onFailure(t: Throwable) {
                TODO("Not yet implemented")
            }

        },null)
    }


}