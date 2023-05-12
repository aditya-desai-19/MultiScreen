package com.example.tutorial7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrderDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        val customersOrder = intent.getStringExtra(MainActivity.KEY)

        val orderList = findViewById<TextView>(R.id.ordersTV)

        orderList.text = "Orders placed are: " + customersOrder.toString()
    }
}