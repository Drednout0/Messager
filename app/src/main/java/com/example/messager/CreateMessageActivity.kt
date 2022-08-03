package com.example.messager

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText


class CreateMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: View?) {
        var editText = findViewById<EditText>(R.id.message)
        var messageText = editText.getText().toString()
        var intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT, messageText)
        startActivity(intent)

    }
}