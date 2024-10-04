package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AppointmentActivity : AppCompatActivity() {
    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Online Appointment"
        setContentView(R.layout.activity_appointment)

        var listView = findViewById<ListView>(R.id.viewappoint)
        var list = mutableListOf<Model>()

        list.add(Model("Square Hospital", "", R.drawable.blank))
        list.add(Model("Lab Aid Hospital", "", R.drawable.blank))
        list.add(Model("Birdem Hospital", "", R.drawable.blank))
        list.add(Model("United Hospital", "", R.drawable.blank))
        list.add(Model("Apollo Hospital", "", R.drawable.blank))
        list.add(Model("Ibn Sina Hospital", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("square").get().addOnSuccessListener {
                    val msg = it.child("square").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("labaid").get().addOnSuccessListener {
                    val msg = it.child("labaid").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("birdem").get().addOnSuccessListener {
                    val msg = it.child("birdem").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 3) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("united").get().addOnSuccessListener {
                    val msg = it.child("united").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 4) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("apollo").get().addOnSuccessListener {
                    val msg = it.child("apollo").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 5) {
                database = FirebaseDatabase.getInstance().getReference("appointment")
                database.child("ibnsina").get().addOnSuccessListener {
                    val msg = it.child("ibnsina").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }

        }

    }
}