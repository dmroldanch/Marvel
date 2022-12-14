package com.aptivist.marvel.data.remote.models

data class DataDTO(
    val attributionHTML: String? = "",
    val attributionText: String? = "",
    val code: Int? = 0,
    val copyright: String? = "",
    val `data`: DataXDTO?,
    val etag: String? = "",
    val status: String? = ""
)