package com.diana.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var emergenteBoton: Button
    private lateinit var details: Button
    private lateinit var restaurant: TextView
    private lateinit var direction: TextView
    private lateinit var serviceHours: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emergenteBoton= findViewById(R.id.firstButton)
        details=findViewById(R.id.secButton)

        initListeners()
    }

    private fun initListeners() {
        emergenteBoton.setOnClickListener {
            Toast.makeText(applicationContext, "Diana Fernández", Toast.LENGTH_LONG).show()
        }

        details.setOnClickListener{
            val Restaurant= restaurant.text.toString()
            val Direction= direction.text.toString()
            val ServiceHours= serviceHours.text.toString()

            val data= Info(Restaurant, Direction, ServiceHours)

            val intento= Intent(this, activity_main2)
        }
    }
}