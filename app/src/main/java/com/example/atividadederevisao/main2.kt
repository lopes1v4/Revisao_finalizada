package com.example.atividadederevisao

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.atividadederevisao.databinding.ActivityMain2Binding
import com.example.atividadederevisao.databinding.ActivityMainBinding

class main2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain2Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val loginUsuario = intent.getStringExtra("LOGIN_USUARIO") ?: "Desconhecido"
        binding.txtUsuario.text = "Bem-vindo, $loginUsuario"
    }
}