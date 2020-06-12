package com.zl.im

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zl.im.lib.core.Conversion
import com.zl.im.lib.utils.LogUtils
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btn_init.setOnClickListener(View.OnClickListener {
            LogUtils.v(""+Conversion.ConnectionStatusType.connected)
        })
    }
}
