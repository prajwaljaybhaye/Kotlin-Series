package com.codewithandro.kotlinseries

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val submitOrderBtn=findViewById<Button>(R.id.submitOrderBtn);
        submitOrderFunction(submitOrderBtn);//calling submitOrderBtn function

    }

    private fun submitOrderFunction(submitOrderBtn: Button?) {
//toast
        submitOrderBtn?.setOnClickListener{
            Toast.makeText(applicationContext,"Submit Order Sucessfully",
                Toast.LENGTH_LONG).show()

        }
    }


}