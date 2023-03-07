package com.example.chemp_podject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CodFromEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cod_from_email)
        val intent = Intent(this@CodFromEmail, CreatePassword::class.java)
        startActivity(intent)
    }
}