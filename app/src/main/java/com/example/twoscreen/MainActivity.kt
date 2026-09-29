package com.example.twoscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoscreen.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSuaHoSo.setOnClickListener {
            val sv = Student("123456", "Trần Thanh Tài", 3.8)
            val intent = Intent(this, EditProfileActivity::class.java)
            intent.putExtra("DULIEU_SV", sv)
            startActivity(intent)
        }
    }
}