// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface SyncConversationDateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SyncConversationDateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 会话类型
   * CT:Private
   * CT:Group
   * </pre>
   *
   * <code>string conversationType = 1;</code>
   * @return The conversationType.
   */
  java.lang.String getConversationType();
  /**
   * <pre>
   **
   * 会话类型
   * CT:Private
   * CT:Group
   * </pre>
   *
   * <code>string conversationType = 1;</code>
   * @return The bytes for conversationType.
   */
  com.google.protobuf.ByteString
      getConversationTypeBytes();

  /**
   * <pre>
   * 对端ID
   * </pre>
   *
   * <code>string targetId = 2;</code>
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   * <pre>
   * 对端ID
   * </pre>
   *
   * <code>string targetId = 2;</code>
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString
      getTargetIdBytes();

  /**
   * <pre>
   *同步天数
   * </pre>
   *
   * <code>uint32 dayNum = 3;</code>
   * @return The dayNum.
   */
  int getDayNum();

  /**
   * <code>uint32 pageNum = 4;</code>
   * @return The pageNum.
   */
  int getPageNum();

  /**
   * <code>uint32 pageSize = 5;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
