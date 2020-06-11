package com.troila.im.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 *
 * TIM 消息服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: imserver.proto")
public final class TimMessageServiceGrpc {

  private TimMessageServiceGrpc() {}

  public static final String SERVICE_NAME = "TimMessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.LoginRequest,
      com.troila.im.gen.Response> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.troila.im.gen.LoginRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.LoginRequest,
      com.troila.im.gen.Response> getLoginMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.LoginRequest, com.troila.im.gen.Response> getLoginMethod;
    if ((getLoginMethod = TimMessageServiceGrpc.getLoginMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getLoginMethod = TimMessageServiceGrpc.getLoginMethod) == null) {
          TimMessageServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.LoginRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.LogoutRequest,
      com.troila.im.gen.Response> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.troila.im.gen.LogoutRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.LogoutRequest,
      com.troila.im.gen.Response> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.LogoutRequest, com.troila.im.gen.Response> getLogoutMethod;
    if ((getLogoutMethod = TimMessageServiceGrpc.getLogoutMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getLogoutMethod = TimMessageServiceGrpc.getLogoutMethod) == null) {
          TimMessageServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.LogoutRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SendMessageRequest,
      com.troila.im.gen.Response> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.troila.im.gen.SendMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SendMessageRequest,
      com.troila.im.gen.Response> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SendMessageRequest, com.troila.im.gen.Response> getSendMessageMethod;
    if ((getSendMessageMethod = TimMessageServiceGrpc.getSendMessageMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSendMessageMethod = TimMessageServiceGrpc.getSendMessageMethod) == null) {
          TimMessageServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SendMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.HeartbeatRequest,
      com.troila.im.gen.Response> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heartbeat",
      requestType = com.troila.im.gen.HeartbeatRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.HeartbeatRequest,
      com.troila.im.gen.Response> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.HeartbeatRequest, com.troila.im.gen.Response> getHeartbeatMethod;
    if ((getHeartbeatMethod = TimMessageServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getHeartbeatMethod = TimMessageServiceGrpc.getHeartbeatMethod) == null) {
          TimMessageServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.HeartbeatRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.RealtimeMessageRequest,
      com.troila.im.gen.Message> getListenRealtimeMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listenRealtimeMessage",
      requestType = com.troila.im.gen.RealtimeMessageRequest.class,
      responseType = com.troila.im.gen.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.RealtimeMessageRequest,
      com.troila.im.gen.Message> getListenRealtimeMessageMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.RealtimeMessageRequest, com.troila.im.gen.Message> getListenRealtimeMessageMethod;
    if ((getListenRealtimeMessageMethod = TimMessageServiceGrpc.getListenRealtimeMessageMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getListenRealtimeMessageMethod = TimMessageServiceGrpc.getListenRealtimeMessageMethod) == null) {
          TimMessageServiceGrpc.getListenRealtimeMessageMethod = getListenRealtimeMessageMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.RealtimeMessageRequest, com.troila.im.gen.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listenRealtimeMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.RealtimeMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Message.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListenRealtimeMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.MuteConversationRequest,
      com.troila.im.gen.Response> getSetConversationMuteStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setConversationMuteStatus",
      requestType = com.troila.im.gen.MuteConversationRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.MuteConversationRequest,
      com.troila.im.gen.Response> getSetConversationMuteStatusMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.MuteConversationRequest, com.troila.im.gen.Response> getSetConversationMuteStatusMethod;
    if ((getSetConversationMuteStatusMethod = TimMessageServiceGrpc.getSetConversationMuteStatusMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSetConversationMuteStatusMethod = TimMessageServiceGrpc.getSetConversationMuteStatusMethod) == null) {
          TimMessageServiceGrpc.getSetConversationMuteStatusMethod = getSetConversationMuteStatusMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.MuteConversationRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setConversationMuteStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.MuteConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetConversationMuteStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.StickyConversationRequest,
      com.troila.im.gen.Response> getSetConversationStickyStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setConversationStickyStatus",
      requestType = com.troila.im.gen.StickyConversationRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.StickyConversationRequest,
      com.troila.im.gen.Response> getSetConversationStickyStatusMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.StickyConversationRequest, com.troila.im.gen.Response> getSetConversationStickyStatusMethod;
    if ((getSetConversationStickyStatusMethod = TimMessageServiceGrpc.getSetConversationStickyStatusMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSetConversationStickyStatusMethod = TimMessageServiceGrpc.getSetConversationStickyStatusMethod) == null) {
          TimMessageServiceGrpc.getSetConversationStickyStatusMethod = getSetConversationStickyStatusMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.StickyConversationRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setConversationStickyStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.StickyConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetConversationStickyStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.RemoveConversationRequest,
      com.troila.im.gen.Response> getRemoveRemoteConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeRemoteConversation",
      requestType = com.troila.im.gen.RemoveConversationRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.RemoveConversationRequest,
      com.troila.im.gen.Response> getRemoveRemoteConversationMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.RemoveConversationRequest, com.troila.im.gen.Response> getRemoveRemoteConversationMethod;
    if ((getRemoveRemoteConversationMethod = TimMessageServiceGrpc.getRemoveRemoteConversationMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getRemoveRemoteConversationMethod = TimMessageServiceGrpc.getRemoveRemoteConversationMethod) == null) {
          TimMessageServiceGrpc.getRemoveRemoteConversationMethod = getRemoveRemoteConversationMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.RemoveConversationRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeRemoteConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.RemoveConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveRemoteConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.ConversationListRequest,
      com.troila.im.gen.Response> getGetRemoteConversationListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRemoteConversationList",
      requestType = com.troila.im.gen.ConversationListRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.ConversationListRequest,
      com.troila.im.gen.Response> getGetRemoteConversationListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.ConversationListRequest, com.troila.im.gen.Response> getGetRemoteConversationListMethod;
    if ((getGetRemoteConversationListMethod = TimMessageServiceGrpc.getGetRemoteConversationListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getGetRemoteConversationListMethod = TimMessageServiceGrpc.getGetRemoteConversationListMethod) == null) {
          TimMessageServiceGrpc.getGetRemoteConversationListMethod = getGetRemoteConversationListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.ConversationListRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRemoteConversationList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.ConversationListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRemoteConversationListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.LatestConversationMessageRequest,
      com.troila.im.gen.Response> getGetLatestConversationMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLatestConversationMessageList",
      requestType = com.troila.im.gen.LatestConversationMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.LatestConversationMessageRequest,
      com.troila.im.gen.Response> getGetLatestConversationMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.LatestConversationMessageRequest, com.troila.im.gen.Response> getGetLatestConversationMessageListMethod;
    if ((getGetLatestConversationMessageListMethod = TimMessageServiceGrpc.getGetLatestConversationMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getGetLatestConversationMessageListMethod = TimMessageServiceGrpc.getGetLatestConversationMessageListMethod) == null) {
          TimMessageServiceGrpc.getGetLatestConversationMessageListMethod = getGetLatestConversationMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.LatestConversationMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLatestConversationMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.LatestConversationMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLatestConversationMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationMessageRequest,
      com.troila.im.gen.Response> getSyncConversationMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncConversationMessageList",
      requestType = com.troila.im.gen.SyncConversationMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationMessageRequest,
      com.troila.im.gen.Response> getSyncConversationMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationMessageRequest, com.troila.im.gen.Response> getSyncConversationMessageListMethod;
    if ((getSyncConversationMessageListMethod = TimMessageServiceGrpc.getSyncConversationMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncConversationMessageListMethod = TimMessageServiceGrpc.getSyncConversationMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncConversationMessageListMethod = getSyncConversationMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncConversationMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncConversationMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncConversationMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncConversationMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationUpdateMessageRequest,
      com.troila.im.gen.Response> getSyncConversationUpdateMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncConversationUpdateMessageList",
      requestType = com.troila.im.gen.SyncConversationUpdateMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationUpdateMessageRequest,
      com.troila.im.gen.Response> getSyncConversationUpdateMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationUpdateMessageRequest, com.troila.im.gen.Response> getSyncConversationUpdateMessageListMethod;
    if ((getSyncConversationUpdateMessageListMethod = TimMessageServiceGrpc.getSyncConversationUpdateMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncConversationUpdateMessageListMethod = TimMessageServiceGrpc.getSyncConversationUpdateMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncConversationUpdateMessageListMethod = getSyncConversationUpdateMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncConversationUpdateMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncConversationUpdateMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncConversationUpdateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncConversationUpdateMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationDateMessageRequest,
      com.troila.im.gen.Response> getSyncConversationDateMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncConversationDateMessageList",
      requestType = com.troila.im.gen.SyncConversationDateMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationDateMessageRequest,
      com.troila.im.gen.Response> getSyncConversationDateMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncConversationDateMessageRequest, com.troila.im.gen.Response> getSyncConversationDateMessageListMethod;
    if ((getSyncConversationDateMessageListMethod = TimMessageServiceGrpc.getSyncConversationDateMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncConversationDateMessageListMethod = TimMessageServiceGrpc.getSyncConversationDateMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncConversationDateMessageListMethod = getSyncConversationDateMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncConversationDateMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncConversationDateMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncConversationDateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncConversationDateMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncMessageRequest,
      com.troila.im.gen.Response> getSyncMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncMessageList",
      requestType = com.troila.im.gen.SyncMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncMessageRequest,
      com.troila.im.gen.Response> getSyncMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncMessageRequest, com.troila.im.gen.Response> getSyncMessageListMethod;
    if ((getSyncMessageListMethod = TimMessageServiceGrpc.getSyncMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncMessageListMethod = TimMessageServiceGrpc.getSyncMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncMessageListMethod = getSyncMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncUpdateMessageRequest,
      com.troila.im.gen.Response> getSyncUpdateMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncUpdateMessageList",
      requestType = com.troila.im.gen.SyncUpdateMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncUpdateMessageRequest,
      com.troila.im.gen.Response> getSyncUpdateMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncUpdateMessageRequest, com.troila.im.gen.Response> getSyncUpdateMessageListMethod;
    if ((getSyncUpdateMessageListMethod = TimMessageServiceGrpc.getSyncUpdateMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncUpdateMessageListMethod = TimMessageServiceGrpc.getSyncUpdateMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncUpdateMessageListMethod = getSyncUpdateMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncUpdateMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncUpdateMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncUpdateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncUpdateMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.SyncDateMessageRequest,
      com.troila.im.gen.Response> getSyncDateMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncDateMessageList",
      requestType = com.troila.im.gen.SyncDateMessageRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.SyncDateMessageRequest,
      com.troila.im.gen.Response> getSyncDateMessageListMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.SyncDateMessageRequest, com.troila.im.gen.Response> getSyncDateMessageListMethod;
    if ((getSyncDateMessageListMethod = TimMessageServiceGrpc.getSyncDateMessageListMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getSyncDateMessageListMethod = TimMessageServiceGrpc.getSyncDateMessageListMethod) == null) {
          TimMessageServiceGrpc.getSyncDateMessageListMethod = getSyncDateMessageListMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.SyncDateMessageRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "syncDateMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.SyncDateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncDateMessageListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.MessageByIdRequest,
      com.troila.im.gen.Response> getGetMessageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessageById",
      requestType = com.troila.im.gen.MessageByIdRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.MessageByIdRequest,
      com.troila.im.gen.Response> getGetMessageByIdMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.MessageByIdRequest, com.troila.im.gen.Response> getGetMessageByIdMethod;
    if ((getGetMessageByIdMethod = TimMessageServiceGrpc.getGetMessageByIdMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getGetMessageByIdMethod = TimMessageServiceGrpc.getGetMessageByIdMethod) == null) {
          TimMessageServiceGrpc.getGetMessageByIdMethod = getGetMessageByIdMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.MessageByIdRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.MessageByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMessageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.troila.im.gen.FileUploadRequest,
      com.troila.im.gen.Response> getGetFileUploadInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFileUploadInfo",
      requestType = com.troila.im.gen.FileUploadRequest.class,
      responseType = com.troila.im.gen.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.troila.im.gen.FileUploadRequest,
      com.troila.im.gen.Response> getGetFileUploadInfoMethod() {
    io.grpc.MethodDescriptor<com.troila.im.gen.FileUploadRequest, com.troila.im.gen.Response> getGetFileUploadInfoMethod;
    if ((getGetFileUploadInfoMethod = TimMessageServiceGrpc.getGetFileUploadInfoMethod) == null) {
      synchronized (TimMessageServiceGrpc.class) {
        if ((getGetFileUploadInfoMethod = TimMessageServiceGrpc.getGetFileUploadInfoMethod) == null) {
          TimMessageServiceGrpc.getGetFileUploadInfoMethod = getGetFileUploadInfoMethod =
              io.grpc.MethodDescriptor.<com.troila.im.gen.FileUploadRequest, com.troila.im.gen.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFileUploadInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.FileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.troila.im.gen.Response.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFileUploadInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimMessageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceStub>() {
        @java.lang.Override
        public TimMessageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimMessageServiceStub(channel, callOptions);
        }
      };
    return TimMessageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimMessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceBlockingStub>() {
        @java.lang.Override
        public TimMessageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimMessageServiceBlockingStub(channel, callOptions);
        }
      };
    return TimMessageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimMessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimMessageServiceFutureStub>() {
        @java.lang.Override
        public TimMessageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimMessageServiceFutureStub(channel, callOptions);
        }
      };
    return TimMessageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *
   * TIM 消息服务
   * </pre>
   */
  public static abstract class TimMessageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * 客户端登录
     * 登录成功后返回LoggedUser
     * 后续请求Metadata需传入session-id
     * </pre>
     */
    public void login(com.troila.im.gen.LoginRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 客户端登出
     * </pre>
     */
    public void logout(com.troila.im.gen.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 上行发送消息
     * 接收客户端发送的消息并向下投递
     * 投递成功后返回投递的Message信息
     * </pre>
     */
    public void sendMessage(com.troila.im.gen.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 发送心跳信息
     * </pre>
     */
    public void heartbeat(com.troila.im.gen.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 监听下行消息
     * 监听上行投递的消息，并将消息发送给所有在线的用户客户端
     * </pre>
     */
    public void listenRealtimeMessage(com.troila.im.gen.RealtimeMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getListenRealtimeMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 设置会话消息免打扰
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void setConversationMuteStatus(com.troila.im.gen.MuteConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSetConversationMuteStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 设置会话置顶
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void setConversationStickyStatus(com.troila.im.gen.StickyConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSetConversationStickyStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 删除服务端会话
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void removeRemoteConversation(com.troila.im.gen.RemoveConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRemoteConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 获取服务端会话列表
     * 返回当前用户所有会话
     * </pre>
     */
    public void getRemoteConversationList(com.troila.im.gen.ConversationListRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRemoteConversationListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 获取最新消息
     * </pre>
     */
    public void getLatestConversationMessageList(com.troila.im.gen.LatestConversationMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestConversationMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步会话消息
     * </pre>
     */
    public void syncConversationMessageList(com.troila.im.gen.SyncConversationMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncConversationMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步会话消息
     * </pre>
     */
    public void syncConversationUpdateMessageList(com.troila.im.gen.SyncConversationUpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncConversationUpdateMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 同步最近几天的会话消息
     * </pre>
     */
    public void syncConversationDateMessageList(com.troila.im.gen.SyncConversationDateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncConversationDateMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步消息
     * </pre>
     */
    public void syncMessageList(com.troila.im.gen.SyncMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步消息
     * </pre>
     */
    public void syncUpdateMessageList(com.troila.im.gen.SyncUpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncUpdateMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 同步最近几天的消息
     * </pre>
     */
    public void syncDateMessageList(com.troila.im.gen.SyncDateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncDateMessageListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID获取当前消息
     * </pre>
     */
    public void getMessageById(com.troila.im.gen.MessageByIdRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessageByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 获取文件上传信息
     * 返回文件上传URL等信息
     * </pre>
     */
    public void getFileUploadInfo(com.troila.im.gen.FileUploadRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUploadInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.LoginRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.LogoutRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SendMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.HeartbeatRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getListenRealtimeMessageMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.troila.im.gen.RealtimeMessageRequest,
                com.troila.im.gen.Message>(
                  this, METHODID_LISTEN_REALTIME_MESSAGE)))
          .addMethod(
            getSetConversationMuteStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.MuteConversationRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SET_CONVERSATION_MUTE_STATUS)))
          .addMethod(
            getSetConversationStickyStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.StickyConversationRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SET_CONVERSATION_STICKY_STATUS)))
          .addMethod(
            getRemoveRemoteConversationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.RemoveConversationRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_REMOVE_REMOTE_CONVERSATION)))
          .addMethod(
            getGetRemoteConversationListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.ConversationListRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_GET_REMOTE_CONVERSATION_LIST)))
          .addMethod(
            getGetLatestConversationMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.LatestConversationMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_GET_LATEST_CONVERSATION_MESSAGE_LIST)))
          .addMethod(
            getSyncConversationMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncConversationMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_CONVERSATION_MESSAGE_LIST)))
          .addMethod(
            getSyncConversationUpdateMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncConversationUpdateMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_CONVERSATION_UPDATE_MESSAGE_LIST)))
          .addMethod(
            getSyncConversationDateMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncConversationDateMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_CONVERSATION_DATE_MESSAGE_LIST)))
          .addMethod(
            getSyncMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_MESSAGE_LIST)))
          .addMethod(
            getSyncUpdateMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncUpdateMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_UPDATE_MESSAGE_LIST)))
          .addMethod(
            getSyncDateMessageListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.SyncDateMessageRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_SYNC_DATE_MESSAGE_LIST)))
          .addMethod(
            getGetMessageByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.MessageByIdRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_GET_MESSAGE_BY_ID)))
          .addMethod(
            getGetFileUploadInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.troila.im.gen.FileUploadRequest,
                com.troila.im.gen.Response>(
                  this, METHODID_GET_FILE_UPLOAD_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *
   * TIM 消息服务
   * </pre>
   */
  public static final class TimMessageServiceStub extends io.grpc.stub.AbstractAsyncStub<TimMessageServiceStub> {
    private TimMessageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimMessageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimMessageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 客户端登录
     * 登录成功后返回LoggedUser
     * 后续请求Metadata需传入session-id
     * </pre>
     */
    public void login(com.troila.im.gen.LoginRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 客户端登出
     * </pre>
     */
    public void logout(com.troila.im.gen.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 上行发送消息
     * 接收客户端发送的消息并向下投递
     * 投递成功后返回投递的Message信息
     * </pre>
     */
    public void sendMessage(com.troila.im.gen.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 发送心跳信息
     * </pre>
     */
    public void heartbeat(com.troila.im.gen.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 监听下行消息
     * 监听上行投递的消息，并将消息发送给所有在线的用户客户端
     * </pre>
     */
    public void listenRealtimeMessage(com.troila.im.gen.RealtimeMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListenRealtimeMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 设置会话消息免打扰
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void setConversationMuteStatus(com.troila.im.gen.MuteConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetConversationMuteStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 设置会话置顶
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void setConversationStickyStatus(com.troila.im.gen.StickyConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetConversationStickyStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 删除服务端会话
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public void removeRemoteConversation(com.troila.im.gen.RemoveConversationRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRemoteConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 获取服务端会话列表
     * 返回当前用户所有会话
     * </pre>
     */
    public void getRemoteConversationList(com.troila.im.gen.ConversationListRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRemoteConversationListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 获取最新消息
     * </pre>
     */
    public void getLatestConversationMessageList(com.troila.im.gen.LatestConversationMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestConversationMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步会话消息
     * </pre>
     */
    public void syncConversationMessageList(com.troila.im.gen.SyncConversationMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncConversationMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步会话消息
     * </pre>
     */
    public void syncConversationUpdateMessageList(com.troila.im.gen.SyncConversationUpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncConversationUpdateMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 同步最近几天的会话消息
     * </pre>
     */
    public void syncConversationDateMessageList(com.troila.im.gen.SyncConversationDateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncConversationDateMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步消息
     * </pre>
     */
    public void syncMessageList(com.troila.im.gen.SyncMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步消息
     * </pre>
     */
    public void syncUpdateMessageList(com.troila.im.gen.SyncUpdateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncUpdateMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 同步最近几天的消息
     * </pre>
     */
    public void syncDateMessageList(com.troila.im.gen.SyncDateMessageRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncDateMessageListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 根据消息ID获取当前消息
     * </pre>
     */
    public void getMessageById(com.troila.im.gen.MessageByIdRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 获取文件上传信息
     * 返回文件上传URL等信息
     * </pre>
     */
    public void getFileUploadInfo(com.troila.im.gen.FileUploadRequest request,
        io.grpc.stub.StreamObserver<com.troila.im.gen.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUploadInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *
   * TIM 消息服务
   * </pre>
   */
  public static final class TimMessageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TimMessageServiceBlockingStub> {
    private TimMessageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimMessageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimMessageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 客户端登录
     * 登录成功后返回LoggedUser
     * 后续请求Metadata需传入session-id
     * </pre>
     */
    public com.troila.im.gen.Response login(com.troila.im.gen.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 客户端登出
     * </pre>
     */
    public com.troila.im.gen.Response logout(com.troila.im.gen.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 上行发送消息
     * 接收客户端发送的消息并向下投递
     * 投递成功后返回投递的Message信息
     * </pre>
     */
    public com.troila.im.gen.Response sendMessage(com.troila.im.gen.SendMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 发送心跳信息
     * </pre>
     */
    public com.troila.im.gen.Response heartbeat(com.troila.im.gen.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 监听下行消息
     * 监听上行投递的消息，并将消息发送给所有在线的用户客户端
     * </pre>
     */
    public java.util.Iterator<com.troila.im.gen.Message> listenRealtimeMessage(
        com.troila.im.gen.RealtimeMessageRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListenRealtimeMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 设置会话消息免打扰
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.troila.im.gen.Response setConversationMuteStatus(com.troila.im.gen.MuteConversationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetConversationMuteStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 设置会话置顶
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.troila.im.gen.Response setConversationStickyStatus(com.troila.im.gen.StickyConversationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetConversationStickyStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 删除服务端会话
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.troila.im.gen.Response removeRemoteConversation(com.troila.im.gen.RemoveConversationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRemoteConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 获取服务端会话列表
     * 返回当前用户所有会话
     * </pre>
     */
    public com.troila.im.gen.Response getRemoteConversationList(com.troila.im.gen.ConversationListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRemoteConversationListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 获取最新消息
     * </pre>
     */
    public com.troila.im.gen.Response getLatestConversationMessageList(com.troila.im.gen.LatestConversationMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestConversationMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步会话消息
     * </pre>
     */
    public com.troila.im.gen.Response syncConversationMessageList(com.troila.im.gen.SyncConversationMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncConversationMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步会话消息
     * </pre>
     */
    public com.troila.im.gen.Response syncConversationUpdateMessageList(com.troila.im.gen.SyncConversationUpdateMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncConversationUpdateMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 同步最近几天的会话消息
     * </pre>
     */
    public com.troila.im.gen.Response syncConversationDateMessageList(com.troila.im.gen.SyncConversationDateMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncConversationDateMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步消息
     * </pre>
     */
    public com.troila.im.gen.Response syncMessageList(com.troila.im.gen.SyncMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步消息
     * </pre>
     */
    public com.troila.im.gen.Response syncUpdateMessageList(com.troila.im.gen.SyncUpdateMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncUpdateMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 同步最近几天的消息
     * </pre>
     */
    public com.troila.im.gen.Response syncDateMessageList(com.troila.im.gen.SyncDateMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncDateMessageListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID获取当前消息
     * </pre>
     */
    public com.troila.im.gen.Response getMessageById(com.troila.im.gen.MessageByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMessageByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 获取文件上传信息
     * 返回文件上传URL等信息
     * </pre>
     */
    public com.troila.im.gen.Response getFileUploadInfo(com.troila.im.gen.FileUploadRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUploadInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *
   * TIM 消息服务
   * </pre>
   */
  public static final class TimMessageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TimMessageServiceFutureStub> {
    private TimMessageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimMessageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimMessageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 客户端登录
     * 登录成功后返回LoggedUser
     * 后续请求Metadata需传入session-id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> login(
        com.troila.im.gen.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 客户端登出
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> logout(
        com.troila.im.gen.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 上行发送消息
     * 接收客户端发送的消息并向下投递
     * 投递成功后返回投递的Message信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> sendMessage(
        com.troila.im.gen.SendMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 发送心跳信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> heartbeat(
        com.troila.im.gen.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 设置会话消息免打扰
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> setConversationMuteStatus(
        com.troila.im.gen.MuteConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetConversationMuteStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 设置会话置顶
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> setConversationStickyStatus(
        com.troila.im.gen.StickyConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetConversationStickyStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 删除服务端会话
     * 设置成功后下发通知到用户的其它端
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> removeRemoteConversation(
        com.troila.im.gen.RemoveConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRemoteConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 获取服务端会话列表
     * 返回当前用户所有会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> getRemoteConversationList(
        com.troila.im.gen.ConversationListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRemoteConversationListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 获取最新消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> getLatestConversationMessageList(
        com.troila.im.gen.LatestConversationMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestConversationMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步会话消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncConversationMessageList(
        com.troila.im.gen.SyncConversationMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncConversationMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步会话消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncConversationUpdateMessageList(
        com.troila.im.gen.SyncConversationUpdateMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncConversationUpdateMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 同步最近几天的会话消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncConversationDateMessageList(
        com.troila.im.gen.SyncConversationDateMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncConversationDateMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID同步消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncMessageList(
        com.troila.im.gen.SyncMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 根据消息最后更新时间同步消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncUpdateMessageList(
        com.troila.im.gen.SyncUpdateMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncUpdateMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 同步最近几天的消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> syncDateMessageList(
        com.troila.im.gen.SyncDateMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncDateMessageListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 根据消息ID获取当前消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> getMessageById(
        com.troila.im.gen.MessageByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessageByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 获取文件上传信息
     * 返回文件上传URL等信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.troila.im.gen.Response> getFileUploadInfo(
        com.troila.im.gen.FileUploadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUploadInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_SEND_MESSAGE = 2;
  private static final int METHODID_HEARTBEAT = 3;
  private static final int METHODID_LISTEN_REALTIME_MESSAGE = 4;
  private static final int METHODID_SET_CONVERSATION_MUTE_STATUS = 5;
  private static final int METHODID_SET_CONVERSATION_STICKY_STATUS = 6;
  private static final int METHODID_REMOVE_REMOTE_CONVERSATION = 7;
  private static final int METHODID_GET_REMOTE_CONVERSATION_LIST = 8;
  private static final int METHODID_GET_LATEST_CONVERSATION_MESSAGE_LIST = 9;
  private static final int METHODID_SYNC_CONVERSATION_MESSAGE_LIST = 10;
  private static final int METHODID_SYNC_CONVERSATION_UPDATE_MESSAGE_LIST = 11;
  private static final int METHODID_SYNC_CONVERSATION_DATE_MESSAGE_LIST = 12;
  private static final int METHODID_SYNC_MESSAGE_LIST = 13;
  private static final int METHODID_SYNC_UPDATE_MESSAGE_LIST = 14;
  private static final int METHODID_SYNC_DATE_MESSAGE_LIST = 15;
  private static final int METHODID_GET_MESSAGE_BY_ID = 16;
  private static final int METHODID_GET_FILE_UPLOAD_INFO = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimMessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimMessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.troila.im.gen.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.troila.im.gen.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.troila.im.gen.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.troila.im.gen.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_LISTEN_REALTIME_MESSAGE:
          serviceImpl.listenRealtimeMessage((com.troila.im.gen.RealtimeMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Message>) responseObserver);
          break;
        case METHODID_SET_CONVERSATION_MUTE_STATUS:
          serviceImpl.setConversationMuteStatus((com.troila.im.gen.MuteConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SET_CONVERSATION_STICKY_STATUS:
          serviceImpl.setConversationStickyStatus((com.troila.im.gen.StickyConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_REMOVE_REMOTE_CONVERSATION:
          serviceImpl.removeRemoteConversation((com.troila.im.gen.RemoveConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_GET_REMOTE_CONVERSATION_LIST:
          serviceImpl.getRemoteConversationList((com.troila.im.gen.ConversationListRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_GET_LATEST_CONVERSATION_MESSAGE_LIST:
          serviceImpl.getLatestConversationMessageList((com.troila.im.gen.LatestConversationMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_CONVERSATION_MESSAGE_LIST:
          serviceImpl.syncConversationMessageList((com.troila.im.gen.SyncConversationMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_CONVERSATION_UPDATE_MESSAGE_LIST:
          serviceImpl.syncConversationUpdateMessageList((com.troila.im.gen.SyncConversationUpdateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_CONVERSATION_DATE_MESSAGE_LIST:
          serviceImpl.syncConversationDateMessageList((com.troila.im.gen.SyncConversationDateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_MESSAGE_LIST:
          serviceImpl.syncMessageList((com.troila.im.gen.SyncMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_UPDATE_MESSAGE_LIST:
          serviceImpl.syncUpdateMessageList((com.troila.im.gen.SyncUpdateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_SYNC_DATE_MESSAGE_LIST:
          serviceImpl.syncDateMessageList((com.troila.im.gen.SyncDateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_BY_ID:
          serviceImpl.getMessageById((com.troila.im.gen.MessageByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        case METHODID_GET_FILE_UPLOAD_INFO:
          serviceImpl.getFileUploadInfo((com.troila.im.gen.FileUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.troila.im.gen.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TimMessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getListenRealtimeMessageMethod())
              .addMethod(getSetConversationMuteStatusMethod())
              .addMethod(getSetConversationStickyStatusMethod())
              .addMethod(getRemoveRemoteConversationMethod())
              .addMethod(getGetRemoteConversationListMethod())
              .addMethod(getGetLatestConversationMessageListMethod())
              .addMethod(getSyncConversationMessageListMethod())
              .addMethod(getSyncConversationUpdateMessageListMethod())
              .addMethod(getSyncConversationDateMessageListMethod())
              .addMethod(getSyncMessageListMethod())
              .addMethod(getSyncUpdateMessageListMethod())
              .addMethod(getSyncDateMessageListMethod())
              .addMethod(getGetMessageByIdMethod())
              .addMethod(getGetFileUploadInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
