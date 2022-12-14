package com.aptivist.marvel.data.remote;

import com.aptivist.marvel.core.utils.Resource;
import com.aptivist.marvel.domain.repository.RemoteRepository;
import javax.inject.Inject;
import com.aptivist.marvel.domain.models.Result;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/aptivist/marvel/data/remote/ApiHelperImp;", "Lcom/aptivist/marvel/domain/repository/RemoteRepository;", "apiService", "Lcom/aptivist/marvel/data/remote/IApiMarvel;", "(Lcom/aptivist/marvel/data/remote/IApiMarvel;)V", "getCharacters", "Lcom/aptivist/marvel/core/utils/Resource;", "", "Lcom/aptivist/marvel/domain/models/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiHelperImp implements com.aptivist.marvel.domain.repository.RemoteRepository {
    private final com.aptivist.marvel.data.remote.IApiMarvel apiService = null;
    
    @javax.inject.Inject()
    public ApiHelperImp(@org.jetbrains.annotations.NotNull()
    com.aptivist.marvel.data.remote.IApiMarvel apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.aptivist.marvel.core.utils.Resource<java.util.List<com.aptivist.marvel.domain.models.Result>>> continuation) {
        return null;
    }
}