package com.aptivist.marvel.data.remote.models

data class ComicsDTO(
    val available: Int?,
    val collectionURI: String?,
    val items: List<ItemDTO>?,
    val returned: Int?
)