package com.example.androidfragmenthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {   // ชื่อคลาสเป็น ProfileFragment ก็ได้
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 👇 เปลี่ยนบรรทัดนี้ให้ตรงชื่อไฟล์ layout
        return inflater.inflate(R.layout.fragment_profile108, container, false)
    }
}
