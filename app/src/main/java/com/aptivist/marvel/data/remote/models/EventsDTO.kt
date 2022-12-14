package com.aptivist.marvel.data.remote.models

data class EventsDTO(
    val available: Int?,
    val collectionURI: String?,
    val items: List<ItemDTO>?,
    val returned: Int?

)