package com.example.androidproject

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.androidproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Konfiguracja Toolbar
        setSupportActionBar(binding.toolbar)

        // Obsługa przycisku otwierającego Drawer
        binding.openDrawerButton.setOnClickListener {
            // Otwórz DrawerLayout po kliknięciu przycisku
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        // Obsługa NavigationView
        setupNavigationView()
    }

    private fun setupNavigationView() {
        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            handleNavigationItemSelected(menuItem)
            binding.drawerLayout.closeDrawer(GravityCompat.START) // Zamknij menu po wyborze
            true
        }
    }

    private fun handleNavigationItemSelected(menuItem: MenuItem) {
        when (menuItem.itemId) {
            R.id.nav_schedule -> {
                // Plan zajęć
            }
            R.id.nav_messages -> {
                // Wiadomości
            }
            R.id.nav_index -> {
                // Indeks
            }
            R.id.nav_events -> {
                // Wydarzenia
            }
        }
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
