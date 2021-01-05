package com.dscreva.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var mail_id:EditText
    lateinit var pwd:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.my_button)
        mail_id = findViewById(R.id.my_email)
        pwd = findViewById(R.id.my_password)

        button.setOnClickListener {
            var mail = mail_id.text.toString()
            var pass = pwd.text.toString()
            if(mail.isNotEmpty() and pass.isNotEmpty()){
                if(mail == "dscreva@gmail.com" && pass=="idk"){
                    startActivity(Intent(this@MainActivity, home::class.java))
                }
            }
        }



    }
}