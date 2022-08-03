package com.example.messager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent  = getIntent()
        var messageText = intent.getStringExtra(EXTRA_MESSAGE)
        var editText = findViewById<TextView>(R.id.message)
        editText.setText(messageText)
    }
}