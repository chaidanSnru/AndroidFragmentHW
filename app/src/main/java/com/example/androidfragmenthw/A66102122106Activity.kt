package com.example.androidfragmenthw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class A66102122106Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_66102122106)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment106())
                .commit()
        }
    }
}
