package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class TextbookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Text Book"
        setContentView(R.layout.activity_textbook)

        var listView = findViewById<ListView>(R.id.viewtextbook)
        var list = mutableListOf<Model>()

        list.add(Model("Bengali Version", "", R.drawable.blank))
        list.add(Model("English Version", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                val intent = Intent(this, TextbookClassActivity::class.java)
                startActivity(intent)
            }
            else if (position == 1) {
                //val intent = Intent(this, TextbookClassActivity::class.java)
                //startActivity(intent)
            }
        }
    }
}