package com.zl.im.lib.core

import androidx.annotation.IntDef
import androidx.annotation.StringDef
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

class Conversion {
    @StringDef(ConversionType.GROUP, ConversionType.PRIVATE)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConversionType {
        companion object {
            const val GROUP = "CT:group"
            const val PRIVATE = "CT:Private"
        }
    }

    @IntDef(ConnectionStatusType.disconnect, ConnectionStatusType.connecting, ConnectionStatusType.connected)
    @Retention(RetentionPolicy.SOURCE)
    annotation class ConnectionStatusType {
        companion object {
            const val disconnect = 0
            const val connecting = 1
            const val connected = 2
        }
    }


}