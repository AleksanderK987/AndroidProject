package com.example.androidproject

import android.os.Bundle

class IndexActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPageTitle("Indeks")
        supportActionBar?.hide()
    }
}
