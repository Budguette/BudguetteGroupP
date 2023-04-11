package com.example.budguette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home ->
                    // do something here
                    true
                R.id.library ->
                    // do something here
                    true
                R.id.camera ->
                    // do something here
                    true
                R.id.profile ->
                    // do something here
                    true
                else -> true
            }
        }

    }
}