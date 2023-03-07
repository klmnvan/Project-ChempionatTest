package com.example.chemp_podject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.annotation.Nullable
import androidx.core.widget.addTextChangedListener
import com.example.chemp_podject.databinding.ActivityInputAndRegisterBinding
import com.example.chemp_podject.databinding.ActivityOnBoard1Binding

class Input_and_register : AppCompatActivity() {
    private var binding: ActivityInputAndRegisterBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_and_register)
        binding = ActivityInputAndRegisterBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        TextChanged()
        init()
    }
    fun init()
    {
        binding!!.buttonDalee.setOnClickListener()
        {
            if(binding!!.inputEmailtext.text.isNotEmpty())
            {
                startActivity(Intent(this@Input_and_register,CodFromEmail::class.java))
            }
        }

    }

    fun TextChanged()
    {
        binding!!.inputEmailtext.addTextChangedListener(object :TextWatcher{
            @SuppressLint("UseCompatLoadingForDrawables")
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int)
            {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {

                if (binding!!.inputEmailtext.text.isNotEmpty())
                {
                    binding!!.buttonDalee.background = this@Input_and_register.getDrawable(R.drawable.shape_button2)
                }
                else
                {
                    binding!!.buttonDalee.background = this@Input_and_register.getDrawable(R.drawable.shape_button)
                }
            }
        })

    }
}