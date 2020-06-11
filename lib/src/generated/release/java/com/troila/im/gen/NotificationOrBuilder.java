// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface NotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Notification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 通知类型
   * NT:GroupCreated
   * NT:GroupDismissed
   * NT:GroupMemberJoined
   * NT:GroupMemberQuited
   * NT:GroupRenamed
   * NT:GroupMemberKicked
   * NT:ConversationMuteUpdated
   * NT:ConversationStickyUpdated
   * NT:ConversationRemoved
   * NT:MessageRecalled
   * NT:MessageRead
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   **
   * 通知类型
   * NT:GroupCreated
   * NT:GroupDismissed
   * NT:GroupMemberJoined
   * NT:GroupMemberQuited
   * NT:GroupRenamed
   * NT:GroupMemberKicked
   * NT:ConversationMuteUpdated
   * NT:ConversationStickyUpdated
   * NT:ConversationRemoved
   * NT:MessageRecalled
   * NT:MessageRead
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string data = 2;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 2;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();
}
