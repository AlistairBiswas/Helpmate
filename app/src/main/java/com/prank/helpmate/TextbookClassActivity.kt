package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class TextbookClassActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Text Book"
        setContentView(R.layout.activity_textbook_class)

        var listView = findViewById<ListView>(R.id.viewclsb)
        var list = mutableListOf<Model>()

        list.add(Model("Class 1", "", R.drawable.blank))
        list.add(Model("Class 2", "", R.drawable.blank))
        list.add(Model("Class 3", "", R.drawable.blank))
        list.add(Model("Class 4", "", R.drawable.blank))
        list.add(Model("Class 5", "", R.drawable.blank))
        list.add(Model("Class 6", "", R.drawable.blank))
        list.add(Model("Class 7", "", R.drawable.blank))
        list.add(Model("Class 8", "", R.drawable.blank))
        list.add(Model("Class 9", "", R.drawable.blank))
        list.add(Model("Class 10", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("textbookB")
                database.child("class1").get().addOnSuccessListener {
                    val msg = it.child("class1").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("textbookB")
                database.child("class2").get().addOnSuccessListener {
                    val msg = it.child("class2").value.toString()

                    val intent = Intent(this, Browser::class.java).also {
                        it.putExtra("message", msg)
                        startActivity(it)
                    }
                }
            }
        }
    }
}