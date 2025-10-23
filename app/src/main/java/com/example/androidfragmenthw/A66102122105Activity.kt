package com.example.androidfragmenthw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class A66102122105Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_66102122105)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment105())
                .commit()
        }
    }
}
