// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface SyncUpdateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SyncUpdateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 同步类型
   * </pre>
   *
   * <code>.SyncMessageType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 同步类型
   * </pre>
   *
   * <code>.SyncMessageType type = 1;</code>
   * @return The type.
   */
  com.troila.im.gen.SyncMessageType getType();

  /**
   * <pre>
   * 消息的更新时间戳
   * </pre>
   *
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>uint32 pageSize = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
