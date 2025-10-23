package com.example.androidfragmenthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment112 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile112, container, false)
        val img = view.findViewById<ImageView>(R.id.profileImage)
        val tv = view.findViewById<TextView>(R.id.nameTextView)
        tv.text = "siwakhon"
        img.setImageResource(R.drawable.img_66102122112)
        return view
    }
}
