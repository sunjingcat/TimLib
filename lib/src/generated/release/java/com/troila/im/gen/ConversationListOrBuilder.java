// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

public interface ConversationListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConversationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Conversation content = 1;</code>
   */
  java.util.List<com.troila.im.gen.Conversation> 
      getContentList();
  /**
   * <code>repeated .Conversation content = 1;</code>
   */
  com.troila.im.gen.Conversation getContent(int index);
  /**
   * <code>repeated .Conversation content = 1;</code>
   */
  int getContentCount();
  /**
   * <code>repeated .Conversation content = 1;</code>
   */
  java.util.List<? extends com.troila.im.gen.ConversationOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .Conversation content = 1;</code>
   */
  com.troila.im.gen.ConversationOrBuilder getContentOrBuilder(
      int index);
}
