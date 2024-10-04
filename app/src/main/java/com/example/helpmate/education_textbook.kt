package com.example.helpmate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class education_textbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education_textbook)

        val bvbtn = findViewById<Button>(R.id.appointment)

        bvbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, eduducation_textbook_class::class.java)
            startActivity(intent)
        })

        val evbtn = findViewById<Button>(R.id.uniad)

        evbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, eduducation_textbook_class::class.java)
            startActivity(intent)
        })

    }
}