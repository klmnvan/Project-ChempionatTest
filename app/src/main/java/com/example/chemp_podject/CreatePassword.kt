package com.example.chemp_podject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chemp_podject.databinding.ActivityCreatePasswordBinding

class CreatePassword : AppCompatActivity() {
    private var password: String? = null
    private var index: Int = 0
    private var binding: ActivityCreatePasswordBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password)
        binding = ActivityCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
    }
    private fun init()
    {
        with(binding!!)
        {
            buttonCircle1.setOnClickListener() {
                password += buttonCircle1.text
                index++
                SetPassword()
            }
            buttonCircle2.setOnClickListener() {
                password += buttonCircle2.text
                index++
            }
            buttonCircle3.setOnClickListener() {
                password += buttonCircle3.text
                index++
            }
            buttonCircle4.setOnClickListener() {
                password += buttonCircle4.text
                index++
            }
            buttonCircle5.setOnClickListener() {
                password += buttonCircle5.text
                index++
            }
            buttonCircle6.setOnClickListener() {
                password += buttonCircle6.text
                index++
            }
            buttonCircle7.setOnClickListener() {
                password += buttonCircle7.text
                index++
            }
            buttonCircle8.setOnClickListener() {
                password += buttonCircle8.text
                index++
            }
            buttonCircle9.setOnClickListener() {
                password += buttonCircle9.text
                index++
            }
            buttonCircle0.setOnClickListener() {
                password += buttonCircle0.text
                index++
            }
            buttonClean.setOnClickListener(){
                //password = password.replace() //Как удалить символ из строки???
                index--
            }
        }
    }

    private fun SetPassword(){
        with(binding!!){
            when(index){
                0 -> {
                    point1.background = getDrawable(R.drawable.point_style_blue)
                    point2.background = getDrawable(R.drawable.point_style_stroke)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                1 -> {
                    point1.background = getDrawable(R.drawable.point_style_stroke)
                    point2.background = getDrawable(R.drawable.point_style_blue)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                3 -> {
                    point1.background = getDrawable(R.drawable.point_style_stroke)
                    point2.background = getDrawable(R.drawable.point_style_stroke)
                    point3.background = getDrawable(R.drawable.point_style_blue)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                4 -> {
                    point1.background = getDrawable(R.drawable.point_style_stroke)
                    point2.background = getDrawable(R.drawable.point_style_stroke)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_blue)
                }
            }
        }
    }
}

