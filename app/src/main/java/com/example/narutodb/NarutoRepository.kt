package com.example.narutodb

import retrofit2.Response

class NarutoRepository() {

    suspend fun getCharacter():Response<NarutoModel>{
        return RetrofitInstance.api.getCharacter()
    }
}