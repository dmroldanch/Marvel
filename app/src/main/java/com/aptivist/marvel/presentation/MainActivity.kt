package com.aptivist.marvel.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.aptivist.marvel.domain.models.Result
import com.aptivist.marvel.presentation.ui.theme.MarvelTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyList()
                }
            }
        }
    }
}



@Composable
fun MyList( mainViewModel: MainViewModel  =  hiltViewModel()) {

    mainViewModel?.let{
        it.getCharacters()
    }

    val charactersList = mainViewModel.charactersList

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(charactersList) { character ->
            MyCard(character)
        }
    }
}

@Composable
fun MyCard(character : Result) {

    val imageUrl : String = character.thumbnail?.path +"."+ character.thumbnail?.extension
    val newImageURL = imageUrl.replace("http","https")

    Card(shape = RoundedCornerShape(8.dp)) {
        Image(
            painter = rememberAsyncImagePainter(newImageURL),
            contentDescription = null,
            modifier = Modifier.size(128.dp),
            contentScale = ContentScale.Crop,
        )
    }
    /*Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 20.dp,
        modifier = Modifier
            .size(size = 300.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color.Cyan,
                        Color.Magenta
                    )
                )
            )
    ) {

        Text(
            character.name.toString(),
            modifier = Modifier
                .size(size = 300.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.Black,
                            Color.Gray
                        )
                    )
                ),
        )
    }*/
}

