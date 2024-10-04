package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        findViewById<CardView>(R.id.logoeducation).also {

            it.setOnClickListener {

                val intent = Intent(this, EducationActivity::class.java)
                startActivity(intent)
            }
        }

        findViewById<CardView>(R.id.logohealth).also {

            it.setOnClickListener {

                val intent = Intent(this, HealthActivity::class.java)
                startActivity(intent)
            }
        }

        findViewById<CardView>(R.id.logojob).also {

            it.setOnClickListener {

                val intent = Intent(this, JobActivity::class.java)
                startActivity(intent)
            }
        }

        findViewById<CardView>(R.id.logotransport).also {

            it.setOnClickListener {

                val intent = Intent(this, TransportActivity::class.java)
                startActivity(intent)
            }
        }

        findViewById<CardView>(R.id.logoemergency).also {

            it.setOnClickListener {

                val intent = Intent(this, EmergencyActivity::class.java)
                startActivity(intent)
            }
        }

        findViewById<CardView>(R.id.logobrowser).also {

            it.setOnClickListener {

                val msg = "https://www.google.com"
                val intent = Intent(this,Browser::class.java).also {
                    it.putExtra("message",msg)
                    startActivity(it)
                }
            }
        }

    }
}