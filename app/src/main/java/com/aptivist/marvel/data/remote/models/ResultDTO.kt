package com.aptivist.marvel.data.remote.models

data class ResultDTO(
    val comics: ComicsDTO?,
    val description: String?,
    val events: EventsDTO?,
    val id: Int?,
    val modified: String?,
    val name: String?,
    val resourceURI: String?,
    val series: SeriesDTO?,
    val stories: StoriesDTO?,
    val thumbnail: ThumbnailDTO?,
    val urls: List<UrlDTO>?
)