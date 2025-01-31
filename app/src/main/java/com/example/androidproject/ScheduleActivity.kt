package com.example.androidproject

import android.os.Bundle

class ScheduleActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPageTitle("Plan zajęć")
        supportActionBar?.hide()
    }
}
