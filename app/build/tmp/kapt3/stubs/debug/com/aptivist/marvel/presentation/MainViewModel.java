package com.aptivist.marvel.presentation;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.aptivist.marvel.core.utils.Resource;
import com.aptivist.marvel.domain.models.Result;
import com.aptivist.marvel.domain.repository.RemoteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/aptivist/marvel/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/aptivist/marvel/domain/repository/RemoteRepository;", "(Lcom/aptivist/marvel/domain/repository/RemoteRepository;)V", "_charactersList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/aptivist/marvel/domain/models/Result;", "charactersList", "", "getCharactersList", "()Ljava/util/List;", "getCharacters", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.aptivist.marvel.domain.repository.RemoteRepository repository = null;
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.aptivist.marvel.domain.models.Result> _charactersList;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.aptivist.marvel.domain.repository.RemoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.aptivist.marvel.domain.models.Result> getCharactersList() {
        return null;
    }
    
    public final void getCharacters() {
    }
}