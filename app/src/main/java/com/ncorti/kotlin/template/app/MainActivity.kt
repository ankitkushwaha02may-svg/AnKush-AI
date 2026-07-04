package com.ncorti.kotlin.template.app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.kotlin.template.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "AnKush AI"

        // AI Chat
        binding.chatButton.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }

        // AI Image Generator
        binding.imageButton.setOnClickListener {
            Toast.makeText(this, "Image Generator Coming Soon", Toast.LENGTH_SHORT).show()
        }

        // Voice Assistant
        binding.voiceButton.setOnClickListener {
            Toast.makeText(this, "Voice Assistant Coming Soon", Toast.LENGTH_SHORT).show()
        }

        // Settings
        binding.settingsButton.setOnClickListener {
            Toast.makeText(this, "Settings Coming Soon", Toast.LENGTH_SHORT).show()
        }
    }
}