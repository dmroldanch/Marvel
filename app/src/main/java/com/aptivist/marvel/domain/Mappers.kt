package com.aptivist.marvel.domain

import com.aptivist.marvel.data.remote.models.*
import com.aptivist.marvel.domain.models.*


fun ResultDTO.toDomain() : Result {

    val comics = this.comics?.toDomain()
    val series = this.series?.toDomain()
    val stories = this.stories?.toDomain()
    val thumbnail = this.thumbnail?.toDomain()
    val urls = this.urls?.map { url ->
        url.toDomain()
    }

    return  Result(
        comics,
        this.description,
        this.id,
        this.modified,
        this.name,
        this.resourceURI,
        series,
        stories,
        thumbnail,
        urls,
    )
}

fun ComicsDTO.toDomain() : Comics{
    var items = this.items?.map { item ->
        item.toDomain()
    }
    return Comics(this.available,this.collectionURI,items,this.returned)
}

fun SeriesDTO.toDomain() : Series {
    var items = this.items?.map { item ->
        item.toDomain()
    }
    return Series(this.available,this.collectionURI,items,this.returned)
}

fun StoriesDTO.toDomain() : Stories {
    var items = this.items?.map { item ->
        item.toDomain()
    }
    return Stories(this.available,this.collectionURI,items,this.returned)
}

fun ThumbnailDTO.toDomain() : Thumbnail {
    return Thumbnail(this.extension,this.path?.replace("http", "https"))
}

fun UrlDTO.toDomain() : Url {
    return Url(this.type,this.url)
}

fun ItemDTO.toDomain() : Item {
    return Item(this.name,this.resourceURI)
}

fun ItemXXXDTO.toDomain() : ItemXXX {
    return ItemXXX(this.name,this.resourceURI,this.type)
}

