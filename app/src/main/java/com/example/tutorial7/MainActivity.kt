package com.example.tutorial7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //creating key
    companion object {
        const val KEY = "com.example.tutorial7.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orderbtn = findViewById<Button>(R.id.order)
        orderbtn.setOnClickListener {
            val starter = findViewById<EditText>(R.id.starter).text.toString()
            val mainCourse = findViewById<EditText>(R.id.mainCourse).text.toString()
            val desert = findViewById<EditText>(R.id.desert).text.toString()
            val orders = starter + " " + mainCourse + " " + desert
            val intent = Intent(applicationContext, OrderDetails::class.java)
            intent.putExtra(KEY, orders)
            startActivity(intent)
        }
    }
}