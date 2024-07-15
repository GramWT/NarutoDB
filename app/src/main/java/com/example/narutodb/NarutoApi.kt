package com.example.narutodb

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NarutoApi {
    @GET("character")
    suspend fun getCharacter():Response<NarutoModel>

    @GET("character/{id}")
    suspend fun getCharacterDetails(@Path("id") id: Int): Response<CharacterDetailsModel>
}