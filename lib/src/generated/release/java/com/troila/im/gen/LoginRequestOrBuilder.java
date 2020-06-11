// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface LoginRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LoginRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 appId = 1;</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>string userId = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string token = 3;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 3;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   *用户平台
   * </pre>
   *
   * <code>.Platform platform = 4;</code>
   * @return The enum numeric value on the wire for platform.
   */
  int getPlatformValue();
  /**
   * <pre>
   *用户平台
   * </pre>
   *
   * <code>.Platform platform = 4;</code>
   * @return The platform.
   */
  com.troila.im.gen.Platform getPlatform();

  /**
   * <code>string osVersion = 5;</code>
   * @return The osVersion.
   */
  java.lang.String getOsVersion();
  /**
   * <code>string osVersion = 5;</code>
   * @return The bytes for osVersion.
   */
  com.google.protobuf.ByteString
      getOsVersionBytes();

  /**
   * <pre>
   * 设备标识
   * </pre>
   *
   * <code>string deviceToken = 6;</code>
   * @return The deviceToken.
   */
  java.lang.String getDeviceToken();
  /**
   * <pre>
   * 设备标识
   * </pre>
   *
   * <code>string deviceToken = 6;</code>
   * @return The bytes for deviceToken.
   */
  com.google.protobuf.ByteString
      getDeviceTokenBytes();

  /**
   * <pre>
   * SDK信息， 如： 1.1.0
   * </pre>
   *
   * <code>string sdkVersion = 7;</code>
   * @return The sdkVersion.
   */
  java.lang.String getSdkVersion();
  /**
   * <pre>
   * SDK信息， 如： 1.1.0
   * </pre>
   *
   * <code>string sdkVersion = 7;</code>
   * @return The bytes for sdkVersion.
   */
  com.google.protobuf.ByteString
      getSdkVersionBytes();

  /**
   * <code>string brand = 8;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 8;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();
}
