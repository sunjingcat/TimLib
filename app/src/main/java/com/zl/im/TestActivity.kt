package com.zl.im

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zl.im.lib.TimLib
import com.zl.im.lib.core.Conversion
import com.zl.im.lib.utils.LogUtils
import kotlinx.android.synthetic.main.activity_test.*
open class User(val userId : String , val token : String)
class TestActivity : AppCompatActivity() {
    val testAppKey = "10001"
    val uploadMethod = "local"
    val groupId = "group_test3"
    var init = false
    var connected = false
    val users : List<User> = listOf(
            User("test_create_user_1582186182751","cb9a48813dfecd4667da795e404701d1"),
            User("test_create_user_1582186191432","9b59ee8c51c2ae4114823e9cb0ecb986"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btn_init.setOnClickListener(View.OnClickListener {
            TimLib.initWithAppKey(this, testAppKey, uploadMethod, true, "http://172.27.104.2")
            init = true;
        })
        btn_connect.setOnClickListener {
            TimLib.connectWithTokenAndUserId(this,users[0].userId,users[0].token,"")
            connected = true
        }
    }
}
