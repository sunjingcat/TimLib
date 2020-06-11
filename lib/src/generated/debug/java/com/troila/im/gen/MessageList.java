// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imserver.proto

package com.troila.im.gen;

/**
 * Protobuf type {@code MessageList}
 */
public  final class MessageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MessageList)
    MessageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageList.newBuilder() to construct.
  private MessageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageList() {
    content_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MessageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              content_ = new java.util.ArrayList<com.troila.im.gen.Message>();
              mutable_bitField0_ |= 0x00000001;
            }
            content_.add(
                input.readMessage(com.troila.im.gen.Message.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        content_ = java.util.Collections.unmodifiableList(content_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.troila.im.gen.TimService.internal_static_MessageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.troila.im.gen.TimService.internal_static_MessageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.troila.im.gen.MessageList.class, com.troila.im.gen.MessageList.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private java.util.List<com.troila.im.gen.Message> content_;
  /**
   * <code>repeated .Message content = 1;</code>
   */
  public java.util.List<com.troila.im.gen.Message> getContentList() {
    return content_;
  }
  /**
   * <code>repeated .Message content = 1;</code>
   */
  public java.util.List<? extends com.troila.im.gen.MessageOrBuilder> 
      getContentOrBuilderList() {
    return content_;
  }
  /**
   * <code>repeated .Message content = 1;</code>
   */
  public int getContentCount() {
    return content_.size();
  }
  /**
   * <code>repeated .Message content = 1;</code>
   */
  public com.troila.im.gen.Message getContent(int index) {
    return content_.get(index);
  }
  /**
   * <code>repeated .Message content = 1;</code>
   */
  public com.troila.im.gen.MessageOrBuilder getContentOrBuilder(
      int index) {
    return content_.get(index);
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
    for (int i = 0; i < content_.size(); i++) {
      output.writeMessage(1, content_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < content_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, content_.get(i));
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
    if (!(obj instanceof com.troila.im.gen.MessageList)) {
      return super.equals(obj);
    }
    com.troila.im.gen.MessageList other = (com.troila.im.gen.MessageList) obj;

    if (!getContentList()
        .equals(other.getContentList())) return false;
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
    if (getContentCount() > 0) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.troila.im.gen.MessageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.MessageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.troila.im.gen.MessageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.troila.im.gen.MessageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.MessageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.troila.im.gen.MessageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.troila.im.gen.MessageList parseFrom(
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
  public static Builder newBuilder(com.troila.im.gen.MessageList prototype) {
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
   * Protobuf type {@code MessageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MessageList)
      com.troila.im.gen.MessageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.troila.im.gen.TimService.internal_static_MessageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.troila.im.gen.TimService.internal_static_MessageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.troila.im.gen.MessageList.class, com.troila.im.gen.MessageList.Builder.class);
    }

    // Construct using com.troila.im.gen.MessageList.newBuilder()
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
        getContentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        contentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.troila.im.gen.TimService.internal_static_MessageList_descriptor;
    }

    @java.lang.Override
    public com.troila.im.gen.MessageList getDefaultInstanceForType() {
      return com.troila.im.gen.MessageList.getDefaultInstance();
    }

    @java.lang.Override
    public com.troila.im.gen.MessageList build() {
      com.troila.im.gen.MessageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.troila.im.gen.MessageList buildPartial() {
      com.troila.im.gen.MessageList result = new com.troila.im.gen.MessageList(this);
      int from_bitField0_ = bitField0_;
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          content_ = java.util.Collections.unmodifiableList(content_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.content_ = content_;
      } else {
        result.content_ = contentBuilder_.build();
      }
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
      if (other instanceof com.troila.im.gen.MessageList) {
        return mergeFrom((com.troila.im.gen.MessageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.troila.im.gen.MessageList other) {
      if (other == com.troila.im.gen.MessageList.getDefaultInstance()) return this;
      if (contentBuilder_ == null) {
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
        }
      } else {
        if (!other.content_.isEmpty()) {
          if (contentBuilder_.isEmpty()) {
            contentBuilder_.dispose();
            contentBuilder_ = null;
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContentFieldBuilder() : null;
          } else {
            contentBuilder_.addAllMessages(other.content_);
          }
        }
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
      com.troila.im.gen.MessageList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.troila.im.gen.MessageList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.troila.im.gen.Message> content_ =
      java.util.Collections.emptyList();
    private void ensureContentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        content_ = new java.util.ArrayList<com.troila.im.gen.Message>(content_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.troila.im.gen.Message, com.troila.im.gen.Message.Builder, com.troila.im.gen.MessageOrBuilder> contentBuilder_;

    /**
     * <code>repeated .Message content = 1;</code>
     */
    public java.util.List<com.troila.im.gen.Message> getContentList() {
      if (contentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(content_);
      } else {
        return contentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public int getContentCount() {
      if (contentBuilder_ == null) {
        return content_.size();
      } else {
        return contentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public com.troila.im.gen.Message getContent(int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);
      } else {
        return contentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder setContent(
        int index, com.troila.im.gen.Message value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
      } else {
        contentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder setContent(
        int index, com.troila.im.gen.Message.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder addContent(com.troila.im.gen.Message value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(value);
        onChanged();
      } else {
        contentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder addContent(
        int index, com.troila.im.gen.Message value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentIsMutable();
        content_.add(index, value);
        onChanged();
      } else {
        contentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder addContent(
        com.troila.im.gen.Message.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder addContent(
        int index, com.troila.im.gen.Message.Builder builderForValue) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder addAllContent(
        java.lang.Iterable<? extends com.troila.im.gen.Message> values) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
      } else {
        contentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder clearContent() {
      if (contentBuilder_ == null) {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public Builder removeContent(int index) {
      if (contentBuilder_ == null) {
        ensureContentIsMutable();
        content_.remove(index);
        onChanged();
      } else {
        contentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public com.troila.im.gen.Message.Builder getContentBuilder(
        int index) {
      return getContentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public com.troila.im.gen.MessageOrBuilder getContentOrBuilder(
        int index) {
      if (contentBuilder_ == null) {
        return content_.get(index);  } else {
        return contentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public java.util.List<? extends com.troila.im.gen.MessageOrBuilder> 
         getContentOrBuilderList() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(content_);
      }
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public com.troila.im.gen.Message.Builder addContentBuilder() {
      return getContentFieldBuilder().addBuilder(
          com.troila.im.gen.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public com.troila.im.gen.Message.Builder addContentBuilder(
        int index) {
      return getContentFieldBuilder().addBuilder(
          index, com.troila.im.gen.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .Message content = 1;</code>
     */
    public java.util.List<com.troila.im.gen.Message.Builder> 
         getContentBuilderList() {
      return getContentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.troila.im.gen.Message, com.troila.im.gen.Message.Builder, com.troila.im.gen.MessageOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.troila.im.gen.Message, com.troila.im.gen.Message.Builder, com.troila.im.gen.MessageOrBuilder>(
                content_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:MessageList)
  }

  // @@protoc_insertion_point(class_scope:MessageList)
  private static final com.troila.im.gen.MessageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.troila.im.gen.MessageList();
  }

  public static com.troila.im.gen.MessageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageList>
      PARSER = new com.google.protobuf.AbstractParser<MessageList>() {
    @java.lang.Override
    public MessageList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.troila.im.gen.MessageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
