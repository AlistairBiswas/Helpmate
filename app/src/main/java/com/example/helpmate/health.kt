package com.example.helpmate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class health : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)

        val apbtn = findViewById<Button>(R.id.appointment)

        apbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, health_appointment::class.java)
            startActivity(intent)
        })
    }
}