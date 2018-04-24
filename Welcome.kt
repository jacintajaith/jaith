package com.example.jacintajaith.kotapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_welcome.*

class Welcome : AppCompatActivity() {
    private var button: Button? = null
    private var ps: EditText? =null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_welcome)

 /* get reference to button
     findViewById(R.id.btn_click_me) as Button\*/
            val btn_click_me = findViewById<Button>(R.id.btn_on_click)
           // Button button=(Button)FindViewById(R.id.btn_on_click);
            // set on-click listener
            btn_click_me.setOnClickListener {
                val jj = findViewById<EditText>(R.id.input)
                val input = jj.getText().toString().trim()
                if (!TextUtils.isEmpty(input)) {
                    val j = Intent(this, Main2Activity::class.java)
                    j.putExtra("msg", input)
                    j.putExtra("two", "Am not fine")
                    startActivity(j)

                }else{
                    Toast.makeText(this@Welcome, "please enter your username", Toast.LENGTH_SHORT).show()

                }
                val ps=findViewById<EditText>(R.id.input)
                val ino= ps.getText().toString().trim()
                if(!TextUtils.isEmpty(input)){
                    val t=Intent(this,Main2Activity::class.java)
                    t.putExtra("",input)
                    startActivity(t)
                }else{
                    Toast.makeText(this@Welcome, "please enter your password", Toast.LENGTH_SHORT).show()

                }

                }

            }

        }

