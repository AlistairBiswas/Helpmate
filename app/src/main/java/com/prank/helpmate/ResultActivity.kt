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

class ResultActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Result"
        setContentView(R.layout.activity_result)

        var listView = findViewById<ListView>(R.id.viewrslt)
        var list = mutableListOf<Model>()

        list.add(Model("SSC", "", R.drawable.blank))
        list.add(Model("HSC", "", R.drawable.blank))
        list.add(Model("National University", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("result")
                database.child("ssc").get().addOnSuccessListener {
                    val msg = it.child("ssc").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("result")
                database.child("hsc").get().addOnSuccessListener {
                    val msg = it.child("hsc").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("result")
                database.child("nu").get().addOnSuccessListener {
                    val msg = it.child("nu").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
        }
    }
}