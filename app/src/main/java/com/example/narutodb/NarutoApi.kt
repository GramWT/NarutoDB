package com.example.narutodb

import retrofit2.Response
import retrofit2.http.GET

interface NarutoApi {
    @GET("character")
    suspend fun getCharacter():Response<NarutoModel>
}