package com.example.good_word

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.good_word.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindins : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindins = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bindins.showAllSentence.setOnClickListener {
            val intent = Intent(this,SentenceMainActivity::class.java)
            startActivity(intent)
        }
    }
}