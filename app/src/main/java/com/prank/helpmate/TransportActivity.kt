package com.prank.helpmate

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_browser.*

class TransportActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    private lateinit var database: DatabaseReference
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Transport"
        setContentView(R.layout.activity_transport)

        var listView = findViewById<ListView>(R.id.viewtrnsprt)
        var list = mutableListOf<Model>()

        list.add(Model("Bus", "View Bus service", R.drawable.blank))
        list.add(Model("Train", "View Train service", R.drawable.blank))
        list.add(Model("Plane", "View Plane service", R.drawable.blank))
        list.add(Model("Truck", "View Truck service", R.drawable.blank))
        list.add(Model("Launch", "View Launch service", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("transport")
                database.child("bus").get().addOnSuccessListener {
                    val msg = it.child("bus").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }

            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("transport")
                database.child("train").get().addOnSuccessListener {
                    val msg = it.child("train").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("transport")
                database.child("plane").get().addOnSuccessListener {
                    val msg = it.child("plane").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 3) {
                database = FirebaseDatabase.getInstance().getReference("transport")
                database.child("truck").get().addOnSuccessListener {
                    val msg = it.child("truck").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 4) {
                database = FirebaseDatabase.getInstance().getReference("transport")
                database.child("launch").get().addOnSuccessListener {
                    val msg = it.child("launch").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
                }
            }
        }
    }

