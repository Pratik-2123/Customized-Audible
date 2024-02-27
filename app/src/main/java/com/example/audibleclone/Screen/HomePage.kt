package com.example.Audible.Screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.audibleclone.R
import com.example.audibleclone.ui.theme.text


@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = painterResource(id = R.drawable.audible_logo), contentDescription = "audible logo", modifier = Modifier.padding(start = 8.dp, top = 10.dp))
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.White, modifier = Modifier
                .padding(end = 8.dp, top = 10.dp)
                .size(28.dp))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            val name = "Pratik"
            Text(
                text = "Good Morning, ${name}!",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 24.sp
            )
        }

        Image(painter = painterResource(id = R.drawable.main_img), contentDescription = "main img")

        Row (
            modifier = Modifier.padding(8.dp)
        ){
            Column {
                Text(text = "Top Free Audiobooks", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = "Listen for free, no membership required", fontWeight = FontWeight.Normal, color = Color.White, fontSize = 15.sp)
            }
        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(freeaudio.size) {
                freeAudioBooks(views = freeaudio[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        Spacer(modifier = Modifier.padding(30.dp))
        Text(text = "Trending Free Podcasts",fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(text = "Listen for free, no membership  required", fontWeight = FontWeight.Normal, color = Color.White, fontSize = 15.sp)

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(freepodcast.size) {
                freeAudioBooks(views = freepodcast[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        //External for Extra

        Spacer(modifier = Modifier.padding(30.dp))
        Text(text = "Top Free Audiobooks", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(text = "Listen for free, no membership required", fontWeight = FontWeight.Normal, color = Color.White, fontSize = 15.sp)

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(freeaudio.size) {
                freeAudioBooks(views = freeaudio[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        Spacer(modifier = Modifier.padding(30.dp))
        Text(text = "Trending Free Podcasts",fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(text = "Listen for free, no membership  required", fontWeight = FontWeight.Normal, color = Color.White, fontSize = 15.sp)

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(freepodcast.size) {
                freeAudioBooks(views = freepodcast[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        Spacer(modifier = Modifier.height(60.dp))
        
    }
}

val freeaudio = listOf(
    views(
        R.drawable.square_img,
        "The Guy Next Door",
        "By Nylla C",
        "https://www.audible.in/pd/The-Guy-Next-Door-Hindi-Edition-Audiobook/B0CQ2YDNYH"
    ),
    views(
        R.drawable.square_img1,
        "Apartment 239",
        "By Efford Alley",
        "https://www.audible.in/pd/Apartment-239-Hindi-Edition-Audiobook/B0CPMF1FK5?eac_link=rt44ORdpJmtX&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0CPMF1FK5&qid=qQqRVdTFqv&eac_id=262-8837439-7486201_qQqRVdTFqv&sr=1-1"
    ),
    views(
        R.drawable.square_img2,
        "He Felt like a Storm",
        "By AnkSun",
        "https://www.audible.in/pd/He-Felt-Like-a-Storm-Hindi-Edition-Audiobook/B0CPMD5WWL?eac_link=FTgwmJ0pES3u&ref=web_search_eac_asin_3&eac_selected_type=asin&eac_selected=B0CPMD5WWL&qid=xOg5DgERDK&eac_id=262-8837439-7486201_xOg5DgERDK&sr=1-3"
    ),
    views(
        R.drawable.square_img3,
        "The Hoddie Girl",
        "By Yuen Wright",
        "https://www.audible.in/pd/The-Hoodie-Girl-Hindi-Edition-Audiobook/B0CPMD7LHW?eac_link=la3VBPndaEIB&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0CPMD7LHW&qid=iaqIDeAY6Q&eac_id=262-8837439-7486201_iaqIDeAY6Q&sr=1-1"
    )
)
val freepodcast = listOf(
    views(
        R.drawable.podcast1,
        "ELECTRONYK ",
        "By DJ NYK",
        "https://www.audible.in/pd/ELECTRONYK-PODCAST-Podcast/B08K5HG8D5?eac_link=e3mLS8q4fRUa&ref=web_search_eac_asin_2&eac_selected_type=asin&eac_selected=B08K5HG8D5&qid=4xz61h6BVm&eac_id=262-8837439-7486201_4xz61h6BVm&sr=1-2"
    ),
    views(
        R.drawable.podcast2,
        "The Morning Brief",
        "By The Economic Times",
        "https://www.audible.in/podcast/The-Morning-Brief/B08JKN76SH?eac_link=TSy0VYRClXVR&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B08JKN76SH&qid=WL3101oBMK&eac_id=262-8837439-7486201_WL3101oBMK&sr=1-1"
    ),
    views(
        R.drawable.podcast3,
        "The Internet Said So",
        "By Varun Thakur",
        "https://www.audible.in/search?keywords=The+internet+said+so&k=The+internet+said+so"
    ),
    views(
        R.drawable.podcast4,
        "RJ Balaji - Cross Talk",
        "By RJ Balaji",
        "https://www.audible.in/podcast/RJ-Balaji-Cross-Talk/B0B85YNYZF?eac_link=WcSCqqiQLFqs&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0B85YNYZF&qid=QVGrE50FUg&eac_id=262-8837439-7486201_QVGrE50FUg&sr=1-1"
    )
)


@Composable
fun freeAudioBooks(views: views) {
    Column() {
        val uriHandler = LocalUriHandler.current
        Image(painter = painterResource(id = views.icon), contentDescription = "", modifier = Modifier.size(160.dp).clickable { uriHandler.openUri(views.link) })
        Text(text = views.title, fontWeight = FontWeight.SemiBold, color = Color.White, modifier = Modifier.clickable { uriHandler.openUri(views.link) })
        Text(text = views.desc, color = text, fontSize = 13.sp,modifier = Modifier.clickable { uriHandler.openUri(views.link) })
    }
}

data class views(
    @DrawableRes val icon: Int,
    val title: String,
    val desc: String,
    val link: String
)