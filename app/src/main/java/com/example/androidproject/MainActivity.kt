package com.example.myapp

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.androidproject.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)

        // Obsługuje kliknięcia w menu
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Przejdź do ekranu Home
                }
                R.id.nav_profile -> {
                    // Przejdź do ekranu Profile
                }
                R.id.nav_settings -> {
                    // Przejdź do ekranu Settings
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)  // Zamknięcie menu po kliknięciu
            true
        }

        // Obsługuje przycisk otwierania menu
        findViewById<View>(R.id.open_drawer_button).setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}
