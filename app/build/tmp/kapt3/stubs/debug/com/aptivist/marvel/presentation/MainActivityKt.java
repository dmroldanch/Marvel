package com.aptivist.marvel.presentation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.material.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.aptivist.marvel.domain.models.Item;
import com.aptivist.marvel.domain.models.Result;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u001a\u0012\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"MyCard", "", "character", "Lcom/aptivist/marvel/domain/models/Result;", "MyLazyRowComics", "comics", "", "Lcom/aptivist/marvel/domain/models/Item;", "MyLazyRowSeries", "series", "MyList", "mainViewModel", "Lcom/aptivist/marvel/presentation/MainViewModel;", "app_debug"})
public final class MainActivityKt {
    
    @androidx.compose.runtime.Composable()
    public static final void MyList(@org.jetbrains.annotations.NotNull()
    com.aptivist.marvel.presentation.MainViewModel mainViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MyCard(@org.jetbrains.annotations.NotNull()
    com.aptivist.marvel.domain.models.Result character) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MyLazyRowComics(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aptivist.marvel.domain.models.Item> comics) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MyLazyRowSeries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aptivist.marvel.domain.models.Item> series) {
    }
}