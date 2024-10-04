package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Education"
        setContentView(R.layout.activity_education)

        var listView = findViewById<ListView>(R.id.viewedu)
        var list = mutableListOf<Model>()

        list.add(Model("Text Book", "View textbooks of Bengali and English version", R.drawable.textbook))
        list.add(Model("Result", "View results of board examinations", R.drawable.result))
        list.add(Model("Admission", "Circulars and admission procedure in renowned institutions", R.drawable.admission))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                val intent = Intent(this, TextbookActivity::class.java)
                startActivity(intent)
            }
            else if (position == 1) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
            else if (position == 2) {
                val intent = Intent(this, AdmissionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
















