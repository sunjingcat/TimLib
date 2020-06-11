// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

/**
 * <pre>
 **
 * 平台类型
 * </pre>
 *
 * Protobuf enum {@code Platform}
 */
public enum Platform
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ANDROID = 0;</code>
   */
  ANDROID(0),
  /**
   * <code>IOS = 1;</code>
   */
  IOS(1),
  /**
   * <code>WEB = 2;</code>
   */
  WEB(2),
  /**
   * <code>PC = 3;</code>
   */
  PC(3),
  /**
   * <code>SYMBIAN = 4;</code>
   */
  SYMBIAN(4),
  /**
   * <code>LINUX = 5;</code>
   */
  LINUX(5),
  /**
   * <code>BLACKBERRY = 6;</code>
   */
  BLACKBERRY(6),
  /**
   * <code>WINDOWSMOBILE = 7;</code>
   */
  WINDOWSMOBILE(7),
  /**
   * <code>PALM = 8;</code>
   */
  PALM(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ANDROID = 0;</code>
   */
  public static final int ANDROID_VALUE = 0;
  /**
   * <code>IOS = 1;</code>
   */
  public static final int IOS_VALUE = 1;
  /**
   * <code>WEB = 2;</code>
   */
  public static final int WEB_VALUE = 2;
  /**
   * <code>PC = 3;</code>
   */
  public static final int PC_VALUE = 3;
  /**
   * <code>SYMBIAN = 4;</code>
   */
  public static final int SYMBIAN_VALUE = 4;
  /**
   * <code>LINUX = 5;</code>
   */
  public static final int LINUX_VALUE = 5;
  /**
   * <code>BLACKBERRY = 6;</code>
   */
  public static final int BLACKBERRY_VALUE = 6;
  /**
   * <code>WINDOWSMOBILE = 7;</code>
   */
  public static final int WINDOWSMOBILE_VALUE = 7;
  /**
   * <code>PALM = 8;</code>
   */
  public static final int PALM_VALUE = 8;


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
  public static Platform valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Platform forNumber(int value) {
    switch (value) {
      case 0: return ANDROID;
      case 1: return IOS;
      case 2: return WEB;
      case 3: return PC;
      case 4: return SYMBIAN;
      case 5: return LINUX;
      case 6: return BLACKBERRY;
      case 7: return WINDOWSMOBILE;
      case 8: return PALM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Platform>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Platform> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Platform>() {
          public Platform findValueByNumber(int number) {
            return Platform.forNumber(number);
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
    return com.troila.im.gen.TimService.getDescriptor().getEnumTypes().get(1);
  }

  private static final Platform[] VALUES = values();

  public static Platform valueOf(
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

  private Platform(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Platform)
}

