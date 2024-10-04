package com.example.helpmate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edubtn = findViewById<ImageButton>(R.id.logoeducation)

        edubtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, education::class.java)
            startActivity(intent)
        })

        val hlthbtn = findViewById<ImageButton>(R.id.logohealth)

        hlthbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, health::class.java)
            startActivity(intent)
        })

        val jobbtn = findViewById<ImageButton>(R.id.logojob)

        jobbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, job::class.java)
            startActivity(intent)
        })

        val transbtn = findViewById<ImageButton>(R.id.logotransport)

        transbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, transport::class.java)
            startActivity(intent)
        })

        val emebtn = findViewById<ImageButton>(R.id.logoemergency)

        emebtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, emergency::class.java)
            startActivity(intent)
        })

        val abbtn = findViewById<ImageButton>(R.id.logoabout)

        abbtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, about::class.java)
            startActivity(intent)
        })

    }

}