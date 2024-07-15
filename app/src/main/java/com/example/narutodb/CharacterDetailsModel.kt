package com.example.narutodb

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class CharacterDetailsModel(

	@field:SerializedName("debut")
	val debut: Debut? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("jutsu")
	val jutsu: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("personal")
	val personal: Personal? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("natureType")
	val natureType: List<String?>? = null,

	@field:SerializedName("tools")
	val tools: List<String?>? = null
)


