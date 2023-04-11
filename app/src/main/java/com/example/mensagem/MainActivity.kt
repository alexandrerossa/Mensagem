package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonEnviar)
        button.setOnClickListener { enviaMensagem() }
    }

    private fun enviaMensagem() {
        Toast.makeText(this,"enviar mensagem", Toast.LENGTH_SHORT).show()

    }
}