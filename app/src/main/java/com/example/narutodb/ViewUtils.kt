package com.example.narutodb

import android.view.View

object ViewUtils {

    fun View.visible(){
        this.visibility = View.VISIBLE
    }

    fun View.invisible(){
        this.visibility = View.INVISIBLE
    }

    fun View.gone(){
        this.visibility = View.GONE
    }
}