package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class PopupError : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_error)

        val stringExtra = intent.extras!!.getString("extraData")
        if(stringExtra != null){
            Log.i("ExtraDataFromIntent", stringExtra)
            Toast.makeText(this, "WARNING ERROR $stringExtra", Toast.LENGTH_SHORT)

        }
    }
}