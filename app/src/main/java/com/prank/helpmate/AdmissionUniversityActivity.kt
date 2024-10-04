package com.prank.helpmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AdmissionUniversityActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "University Admission"
        setContentView(R.layout.activity_admission_university)

        var listView = findViewById<ListView>(R.id.viewuni)
        var list = mutableListOf<Model>()

        list.add(Model("Bangladesh University of Engineering and Technology", "", R.drawable.blank))
        list.add(Model("Medical Colleges", "", R.drawable.blank))
        list.add(Model("Dhaka University", "", R.drawable.blank))
        list.add(Model("General, Science and Technology (Combined)", "", R.drawable.blank))
        list.add(Model("Jahangirnagar University", "", R.drawable.blank))
        list.add(Model("Bangladesh University of Textiles", "", R.drawable.blank))
        list.add(Model("Engineering Universities (Combined)", "", R.drawable.blank))
        list.add(Model("Agriculture (Combined)", "", R.drawable.blank))
        list.add(Model("Bangladesh University of Professionals", "", R.drawable.blank))
        list.add(Model("Ahsanullah University of Science and Technology", "", R.drawable.blank))
        list.add(Model("BRAC University", "", R.drawable.blank))
        list.add(Model("North South University", "", R.drawable.blank))

        listView.adapter = CustomAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("buet").get().addOnSuccessListener {
                    val msg = it.child("buet").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 1) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("medical").get().addOnSuccessListener {
                    val msg = it.child("medical").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 2) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("du").get().addOnSuccessListener {
                    val msg = it.child("du").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 3) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("gst").get().addOnSuccessListener {
                    val msg = it.child("gst").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }
            }
            else if (position == 4) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("ju").get().addOnSuccessListener {
                    val msg = it.child("ju").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

                }
            else if (position == 5) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("butex").get().addOnSuccessListener {
                    val msg = it.child("butex").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 6) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("engc").get().addOnSuccessListener {
                    val msg = it.child("engc").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 7) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("agri").get().addOnSuccessListener {
                    val msg = it.child("agri").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 8) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("bup").get().addOnSuccessListener {
                    val msg = it.child("bup").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 9) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("aust").get().addOnSuccessListener {
                    val msg = it.child("aust").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 10) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("brac").get().addOnSuccessListener {
                    val msg = it.child("brac").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            else if (position == 11) {
                database = FirebaseDatabase.getInstance().getReference("university")
                database.child("nsu").get().addOnSuccessListener {
                    val msg = it.child("nsu").value.toString()

                    val intent = Intent(this,Browser::class.java).also {
                        it.putExtra("message",msg)
                        startActivity(it)
                    }
                }

            }
            }
        }
    }