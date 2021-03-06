package com.zl.im.lib.core

import android.content.Context
import androidx.annotation.IntDef
import androidx.annotation.StringDef
import com.blankj.utilcode.util.NetworkUtils
import com.troila.im.gen.LoginRequest
import com.troila.im.gen.Platform
import com.troila.im.gen.Response
import com.troila.im.gen.TimMessageServiceGrpc
import com.zl.im.lib.BuildConfig
import com.zl.im.lib.listener.ConnectionStatusChangeListener
import com.zl.im.lib.net.HeaderClientInterceptor
import com.zl.im.lib.realm.RealmConfig
import com.zl.im.lib.utils.LogUtils
import io.grpc.ClientInterceptors
import io.grpc.ClientInterceptors.*
import io.grpc.ManagedChannelBuilder
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.net.URI
import java.util.concurrent.Executor


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
    var netInfoIsConnected = false
    var connectCount = 0
    var maxReconnectCount = 3

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
        return "http://devtim.idaka.vip:8001"
    }

    fun getMetadata(): Map<String, String> {
        var map = mapOf("Session-Id" to this.sessionId)
        return map
    }

    fun connectWithTokenAndUserId(context: Context, userId: String, token: String, deviceToken: String) {
        this.userId = userId
        this.token = token
        this.deviceToken = deviceToken
        try {
            RealmConfig.init(context, userId)
        } catch (e: Exception) {

        }
        login()
        this.netInfoHandle()
//        this.appStateHandle()
    }

    fun netInfoHandle() {
        NetworkUtils.isRegisteredNetworkStatusChangedListener(object : NetworkUtils.OnNetworkStatusChangedListener {
            override fun onConnected(networkType: NetworkUtils.NetworkType?) {
                LogUtils.d("netInfo change: isConnected")
                resetConnectCount()
                netInfoIsConnected = true
                if (!netInfoIsConnected) {
                    if (loginStatus) {
                        connect()
                    } else {
                        login()
                    }
                }
                LogUtils.v("netInfo change: isConnected" + true)
            }

            override fun onDisconnected() {
                resetConnectCount()
                netInfoIsConnected = false
                if (loginStatus) {
                    close()
                }
                LogUtils.v("netInfo change: isConnected" + false)
            }

        })
    }

    fun resetConnectCount() {
        this.connectCount = 0
    }

    fun connect() {
        LogUtils.v("connectCount" + this.connectCount)
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

    fun close() {
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

    fun syncMessage() {

    }

    fun createListenerRealtimeMessage() {
        LogUtils.v("createListenerRealtimeMessage")

    }

    fun login() {
        LogUtils.v("'start login'")
//        this.connectionStatusChangeListener.onConnectionStatusChanged(ConnectionStatusType.connecting)
        val loginRequest = loginRequest(this.userId, this.token)
        request1(loginRequest)
//        request(loginRequest)
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

    fun request1(loginRequest: LoginRequest) {
        Observable.create(object : ObservableOnSubscribe<Response> {
            @Throws(java.lang.Exception::class)
            override fun subscribe(emitter: ObservableEmitter<Response>) {
                val uri = URI.create(hostConfig);
                val mChannel = ManagedChannelBuilder.forTarget(uri.authority)
                        .usePlaintext()
                        .build();

                HeaderClientInterceptor(getMetadata())
                mChannel.getState(true)
                mChannel.notifyWhenStateChanged(mChannel.getState(true), object : Runnable {
                    override fun run() {
                        LogUtils.v("连接状态发生变化")
                    }

                })
                val login = TimMessageServiceGrpc.newBlockingStub(mChannel).login(loginRequest)
                emitter.onNext(login)

            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<Response> {
                    override fun onSubscribe(d: Disposable) {
                        LogUtils.v("onSubscribe")
                    }

                    override fun onNext(t: Response) {
                        LogUtils.v("onNext", t.message)
                        LogUtils.v("onNext", t.toString())

                    }

                    override fun onError(e: Throwable) {
                        LogUtils.v("onError", e.message)
                    }

                    override fun onComplete() {
                        LogUtils.v("onComplete")
                    }
                })
    }

}