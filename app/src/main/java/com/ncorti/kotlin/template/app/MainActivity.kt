package com.ncorti.kotlin.template.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.kotlin.template.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "AnKush AI"

        binding.chatButton.setOnClickListener {
            // Chat Screen
        }

        binding.imageButton.setOnClickListener {
            // Image Generator
        }

        binding.voiceButton.setOnClickListener {
            // Voice Assistant
        }

        binding.settingsButton.setOnClickListener {
            // Settings
        }
    }
}