package com.example.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        findViewById<Button>(R.id.btn_fb).setOnClickListener { fb() }
        findViewById<Button>(R.id.btn_insta).setOnClickListener { insta() }
        findViewById<Button>(R.id.btn_gmail).setOnClickListener { gmail() }
        findViewById<Button>(R.id.btn_map).setOnClickListener { map() }
        findViewById<Button>(R.id.btn_yt).setOnClickListener { yt() }
    }

        private fun fb() {
            val uri = Uri.parse("https://facebook.com/")
            val intent1 = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent1)
        }
        private fun insta() {
            val uri = Uri.parse("https://instagram.com/")
            val intent1 = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent1)
        }
        private fun gmail() {
            val uri = Uri.parse("https://gmail.com/")
            val intent1 = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent1)
        }
        private fun map(){
            val intent1 = Intent(this, PopupError::class.java)
        startActivity(intent1)
        }
         private fun yt() {
             val intent1 = Intent(this, PopupError::class.java)
        startActivity(intent1)
    }
    }

