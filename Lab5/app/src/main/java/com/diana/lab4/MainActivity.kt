package com.diana.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var emergenteBoton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emergenteBoton= findViewById(R.id.firstButton)
        initListeners()
    }

    private fun initListeners() {
        emergenteBoton.setOnClickListener {
            Toast.makeText(applicationContext, "Diana Fernández", Toast.LENGTH_LONG).show()
        }
    }
}