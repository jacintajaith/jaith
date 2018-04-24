package com.example.jacintajaith.kotapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

//this class is to show the difference between kotlin and java
class Main2Activity : Activity() {
//the declaration of a function is with a keyword "fun" as compared to java and we use ":"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        back.setOnClickListener {
//to reference an activity we use "::"
            val ti = Intent(this, Welcome::class.java)
            startActivity(ti)

            // notification when loading home page
            Toast.makeText(this@Main2Activity, "Going back to first page.", Toast.LENGTH_SHORT).show()
        }

    }

}
