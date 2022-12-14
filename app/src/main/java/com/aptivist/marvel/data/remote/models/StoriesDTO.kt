package com.aptivist.marvel.data.remote.models



data class StoriesDTO(
    val available: Int?,
    val collectionURI: String?,
    val items: List<ItemXXXDTO>?,
    val returned: Int?
)