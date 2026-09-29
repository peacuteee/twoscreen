package com.example.twoscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.twoscreen.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mở gói dữ liệu lấy đối tượng Student
        val sv = intent.getSerializableExtra("DULIEU_SV") as? Student

        // Hiển thị lên màn hình
        if (sv != null) {
            binding.tvThongTin.text = "MSSV: ${sv.id}\nHọ tên: ${sv.name}\nĐiểm: ${sv.gpa}"
        } else {
            binding.tvThongTin.text = "Không nhận được dữ liệu!"
        }
    }
}