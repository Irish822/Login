package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username_et=  findViewById<EditText>(R.id.username_et)
        val password_et= findViewById<EditText>(R.id.password_et)
        val login_btn= findViewById<Button>(R.id.login_btn)

     login_btn.setOnClickListener {
     val status=if(username_et.text.toString().equals("12345")
         &&password_et.text.toString().equals("Password")) "Logged In Successfully" else "Fail LogIn"
         Toast.makeText(this,status,Toast.LENGTH_SHORT)
         val intent = Intent(this, NewActivity::class.java)
         startActivity(intent)
    }


}

    }
