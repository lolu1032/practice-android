package com.example.backbuttonex

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var isDobule = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onBackPressed() {
        Log.d("MainActivity","backbutton")

        if(isDobule == true) {
            finish()
        }

        isDobule = true
        Toast.makeText(this,"종료하실려면 더블 클릭",Toast.LENGTH_LONG).show()

        Handler().postDelayed({
            isDobule = false
        },2000)
    }
}