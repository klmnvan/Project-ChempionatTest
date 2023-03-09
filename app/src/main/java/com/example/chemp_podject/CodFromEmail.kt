package com.example.chemp_podject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.chemp_podject.databinding.ActivityCodFromEmailBinding
import com.example.chemp_podject.databinding.ActivityCreatePasswordBinding

class CodFromEmail : AppCompatActivity() {
    private var binding: ActivityCodFromEmailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodFromEmailBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        /*val intent = Intent(this@CodFromEmail, CreatePassword::class.java)
        startActivity(intent)*/
        TextChanged()
        init()
    }
    fun TextChanged()
    {

        binding!!.inputNumber1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
               if(binding!!.inputNumber1.length()==1)
               {
                   binding!!.inputNumber2.requestFocus()               }
            }
        })
        binding!!.inputNumber2.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(binding!!.inputNumber2.length()==1)
                {
                    binding!!.inputNumber3.requestFocus()               }
            }
        })
        binding!!.inputNumber3.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(binding!!.inputNumber3.length()==1)
                {
                    binding!!.inputNumber4.requestFocus()               }
            }
        })
        binding!!.inputNumber4.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(binding!!.inputNumber4.length()==1)
                {
                    init()           }
            }
        })
    }
    fun init()
    {
        if(binding!!.inputNumber1.text.isNotEmpty() && binding!!.inputNumber2.text.isNotEmpty() && binding!!.inputNumber3.text.isNotEmpty() && binding!!.inputNumber4.text.isNotEmpty()){
            startActivity(Intent(this@CodFromEmail, CreatePassword::class.java))
        }
        binding!!.strelka.setOnClickListener(){
            startActivity(Intent(this@CodFromEmail, Input_and_register::class.java))
        }
    }
}