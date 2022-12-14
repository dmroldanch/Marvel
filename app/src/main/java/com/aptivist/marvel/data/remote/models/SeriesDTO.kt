package com.aptivist.marvel.data.remote.models


data class SeriesDTO(
    val available: Int?,
    val collectionURI: String?,
    val items: List<ItemDTO>?,
    val returned: Int?
)