package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityLoginBinding
import com.example.meusemestre.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.button_log_login -> startActivity(Intent(this, PlanoActivity::class.java))
                R.id.button_log_cadastrar -> startActivity(Intent(this, MainActivity::class.java))
                R.id.button_log_plano -> startActivity(Intent(this, PlanoActivity::class.java))
            }
        }

        binding.buttonLogLogin.setOnClickListener(clickListener)
        binding.buttonLogCadastrar.setOnClickListener(clickListener)
        binding.buttonLogPlano.setOnClickListener(clickListener)
    }}


