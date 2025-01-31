package com.example.androidproject

import android.os.Bundle

class EventsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPageTitle("Wydarzenia")
        supportActionBar?.hide()
    }
}
