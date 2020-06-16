package com.zl.im.lib.net;

import java.util.Map;

import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;

public class NetUtils {
    private static <T extends AbstractStub<T>> T attachHeaders(T stub, final Map<String, String> headerMap) {
        Metadata extraHeaders = new Metadata();
        if (headerMap != null) {
            for (String key : headerMap.keySet()) {
                Metadata.Key<String> customHeadKey = Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER);
                extraHeaders.put(customHeadKey, headerMap.get(key));
            }
        }
        return MetadataUtils.attachHeaders(stub, extraHeaders);
    }

}
