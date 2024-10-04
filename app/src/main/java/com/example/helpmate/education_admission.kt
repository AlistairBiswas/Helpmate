package com.example.helpmate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class education_admission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education_admission)

        val uabtn = findViewById<Button>(R.id.uniad)

        uabtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, education_admission_university::class.java)
            startActivity(intent)
        })
    }
}