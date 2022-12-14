package com.aptivist.marvel.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.aptivist.marvel.domain.models.Item
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
fun MyList(mainViewModel: MainViewModel = hiltViewModel()) {

    mainViewModel.let {
        it.getCharacters()
    }

    val charactersList = mainViewModel.charactersList

    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(charactersList) { character ->
            Box(
                Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                MyCard(character)
            }

        }
    }
}

@Composable
fun MyCard(character: Result) {

    val imageUrl: String = character.thumbnail?.path + "." + character.thumbnail?.extension
    val newImageURL = imageUrl.replace("http", "https")

    Card(shape = RoundedCornerShape(8.dp)) {

        Column(modifier = Modifier.size(800.dp)) {
            Image(
                painter = rememberAsyncImagePainter(newImageURL),
                contentDescription = null,
                modifier = Modifier.size(400.dp),
                contentScale = ContentScale.Crop,
            )
            Text(text = character.name ?: "" , modifier = Modifier.padding(top = 12.dp, start = 8.dp),fontSize = 30.sp, fontWeight = FontWeight.Bold)

            MyButton()

            Text(text = character.description?.take(100) ?: "" , modifier = Modifier.padding(top = 12.dp, start = 8.dp),fontSize = 15.sp)

            Text(text = "Series" , modifier = Modifier.padding(8.dp),fontSize = 20.sp, fontWeight = FontWeight.Bold)

            MyLazyRowSeries(character.series?.items ?: emptyList())

            Text(text = "Comics" , modifier = Modifier.padding(8.dp),fontSize = 20.sp, fontWeight = FontWeight.Bold)

            MyLazyRowComics(character.comics?.items ?: emptyList())
        }


    }
}

@Composable
fun MyButton() {
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/")) }

    Button(onClick = { context.startActivity(intent) }) {
        Text(text = "Navigate to Google!")
    }
}


@Composable
fun MyLazyRowComics(comics: List<Item>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        items(items = comics, itemContent = { item ->
            Box(Modifier.padding(8.dp)) {
                Card(shape = RoundedCornerShape(8.dp)) {
                    Column(modifier = Modifier.size(150.dp)) {
                        Text(text = item.name ?: "", modifier = Modifier.padding(8.dp))
                    }
                }
            }
        })
    }
}

@Composable
fun MyLazyRowSeries(series: List<Item>) {
    val list = series
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        items(items = list, itemContent = { item ->
            Box(Modifier.padding(8.dp)) {
                Card(shape = RoundedCornerShape(8.dp)) {
                    Column(modifier = Modifier.size(150.dp)) {
                        Text(text = item.name ?: "", modifier = Modifier.padding(4.dp))
                    }
                }
            }
        })
    }
}




