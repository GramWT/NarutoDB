package com.example.narutodb

import retrofit2.Response

class NarutoRepository() {

    suspend fun getCharacter(page:Int):Response<NarutoModel>{
        return RetrofitInstance.api.getCharacter(page)
    }

    suspend fun getCharacterDetails(id:Int):Response<CharacterDetailsModel>{
        return RetrofitInstance.api.getCharacterDetails(id)
    }
}