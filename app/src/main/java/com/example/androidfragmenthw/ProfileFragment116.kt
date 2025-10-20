package com.example.androidfragmenthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

/**
 * Fragment ของฟู: แสดงรูปตัวเอง + ชื่อภาษาไทย
 * layout: fragment_profile116.xml
 */
class ProfileFragment116 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile116, container, false)

        val img = view.findViewById<ImageView>(R.id.profileImage)
        val tv = view.findViewById<TextView>(R.id.nameTextView)

        tv.text = "นายนิธิภัทร์ จันทร์รอด"
        // ใส่ชื่อไฟล์รูปของฟูใน drawable เป็นตัวเล็ก + _ เท่านั้น เช่น img_66102122116.jpg
        img.setImageResource(R.drawable.img_66102122116)

        return view
    }
}
