package com.example.narutodb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NarutoViewModel() : ViewModel() {

    private val _allCharacter = MutableLiveData<NarutoModel?>()

    val allCharacter: LiveData<NarutoModel?>
        get() =
            _allCharacter

    private val repository = NarutoRepository()

    fun getCharacter(){
        viewModelScope.launch {
            val resultData = repository.getCharacter()
            if (resultData.isSuccessful)
            _allCharacter.value = resultData.body()
        }
    }
}