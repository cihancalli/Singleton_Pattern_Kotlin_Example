package com.zerdasoftware.singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdasoftware.singleton.app.SMSContainer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smsSender = SMSContainer.getSmsSender("545")
        smsSender.sendMessage("545","test message")
    }
}