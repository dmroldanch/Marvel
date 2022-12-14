package com.aptivist.marvel.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u008c\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0007H\u00d6\u0001J\t\u00107\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u00068"}, d2 = {"Lcom/aptivist/marvel/domain/models/Result;", "", "comics", "Lcom/aptivist/marvel/domain/models/Comics;", "description", "", "id", "", "modified", "name", "resourceURI", "series", "Lcom/aptivist/marvel/domain/models/Series;", "stories", "Lcom/aptivist/marvel/domain/models/Stories;", "thumbnail", "Lcom/aptivist/marvel/domain/models/Thumbnail;", "urls", "", "Lcom/aptivist/marvel/domain/models/Url;", "(Lcom/aptivist/marvel/domain/models/Comics;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/aptivist/marvel/domain/models/Series;Lcom/aptivist/marvel/domain/models/Stories;Lcom/aptivist/marvel/domain/models/Thumbnail;Ljava/util/List;)V", "getComics", "()Lcom/aptivist/marvel/domain/models/Comics;", "getDescription", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getModified", "getName", "getResourceURI", "getSeries", "()Lcom/aptivist/marvel/domain/models/Series;", "getStories", "()Lcom/aptivist/marvel/domain/models/Stories;", "getThumbnail", "()Lcom/aptivist/marvel/domain/models/Thumbnail;", "getUrls", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/aptivist/marvel/domain/models/Comics;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/aptivist/marvel/domain/models/Series;Lcom/aptivist/marvel/domain/models/Stories;Lcom/aptivist/marvel/domain/models/Thumbnail;Ljava/util/List;)Lcom/aptivist/marvel/domain/models/Result;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.Nullable()
    private final com.aptivist.marvel.domain.models.Comics comics = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String modified = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceURI = null;
    @org.jetbrains.annotations.Nullable()
    private final com.aptivist.marvel.domain.models.Series series = null;
    @org.jetbrains.annotations.Nullable()
    private final com.aptivist.marvel.domain.models.Stories stories = null;
    @org.jetbrains.annotations.Nullable()
    private final com.aptivist.marvel.domain.models.Thumbnail thumbnail = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.aptivist.marvel.domain.models.Url> urls = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.aptivist.marvel.domain.models.Result copy(@org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Comics comics, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String resourceURI, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Series series, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Stories stories, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Thumbnail thumbnail, @org.jetbrains.annotations.Nullable()
    java.util.List<com.aptivist.marvel.domain.models.Url> urls) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Result(@org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Comics comics, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String modified, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String resourceURI, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Series series, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Stories stories, @org.jetbrains.annotations.Nullable()
    com.aptivist.marvel.domain.models.Thumbnail thumbnail, @org.jetbrains.annotations.Nullable()
    java.util.List<com.aptivist.marvel.domain.models.Url> urls) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Comics component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Comics getComics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceURI() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Series component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Series getSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Stories component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Stories getStories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Thumbnail component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aptivist.marvel.domain.models.Thumbnail getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aptivist.marvel.domain.models.Url> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aptivist.marvel.domain.models.Url> getUrls() {
        return null;
    }
}