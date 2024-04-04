package com.example.consumoapi

import retrofit2.Response
import retrofit2.http.GET

interface FactService {

    @GET("/facts/random")
    suspend fun getFact(): Response<Fact>
}