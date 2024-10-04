package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class HealthActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Health"
        setContentView(R.layout.activity_health)

        var listView = findViewById<ListView>(R.id.viewhlth)
        var list = mutableListOf<Model>()

        list.add(Model("Online Appointment", "View appointments online", R.drawable.appointment))
        list.add(Model("Online Medical Shop", "View pharmacies nearby ", R.drawable.pharmacy))
        list.add(Model("Vaccine Registration", "Complete registration for vaccines", R.drawable.vaccine))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                val intent = Intent(this, AppointmentActivity::class.java)
                startActivity(intent)
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("health")
                database.child("medishop").get().addOnSuccessListener {
                    val msg = it.child("medishop").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("health")
                database.child("vaccine").get().addOnSuccessListener {
                    val msg = it.child("vaccine").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
        }
    }
}