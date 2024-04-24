package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contact_list.databinding.ActivityContactTypeBinding

class ContactTypeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.schoolButton.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}