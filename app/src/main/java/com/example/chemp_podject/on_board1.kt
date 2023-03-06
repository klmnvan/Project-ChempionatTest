package com.example.chemp_podject

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import com.example.chemp_podject.databinding.ActivityInputAndRegisterBinding
import com.example.chemp_podject.databinding.ActivityOnBoard1Binding

class on_board1 : AppCompatActivity() {

    private var binding: ActivityOnBoard1Binding? = null
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoard1Binding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.pointFirst.setOnClickListener()
        {
            binding!!.textView2.text = "Анализы"
            binding!!.textView3.text = "Экспресс сбор и получение проб"
            binding!!.pointFirst.background = this.getDrawable(R.drawable.shape_circle_blue)
            binding!!.pointSecond.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.pointThird.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.picture.setImageDrawable(this.getDrawable(R.drawable.icon_analizi))
            binding!!.textTopscreen.text = "Пропустить"
        }
        binding!!.pointSecond.setOnClickListener()
        {
            binding!!.textView2.text = "Уведомления"
            binding!!.textView3.text = "Вы быстро узнаете о результатах"
            binding!!.pointFirst.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.pointSecond.background = this.getDrawable(R.drawable.shape_circle_blue)
            binding!!.pointThird.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.picture.setImageDrawable(this.getDrawable(R.drawable.icon_yved))
            binding!!.textTopscreen.text = "Пропустить"
        }
        binding!!.pointThird.setOnClickListener()
        {
            binding!!.textView2.text = "Мониторинг"
            binding!!.textView3.text = "Наши врачи всегда наблюдают \nза вашими показателями здоровья"
            binding!!.pointFirst.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.pointSecond.background = this.getDrawable(R.drawable.shape_circle)
            binding!!.pointThird.background = this.getDrawable(R.drawable.shape_circle_blue)
            binding!!.picture.setImageDrawable(this.getDrawable(R.drawable.icon_monitor))
            binding!!.textTopscreen.text = "Завершить"
        }
        binding!!.textTopscreen.setOnClickListener()
        {
            val textTopscreen = Intent(this@on_board1, Input_and_register::class.java)
            startActivity(textTopscreen)
        }
    }
}