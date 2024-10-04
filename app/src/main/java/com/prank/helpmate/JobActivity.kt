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

class JobActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Job"
        setContentView(R.layout.activity_job)

        var listView = findViewById<ListView>(R.id.viewjob)
        var list = mutableListOf<Model>()

        list.add(Model("Government", "View circulars and application in Government jobs", R.drawable.blank))
        list.add(Model("Private", "View circulars and application in Private jobs", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("job")
                database.child("govt").get().addOnSuccessListener {
                    val msg = it.child("govt").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("job")
                database.child("private").get().addOnSuccessListener {
                    val msg = it.child("private").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
        }
    }
}