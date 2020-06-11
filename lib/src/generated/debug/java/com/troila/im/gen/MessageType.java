// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

/**
 * <pre>
 **
 * 消息类型
 * </pre>
 *
 * Protobuf enum {@code MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *内容类消息
   * </pre>
   *
   * <code>CONTENT = 0;</code>
   */
  CONTENT(0),
  /**
   * <pre>
   *状态类消息
   * </pre>
   *
   * <code>STATUS = 1;</code>
   */
  STATUS(1),
  /**
   * <pre>
   *命令类消息
   * </pre>
   *
   * <code>COMMAND = 2;</code>
   */
  COMMAND(2),
  /**
   * <pre>
   *通知类消息
   * </pre>
   *
   * <code>NOTIFICATION = 3;</code>
   */
  NOTIFICATION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *内容类消息
   * </pre>
   *
   * <code>CONTENT = 0;</code>
   */
  public static final int CONTENT_VALUE = 0;
  /**
   * <pre>
   *状态类消息
   * </pre>
   *
   * <code>STATUS = 1;</code>
   */
  public static final int STATUS_VALUE = 1;
  /**
   * <pre>
   *命令类消息
   * </pre>
   *
   * <code>COMMAND = 2;</code>
   */
  public static final int COMMAND_VALUE = 2;
  /**
   * <pre>
   *通知类消息
   * </pre>
   *
   * <code>NOTIFICATION = 3;</code>
   */
  public static final int NOTIFICATION_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return CONTENT;
      case 1: return STATUS;
      case 2: return COMMAND;
      case 3: return NOTIFICATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.troila.im.gen.TimService.getDescriptor().getEnumTypes().get(2);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MessageType)
}
