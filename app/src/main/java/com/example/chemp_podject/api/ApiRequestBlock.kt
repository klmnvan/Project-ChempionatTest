package com.example.chemp_podject.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiRequestBlock {
    @GET("/api/catalog")
    fun getBlock(): Call<List<BlockModel>>
}