package com.aptivist.marvel.core.di;

import com.aptivist.marvel.data.remote.ApiHelperImp;
import com.aptivist.marvel.domain.repository.RemoteRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/aptivist/marvel/core/di/RepositoryModule;", "", "()V", "bindRepositoryMarvel", "Lcom/aptivist/marvel/domain/repository/RemoteRepository;", "apiHelperImp", "Lcom/aptivist/marvel/data/remote/ApiHelperImp;", "app_debug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.aptivist.marvel.domain.repository.RemoteRepository bindRepositoryMarvel(@org.jetbrains.annotations.NotNull()
    com.aptivist.marvel.data.remote.ApiHelperImp apiHelperImp);
}