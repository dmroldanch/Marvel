package com.aptivist.marvel.presentation

import android.content.Intent
import android.net.Uri
import android.opengl.Visibility
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.aptivist.challengeapis.R
import com.aptivist.marvel.domain.models.Item
import com.aptivist.marvel.domain.models.Result
import com.aptivist.marvel.presentation.ui.theme.MarvelTheme
import com.google.accompanist.pager.*
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalPagerApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelTheme {
                val vm: MainViewModel = viewModel()
                val list = remember { vm.charactersList }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.DarkGray
                ) {
                    //MyList()
                    ViewPagerSlider(list)
                }
            }
        }
    }
}

@Composable
fun MyButton(url: String) {
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(url)) }

    Button(modifier = Modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        onClick = { context.startActivity(intent) }) {
        Text(text = "Details", color = Color.Black)
    }
}

@Composable
fun MyLazyRowComics(comics: List<Item>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        items(items = comics, itemContent = { item ->
            Box(Modifier.padding(8.dp)) {
                Column(modifier = Modifier
                    .size(150.dp)) {
                    Text(
                        text = item.name?.take(25) ?: "",
                        color = Color.White,
                        modifier = Modifier.padding(.5.dp))
                }
            }
        })
    }
}

@Composable
fun MyLazyRowSeries(series: List<Item>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        items(items = series, itemContent = { item ->
            Box(Modifier.padding(8.dp)) {
                Column(modifier = Modifier
                    .size(150.dp)) {
                    Text(
                        text = item.name?.take(25) ?: "",
                        color = Color.White,
                        modifier = Modifier.padding(1.dp)
                    )
                }
            }
        })
    }
}

@ExperimentalPagerApi
@Composable
fun ViewPagerSlider(list: List<Result>){

    val pagerState  = rememberPagerState(
        pageCount = list.size,
        initialPage =  0
    )

    val itemSelected = remember { mutableStateOf(0) }

    val gradient = Brush.verticalGradient(
        colors = listOf(Color.Transparent, MaterialTheme.colors.primary),
    )

//    LaunchedEffect(Unit){
//        while (true){
//            yield()
//            delay(2000)
//            pagerState.animateScrollToPage(
//                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
//                animationSpec = tween(600)
//            )
//        }
//    }

    Column(modifier = Modifier.fillMaxSize()) {

        Spacer(modifier = Modifier.height(10.dp))
        HorizontalPager(state = pagerState,
            modifier = Modifier
                .weight(1f)
                .padding(0.dp, 30.dp, 0.dp, 30.dp)
        ) { page ->

            val character = list[page]

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp, 0.dp, 15.dp, 0.dp),
                shape = RoundedCornerShape(20.dp)
            ) {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .align(Alignment.Center)
                ) {
                    Image(
                        painter = rememberAsyncImagePainter("${character.thumbnail?.path}.${character.thumbnail?.extension}"),
                        contentDescription = character.name,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                    )
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(gradient)
                        .padding(10.dp)
                    ) {
                        Text(
                            text = character.name ?: "" ,
                            modifier = Modifier.padding(top = 12.dp, start = 8.dp),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.primary
                        )
                        character.urls?.last()?.url?.let { MyButton(it) }
                    }
                    Column(modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(15.dp)) {

                        Text(text = character.description?.take(100) ?: "" ,
                            modifier = Modifier.padding(top = 12.dp, start = 8.dp),
                            fontSize = 15.sp,
                            color = Color.White)

                        if (character.comics?.items?.size != 0){
                            MyRow(onClickComics = { itemSelected.value = 2 },
                                onClickSeries = { itemSelected.value = 1 })
                        } else {
                            NotFound()
                        }

                        if(itemSelected.value == 1) {
                            MyLazyRowSeries(character.series?.items ?: emptyList())
                        } else {
                            MyLazyRowComics(character.comics?.items ?: emptyList())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MyRow(modifier: Modifier = Modifier, onClickSeries : () -> Unit, onClickComics : () -> Unit){

    Row(modifier = modifier
        .fillMaxWidth()
        .padding(top = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .border(BorderStroke(0.5.dp, Color.White))
                .clickable { onClickSeries.invoke() },
            contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = R.string.tab_serie) ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Left)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .border(BorderStroke(0.5.dp, Color.White))
                .clickable { onClickComics.invoke() },
            contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = R.string.tab_comic) ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Right)
        }
    }
}

@Composable
fun NotFound(){

//    var value by remember { mutableStateOf( 1) }
//    value = (1..2).random()
//
//    val imgRes =
//        when(value) {
//            1 -> "https://media0.giphy.com/media/m8wQSPsbDIbeU8hQLL/giphy.gif?cid=6c09b952917f3a8bfacd0cc1ba510e75f2e742f0d053c1f3&rid=giphy.gif&ct=s"
//            2 -> "https://thumbs.gfycat.com/TeemingDesertedIbizanhound-max-1mb.gif"
//            3 -> ""
//            4 -> ""
//            5 -> ""
//            6 -> ""
//            else -> "https://thumbs.gfycat.com/TeemingDesertedIbizanhound-max-1mb.gif"
//        }

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.anime),
            contentDescription = stringResource(id = R.string.not_found),
            modifier = Modifier
                .width(350.dp)
                .height(250.dp),
            contentScale = ContentScale.Crop
        )

        Text(text = stringResource(id = R.string.not_found) ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp),
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center)
    }
}




