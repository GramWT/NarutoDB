package com.example.narutodb

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class NarutoViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NarutoViewModel::class.java)) {
            return NarutoViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


