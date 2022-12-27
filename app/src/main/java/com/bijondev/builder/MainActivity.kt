package com.bijondev.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodOrder = FoodOrder.Builder()
            .bread("white bread")
            .meat("bacon")
            .condiments("olive oil")
            .build()

    }
}