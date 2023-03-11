package com.example.chemp_podject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chemp_podject.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
    }
}