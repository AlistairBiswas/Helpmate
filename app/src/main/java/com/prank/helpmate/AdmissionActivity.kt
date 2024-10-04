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

class AdmissionActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Admission"
        setContentView(R.layout.activity_admission)

        var listView = findViewById<ListView>(R.id.viewadm)
        var list = mutableListOf<Model>()

        list.add(Model("Notre Dame College Admission", "", R.drawable.blank))
        list.add(Model("Holy Cross College Admission", "", R.drawable.blank))
        list.add(Model("Other College Admission", "", R.drawable.blank))
        list.add(Model("University Admission", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("admission")
                database.child("ndc").get().addOnSuccessListener {
                    val msg = it.child("ndc").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("admission")
                database.child("hcc").get().addOnSuccessListener {
                    val msg = it.child("hcc").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("admission")
                database.child("college").get().addOnSuccessListener {
                    val msg = it.child("college").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 3) {
                val intent = Intent(this, AdmissionUniversityActivity::class.java)
                startActivity(intent)
            }
        }
    }
}