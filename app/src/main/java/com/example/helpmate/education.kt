package com.example.helpmate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class education : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val tbbtn = findViewById<Button>(R.id.appointment)

        tbbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, education_textbook::class.java)
            startActivity(intent)
        })

        val resbtn = findViewById<Button>(R.id.uniad)

        resbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, education_result::class.java)
            startActivity(intent)
        })

        val addbtn = findViewById<Button>(R.id.admission)

        addbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, education_admission::class.java)
            startActivity(intent)
        })
    }
}