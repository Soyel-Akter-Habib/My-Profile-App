package com.example.myprofileca225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var name=findViewById<EditText>(R.id.name)
        var dob=findViewById<EditText>(R.id.dob)
        var cgpa=findViewById<EditText>(R.id.cgpa)
        var spl=findViewById<EditText>(R.id.spl)
        val btn=findViewById<Button>(R.id.btn)


        btn.setOnClickListener {
              val intent = Intent(this,Home::class.java)
//            intent.putExtra("name",name.toString())
//            intent.putExtra("dob",dob.toString())
//            intent.putExtra("cgpa",cgpa.toString())
//            intent.putExtra("spl",spl.toString())

            startActivity(intent)

        }
    }
}