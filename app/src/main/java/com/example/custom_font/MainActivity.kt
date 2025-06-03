package com.example.custom_font

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a", "b"))
        list_item.add(ListViewModel("c", "d"))
        list_item.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListView)

        val listadapter = ListViewAdapter(list_item)

        listview.adapter = listadapter

        val value : String? = "a"

        Log.d("MainActivity",value!!)

        // ? -> null일 수 있음
        // ! -> null이 아님
    }
}