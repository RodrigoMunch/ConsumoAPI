package com.example.consumoapi

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {

    private const val BASE_URL = "https://alexwohlbruck.github.io/cat-facts/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .build()


    val service = retrofit.create(FactServicie::class.java)
}