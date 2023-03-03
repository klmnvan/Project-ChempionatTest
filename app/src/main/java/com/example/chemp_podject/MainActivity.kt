package com.example.chemp_podject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chemp_podject.databinding.ActivityMainBinding
import com.example.chemp_podject.databinding.ActivityOnBoard1Binding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
       startActivity(Intent(this@MainActivity,on_board1::class.java))
    }
}