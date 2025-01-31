package com.example.androidproject

import android.os.Bundle

class MessagesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPageTitle("Wiadomości")
        supportActionBar?.hide()
    }
}
