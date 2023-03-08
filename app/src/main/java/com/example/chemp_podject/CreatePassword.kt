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
        init()
    }
    private fun init()
    {
        if(index in 0..3) {
            with(binding!!)
            {
                buttonCircle1.setOnClickListener() {
                    password += buttonCircle1.text
                    index++
                    SetPassword(index)
                }
                buttonCircle2.setOnClickListener() {
                    password += buttonCircle2.text
                    index++
                    SetPassword(index)
                }
                buttonCircle3.setOnClickListener() {
                    password += buttonCircle3.text
                    index++
                    SetPassword(index)
                }
                buttonCircle4.setOnClickListener() {
                    password += buttonCircle4.text
                    index++
                    SetPassword(index)
                }
                buttonCircle5.setOnClickListener() {
                    password += buttonCircle5.text
                    index++
                    SetPassword(index)
                }
                buttonCircle6.setOnClickListener() {
                    password += buttonCircle6.text
                    index++
                    SetPassword(index)
                }
                buttonCircle7.setOnClickListener() {
                    password += buttonCircle7.text
                    index++
                    SetPassword(index)
                }
                buttonCircle8.setOnClickListener() {
                    password += buttonCircle8.text
                    index++
                    SetPassword(index)
                }
                buttonCircle9.setOnClickListener() {
                    password += buttonCircle9.text
                    index++
                    SetPassword(index)
                }
                buttonCircle0.setOnClickListener() {
                    password += buttonCircle0.text
                    index++
                    SetPassword(index)
                }
            }
        }
        if(index in 1..4) {
            binding!!.buttonClean.setOnClickListener(){
                //password = password.replace() //Как удалить символ из строки???
                //password -= buttonCircle0.text
                password = password?.dropLast(1)
                index--
                SetPassword(index)
            }
        }
    }

    private fun SetPassword(point: Int){
        with(binding!!){
            when(point){
                0 -> {
                    point1.background = getDrawable(R.drawable.point_style_stroke)
                    point2.background = getDrawable(R.drawable.point_style_stroke)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                1 -> {
                    point1.background = getDrawable(R.drawable.point_style_blue)
                    point2.background = getDrawable(R.drawable.point_style_stroke)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                2 -> {
                    point1.background = getDrawable(R.drawable.point_style_blue)
                    point2.background = getDrawable(R.drawable.point_style_blue)
                    point3.background = getDrawable(R.drawable.point_style_stroke)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                3 -> {
                    point1.background = getDrawable(R.drawable.point_style_blue)
                    point2.background = getDrawable(R.drawable.point_style_blue)
                    point3.background = getDrawable(R.drawable.point_style_blue)
                    point4.background = getDrawable(R.drawable.point_style_stroke)
                }
                4 -> {
                    point1.background = getDrawable(R.drawable.point_style_blue)
                    point2.background = getDrawable(R.drawable.point_style_blue)
                    point3.background = getDrawable(R.drawable.point_style_blue)
                    point4.background = getDrawable(R.drawable.point_style_blue)
                }
            }
        }
    }
}

