package com.example.chemp_podject

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.chemp_podject.api.*
import com.example.chemp_podject.databinding.ActivityHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class Home : AppCompatActivity() {
    private var binding: ActivityHomeBinding? = null
    private val adapterNews = AdapterNews()
    private  val adapterBlock = AdapterBlock()
    private val adapterCategory = AdapterCategory()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        getData()
    }
    private fun init(data: List<NewsModel>) {
        with(binding!!) {
            listNews.layoutManager = GridLayoutManager(this@Home,data.size)
            listNews.adapter = adapterNews

            val listCharacter: List<NewsModel> = data
            if (listCharacter.isNotEmpty()) {
                for (element in listCharacter) {
                    adapterNews.addNews(element)
                }
            }
        }
    }
    private fun initLBlock(block: List<BlockModel>) {
        with(binding!!) {
            listBlock.layoutManager = GridLayoutManager(this@Home,1)
            listBlock.adapter = adapterBlock

            val listBlock: List<BlockModel> = block
            if(listBlock.isNotEmpty()){
                for (element in listBlock){
                    adapterBlock.addBlock(element)
                }
            }
        }
    }
    private fun initLCategory(category: List<BlockModel>) {
        with(binding!!) {
            listCategory.layoutManager = GridLayoutManager(this@Home,category.size)
            listCategory.adapter = adapterCategory

            val listCategory: List<BlockModel> = category
            if(listCategory.isNotEmpty()){
                for (element in listCategory){
                    adapterCategory.addCategogory(element)
                }
            }
        }
    }
    private fun getData() {
        val api = Retrofit.Builder()
            .baseUrl("https://medic.madskill.ru")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiRequest::class.java)
        val apiBlock = Retrofit.Builder()
            .baseUrl("https://medic.madskill.ru")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiRequestBlock::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = api.getNews().awaitResponse()
                val response2 = apiBlock.getBlock().awaitResponse()
                if (response.isSuccessful) {
                    val data = response.body()!!
                    runOnUiThread { init(data) }
                    Log.d(TAG, data.toString())
                }
                if (response2.isSuccessful) {
                    val data = response2.body()!!
                    runOnUiThread { initLBlock(data) }
                    runOnUiThread { initLCategory(data) }
                    Log.d(TAG, data.toString())
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Log.d(TAG, e.toString())
                }
            }
        }
    }
}