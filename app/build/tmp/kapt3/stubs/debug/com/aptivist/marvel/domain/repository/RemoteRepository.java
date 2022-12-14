package com.aptivist.marvel.domain.repository;

import com.aptivist.marvel.core.utils.Resource;
import com.aptivist.marvel.domain.models.Data;
import com.aptivist.marvel.domain.models.DataX;
import com.aptivist.marvel.domain.models.Result;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"}, d2 = {"Lcom/aptivist/marvel/domain/repository/RemoteRepository;", "", "getCharacters", "Lcom/aptivist/marvel/core/utils/Resource;", "", "Lcom/aptivist/marvel/domain/models/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RemoteRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.aptivist.marvel.core.utils.Resource<java.util.List<com.aptivist.marvel.domain.models.Result>>> continuation);
}