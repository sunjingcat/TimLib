package com.zl.im.lib.core

import android.content.Context
import androidx.annotation.IntDef
import androidx.annotation.StringDef
import com.blankj.utilcode.util.NetworkUtils
import com.google.common.util.concurrent.FutureCallback
import com.google.common.util.concurrent.Futures
import com.troila.im.gen.LoginRequest
import com.troila.im.gen.Platform
import com.troila.im.gen.Response
import com.troila.im.gen.TimMessageServiceGrpc
import com.zl.im.lib.BuildConfig
import com.zl.im.lib.listener.ConnectionStatusChangeListener
import com.zl.im.lib.realm.RealmConfig
import com.zl.im.lib.utils.LogUtils
import io.grpc.ManagedChannelBuilder
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy


class LibCore(context: Context, appId: String, uploadMethod: String, debug: Boolean, host: String) {
    val version = "0.0.1"

    //连接状态
    @IntDef(ConnectionStatusType.disconnect, ConnectionStatusType.connecting, ConnectionStatusType.connected)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConnectionStatusType {
        companion object {
            const val disconnect = 0
            const val connecting = 1
            const val connected = 2
        }
    }

    //上传方式
    @StringDef(UploadModeType.LOCAL, UploadModeType.ALIYUN)
    @Retention(RetentionPolicy.SOURCE)
    annotation class UploadModeType {
        companion object {
            const val LOCAL = "local"
            const val ALIYUN = "aliyun"
        }
    }

    //连接码
    @IntDef(ConnectionCode.SessionExpired, ConnectionCode.ChannelException)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConnectionCode {
        companion object {
            const val SessionExpired = 1013
            const val ChannelException = 1017
        }
    }

    lateinit var connectionStatusChangeListener: ConnectionStatusChangeListener

    var appId = ""
    var uploadMethod = "local"
    var userId = ""
    var token = ""
    var deviceToken = ""
    var sessionId = ""
    var debug = false
    var connectionStatus = ConnectionStatusType.disconnect
    var loginStatus = false
    var hostConfig = ""
    var  netInfoIsConnected = false
    var  connectCount = 0
    var  maxReconnectCount = 3

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

    fun connectWithTokenAndUserId(context: Context,userId:String, token:String, deviceToken:String) {
        this.userId = userId
        this.token = token
        this.deviceToken = deviceToken
        try {
            RealmConfig.init(context,userId)
        } catch (e: Exception){

        }
        login()
        this.netInfoHandle()
//        this.appStateHandle()
    }
    fun  netInfoHandle  ()  {
        NetworkUtils.isRegisteredNetworkStatusChangedListener(object :NetworkUtils.OnNetworkStatusChangedListener{
            override fun onConnected(networkType: NetworkUtils.NetworkType?) {
                LogUtils.d("netInfo change: isConnected")
                resetConnectCount()
                netInfoIsConnected = true
                if (!netInfoIsConnected){
                    if (loginStatus) {
                        connect()
                    } else {
                        login()
                    }
                }
                LogUtils.v("netInfo change: isConnected"+true)
            }

            override fun onDisconnected() {
                resetConnectCount()
                netInfoIsConnected = false
                if (loginStatus){
                    close()
                }
                LogUtils.v("netInfo change: isConnected"+false)
            }

        })
    }
    fun resetConnectCount () {
        this.connectCount = 0
    }
    fun connect () {
        LogUtils.v("connectCount"+this.connectCount)
        if (this.connectCount > this.maxReconnectCount) {
            LogUtils.v("connect count over max connect count")
            return
        }
        this.connectCount += 1
        LogUtils.v("connect start")
        this.createListenerRealtimeMessage()
        this.heartbeat()
        this.syncMessage()
//        this.syncConversationListStatus()
    }
    fun close () {
        LogUtils.v("close connect")
//        this.clearHeartbeat()
//        this.closeListener()
//        this.onConnectionStatusChanged(Core.connectionStatusType.disconnect)
    }
    fun heartbeat() {
//        ThreadUtils.executeBySingleAtFixRate(object :ThreadUtils.Task)
//        this.heartbeatTimer && clearInterval(this.heartbeatTimer)
//        const request = new Requests.HeartbeatRequest()
//        request.setInterval(5)
//        this.heartbeatTimer = setInterval(async () => {
//            const res = await this.request(TimMessageService.heartbeat, request)
//            this.log.debug('heartbeat', res.getCode())
//        }, 5000)
    }
    fun syncMessage (){

    }
    fun createListenerRealtimeMessage () {
        LogUtils.v("createListenerRealtimeMessage")

    }
    fun login() {
        LogUtils.v("'start login'")
//        this.connectionStatusChangeListener.onConnectionStatusChanged(ConnectionStatusType.connecting)
        val loginRequest = loginRequest(this.userId, this.token)
        request(loginRequest)
        //request 方法

    }

    fun loginRequest(userId: String, token: String): LoginRequest {
        return LoginRequest.newBuilder().setAppId(this.appId.toLong())
                .setUserId(userId)
                .setToken(token)
                .setPlatform(Platform.ANDROID)
                .setOsVersion(BuildConfig.VERSION_NAME)
                .setDeviceToken("唯一标识")
                .setSdkVersion(version).build();

    }

    fun request(loginRequest: LoginRequest) {
        val mChannel = ManagedChannelBuilder.forAddress(this.hostConfig, 8080)
                .usePlaintext()
                .build();

//        val interceptor: ClientInterceptor = HeaderClientInterceptor(headerMap)
        mChannel.getState(true)
        mChannel.notifyWhenStateChanged(mChannel.getState(true), object : Runnable {
            override fun run() {
                TODO("Not yet implemented")
                LogUtils.v("连接状态发生变化")
            }

        })
        val login = TimMessageServiceGrpc.newFutureStub(mChannel).login(loginRequest)
        Futures.addCallback(login, object : FutureCallback<Response> {
            override fun onSuccess(result: Response?) {
                TODO("Not yet implemented")
//                result.code==  TODO 写到这里啦
            }

            override fun onFailure(t: Throwable) {
                TODO("Not yet implemented")
            }

        }, null)
    }

}