package com.example.narutodb

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NarutoApi {
    @GET("character")
    suspend fun getCharacter(@Query("page") page: Int):Response<NarutoModel>

    @GET("character/{id}")
    suspend fun getCharacterDetails(@Path("id") id: Int): Response<CharacterDetailsModel>
}