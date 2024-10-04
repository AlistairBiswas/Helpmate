package com.prank.helpmate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class EmergencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Emergency"
        setContentView(R.layout.activity_emergency)

        var listView = findViewById<ListView>(R.id.viewemergency)
        var list = mutableListOf<Model>()

        list.add(Model("Police", "View Police service", R.drawable.blank))
        list.add(Model("Ambulance", "View Ambulance service", R.drawable.blank))
        list.add(Model("Fire Service", "View Fire service", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                //Toast.makeText(this@EmergencyActivity, "you clicked on Police", Toast.LENGTH_LONG).show()
                val number = "999"
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:"+"$number")
                startActivity(dialIntent)
            }
            else if (position == 1) {
                //Toast.makeText(this@EmergencyActivity, "you clicked on Ambulance", Toast.LENGTH_LONG).show()
                val number = "9123073"
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:"+"$number")
                startActivity(dialIntent)
            }
            else if (position == 2) {
                //Toast.makeText(this@EmergencyActivity, "you clicked on Fire Service", Toast.LENGTH_LONG).show()
                val number = "16163"
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:"+"$number")
                startActivity(dialIntent)
            }
        }
    }
}