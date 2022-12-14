package com.aptivist.marvel.data.remote;

import com.aptivist.marvel.data.remote.models.DataDTO;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\u0006\u00c0\u0006\u0001"}, d2 = {"Lcom/aptivist/marvel/data/remote/IApiMarvel;", "", "getCharacters", "Lretrofit2/Response;", "Lcom/aptivist/marvel/data/remote/models/DataDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IApiMarvel {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters")
    public abstract java.lang.Object getCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.aptivist.marvel.data.remote.models.DataDTO>> continuation);
}