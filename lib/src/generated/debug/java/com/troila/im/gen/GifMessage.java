// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

/**
 * <pre>
 **
 * GIF图片消息
 * </pre>
 *
 * Protobuf type {@code GifMessage}
 */
public  final class GifMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GifMessage)
    GifMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GifMessage.newBuilder() to construct.
  private GifMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GifMessage() {
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GifMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GifMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            size_ = input.readUInt64();
            break;
          }
          case 16: {

            width_ = input.readUInt32();
            break;
          }
          case 24: {

            height_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.troila.im.gen.TimService.internal_static_GifMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.troila.im.gen.TimService.internal_static_GifMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.troila.im.gen.GifMessage.class, com.troila.im.gen.GifMessage.Builder.class);
  }

  public static final int SIZE_FIELD_NUMBER = 1;
  private long size_;
  /**
   * <code>uint64 size = 1;</code>
   * @return The size.
   */
  public long getSize() {
    return size_;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  /**
   * <code>uint32 width = 2;</code>
   * @return The width.
   */
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private int height_;
  /**
   * <code>uint32 height = 3;</code>
   * @return The height.
   */
  public int getHeight() {
    return height_;
  }

  public static final int URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 4;</code>
   * @return The url.
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 4;</code>
   * @return The bytes for url.
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (size_ != 0L) {
      output.writeUInt64(1, size_);
    }
    if (width_ != 0) {
      output.writeUInt32(2, width_);
    }
    if (height_ != 0) {
      output.writeUInt32(3, height_);
    }
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, url_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, size_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, height_);
    }
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, url_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.troila.im.gen.GifMessage)) {
      return super.equals(obj);
    }
    com.troila.im.gen.GifMessage other = (com.troila.im.gen.GifMessage) obj;

    if (getSize()
        != other.getSize()) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.troila.im.gen.GifMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.GifMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.GifMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.troila.im.gen.GifMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.GifMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.GifMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.troila.im.gen.GifMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * GIF图片消息
   * </pre>
   *
   * Protobuf type {@code GifMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GifMessage)
      com.troila.im.gen.GifMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.troila.im.gen.TimService.internal_static_GifMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.troila.im.gen.TimService.internal_static_GifMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.troila.im.gen.GifMessage.class, com.troila.im.gen.GifMessage.Builder.class);
    }

    // Construct using com.troila.im.gen.GifMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      size_ = 0L;

      width_ = 0;

      height_ = 0;

      url_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.troila.im.gen.TimService.internal_static_GifMessage_descriptor;
    }

    @java.lang.Override
    public com.troila.im.gen.GifMessage getDefaultInstanceForType() {
      return com.troila.im.gen.GifMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.troila.im.gen.GifMessage build() {
      com.troila.im.gen.GifMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.troila.im.gen.GifMessage buildPartial() {
      com.troila.im.gen.GifMessage result = new com.troila.im.gen.GifMessage(this);
      result.size_ = size_;
      result.width_ = width_;
      result.height_ = height_;
      result.url_ = url_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.troila.im.gen.GifMessage) {
        return mergeFrom((com.troila.im.gen.GifMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.troila.im.gen.GifMessage other) {
      if (other == com.troila.im.gen.GifMessage.getDefaultInstance()) return this;
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.troila.im.gen.GifMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.troila.im.gen.GifMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long size_ ;
    /**
     * <code>uint64 size = 1;</code>
     * @return The size.
     */
    public long getSize() {
      return size_;
    }
    /**
     * <code>uint64 size = 1;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0L;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <code>uint32 width = 2;</code>
     * @return The width.
     */
    public int getWidth() {
      return width_;
    }
    /**
     * <code>uint32 width = 2;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 width = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <code>uint32 height = 3;</code>
     * @return The height.
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <code>uint32 height = 3;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 height = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 4;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GifMessage)
  }

  // @@protoc_insertion_point(class_scope:GifMessage)
  private static final com.troila.im.gen.GifMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.troila.im.gen.GifMessage();
  }

  public static com.troila.im.gen.GifMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GifMessage>
      PARSER = new com.google.protobuf.AbstractParser<GifMessage>() {
    @java.lang.Override
    public GifMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GifMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GifMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GifMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.troila.im.gen.GifMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

