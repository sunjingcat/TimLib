// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface SyncDateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SyncDateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

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