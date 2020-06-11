package com.zl.im.lib;

import com.google.common.util.concurrent.Futures;
import com.troila.im.gen.LoginRequest;
import com.troila.im.gen.TimMessageServiceGrpc;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.concurrent.Executors;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LibCore {
    public static final String SERVER_IP = "192.168.137.1";
    private static final int PORT = 8282;
    public static ManagedChannel getChannel(){
        return ManagedChannelBuilder.forAddress(SERVER_IP,PORT)
                .usePlaintext().build();
    }


}
