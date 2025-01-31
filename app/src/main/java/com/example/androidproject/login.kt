package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            // Pobieranie wartości z pól tekstowych
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            // Sprawdzanie loginu i hasła
            if (email == "admin" && password == "admin") {
                // Jeśli dane są poprawne, przejdź do Planu zajęć
                val intent = Intent(this, ScheduleActivity::class.java)
                startActivity(intent)
                finish() // Zakończenie LoginActivity, aby nie wrócić do niego po naciśnięciu przycisku "wstecz"
            } else {
                // Jeśli dane są niepoprawne, wyświetl komunikat o błędzie
                Toast.makeText(this, "Błędny login lub hasło", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
