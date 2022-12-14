package com.aptivist.marvel.domain.models

data class Result(
    val comics: Comics? ,
    val description: String? = "",
    val id: Int?,
    val modified: String? = "",
    val name: String? = "",
    val resourceURI: String? = "",
    val series: Series?,
    val stories: Stories? ,
    val thumbnail: Thumbnail?,
    val urls: List<Url>?
){}