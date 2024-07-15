package com.example.narutodb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NarutoViewModel() : ViewModel() {

    private val _allCharacter = MutableLiveData<NarutoModel?>()
    private val _characterDetails = MutableLiveData<CharacterDetailsModel?>()

    val allCharacter: LiveData<NarutoModel?>
        get() =
            _allCharacter

    val characterDetails: LiveData<CharacterDetailsModel?>
        get() =
            _characterDetails

    private val repository = NarutoRepository()

    fun getCharacter() {
        viewModelScope.launch {
            val resultData = repository.getCharacter()
            if (resultData.isSuccessful)
                _allCharacter.value = resultData.body()
        }
    }

    fun getCharacterId(id: Int) {
        viewModelScope.launch {
            val resultData = repository.getCharacterDetails(id)
            if (resultData.isSuccessful){
                _characterDetails.value = resultData.body()
            }
        }
    }
}