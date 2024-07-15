package com.example.narutodb

import com.google.gson.annotations.SerializedName

data class NarutoModel(

	@field:SerializedName("totalCharacters")
	val totalCharacters: Int? = null,

	@field:SerializedName("characters")
	val characters: List<CharactersItem?>? = null,

	@field:SerializedName("pageSize")
	val pageSize: Int? = null,

	@field:SerializedName("currentPage")
	val currentPage: Int? = null
)

data class Rank(

	@field:SerializedName("ninjaRank")
	val ninjaRank: NinjaRank? = null,

	@field:SerializedName("ninjaRegistration")
	val ninjaRegistration: String? = null
)

data class CharactersItem(

	@field:SerializedName("debut")
	val debut: Debut? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("voiceActors")
	val voiceActors: VoiceActors? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("personal")
	val personal: Personal? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("family")
	val family: Family? = null,

	@field:SerializedName("rank")
	val rank: Rank? = null,

	@field:SerializedName("tools")
	val tools: List<String?>? = null,

	@field:SerializedName("jutsu")
	val jutsu: List<String?>? = null,

	@field:SerializedName("natureType")
	val natureType: List<String?>? = null,

	@field:SerializedName("uniqueTraits")
	val uniqueTraits: List<String?>? = null
)

data class Debut(

	@field:SerializedName("game")
	val game: String? = null,

	@field:SerializedName("appearsIn")
	val appearsIn: String? = null,

	@field:SerializedName("manga")
	val manga: String? = null,

	@field:SerializedName("anime")
	val anime: String? = null,

	@field:SerializedName("movie")
	val movie: String? = null,

	@field:SerializedName("ova")
	val ova: String? = null,

	@field:SerializedName("novel")
	val novel: String? = null
)

data class Weight(

	@field:SerializedName("Part II")
	val partII: String? = null,

	@field:SerializedName("Part I")
	val partI: String? = null
)

data class Height(

	@field:SerializedName("Part II")
	val partII: String? = null,

	@field:SerializedName("Part I")
	val partI: String? = null,

	@field:SerializedName("Blank Period")
	val blankPeriod: String? = null,

	@field:SerializedName("Gaiden")
	val gaiden: String? = null
)

data class Family(

	@field:SerializedName("husband")
	val husband: String? = null,

	@field:SerializedName("brother")
	val brother: String? = null,

	@field:SerializedName("father")
	val father: String? = null,

	@field:SerializedName("adoptive father")
	val adoptiveFather: String? = null,

	@field:SerializedName("adoptive brother")
	val adoptiveBrother: String? = null,

	@field:SerializedName("son")
	val son: String? = null,

	@field:SerializedName("adoptive son")
	val adoptiveSon: String? = null,

	@field:SerializedName("cousin")
	val cousin: String? = null,

	@field:SerializedName("nephew")
	val nephew: String? = null,

	@field:SerializedName("depowered form")
	val depoweredForm: String? = null,

	@field:SerializedName("incarnation with the god tree")
	val incarnationWithTheGodTree: String? = null
)

data class Age(

	@field:SerializedName("Part I")
	val partI: String? = null,

	@field:SerializedName("Part II")
	val partII: String? = null,

	@field:SerializedName("Boruto Manga")
	val borutoManga: String? = null,

	@field:SerializedName("Academy Graduate")
	val academyGraduate: String? = null,

	@field:SerializedName("Chunin Promotion")
	val chuninPromotion: String? = null
)

data class NinjaRank(

	@field:SerializedName("Part II")
	val partII: String? = null,

	@field:SerializedName("Part I")
	val partI: String? = null,

	@field:SerializedName("Boruto Manga")
	val borutoManga: String? = null
)

data class VoiceActors(

	@field:SerializedName("japanese")
	val japanese: String? = null,

	@field:SerializedName("english")
	val english: String? = null
)

data class Personal(

	@field:SerializedName("affiliation")
	val affiliation: String? = null,

	@field:SerializedName("sex")
	val sex: String? = null,

	@field:SerializedName("titles")
	val titles: List<String?>? = null,

	@field:SerializedName("age")
	val age: Age? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("kekkeiGenkai")
	val kekkeiGenkai: String? = null,

	@field:SerializedName("clan")
	val clan: String? = null,

	@field:SerializedName("team")
	val team: String? = null,

	@field:SerializedName("birthdate")
	val birthdate: String? = null,

	@field:SerializedName("partner")
	val partner: String? = null,

	@field:SerializedName("weight")
	val weight: Weight? = null,

	@field:SerializedName("bloodType")
	val bloodType: String? = null,

	@field:SerializedName("height")
	val height: Height? = null,

	@field:SerializedName("occupation")
	val occupation: String? = null,

	@field:SerializedName("jinchūriki")
	val jinchRiki: List<String?>? = null,

	@field:SerializedName("classification")
	val classification: String? = null,

	@field:SerializedName("species")
	val species: String? = null
)
