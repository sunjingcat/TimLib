package com.zl.im;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zl.im.lib.core.Conversion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int connected = Conversion.ConnectionStatusType.connected;

    }


}
