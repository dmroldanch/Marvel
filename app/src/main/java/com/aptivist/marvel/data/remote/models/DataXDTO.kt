package com.aptivist.marvel.data.remote.models



data class DataXDTO(
    val count: Int?,
    val limit: Int?,
    val offset: Int?,
    val results: List<ResultDTO>?,
    val total: Int?
)