package com.aptivist.marvel.domain.models

data class DataX(
    val count: Int?,
    val limit: Int?,
    val offset: Int?,
    val results: List<Result>?,
    val total: Int?
)