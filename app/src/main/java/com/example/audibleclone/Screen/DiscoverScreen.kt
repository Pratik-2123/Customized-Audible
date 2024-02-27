package com.example.Audible.Screen

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.audibleclone.R

@Composable
fun DiscoverScreen() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = Color.White,
                modifier = Modifier
                    .padding(end = 8.dp, top = 10.dp)
                    .size(28.dp)
            )
        }
        
        Image(painter = painterResource(id = R.drawable.rectangle_img), contentDescription = "", modifier = Modifier.padding(8.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Best Sellers", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 6.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(bestSellers.size) {
                freeAudioBooks(views = bestSellers[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }


        Spacer(modifier = Modifier.padding(16.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "New Releases", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 6.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(newRelease.size) {
                freeAudioBooks(views = newRelease[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "New Releases", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 6.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(bestSellers.size) {
                freeAudioBooks(views = bestSellers[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "New Releases", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 6.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow() {
            items(newRelease.size) {
                freeAudioBooks(views = newRelease[it])
                Spacer(modifier = Modifier.padding(end = 18.dp))
            }
        }





        Spacer(modifier = Modifier.height(60.dp))
    }
}

@Composable
fun LazyDiscoverScreen() {
    LazyColumn{
        item{
            DiscoverScreen()
        }
    }
}





val bestSellers = listOf<views>(
    views(
        R.drawable.bs4,
        "Atomic Habits",
        "By James Clear",
        "https://www.audible.in/pd/Atomic-Habits-Audiobook/B07J1PK5Q7?eac_link=6KZXAT3wQlAD&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B07J1PK5Q7&qid=7UEOGujR1X&eac_id=262-8837439-7486201_7UEOGujR1X&sr=1-1"
    ),
    views(
        R.drawable.bs3,
        "TPOM",
        "By Morgan Housel",
        "https://www.audible.in/pd/The-Psychology-of-Money-Audiobook/B08D9WJCBT?eac_link=IYAVv32zkj2V&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B08D9WJCBT&qid=WwIJS03B3M&eac_id=262-8837439-7486201_WwIJS03B3M&sr=1-1"
    ),
    views(
        R.drawable.bs2,
        "Ikigai",
        "By Hector Garcia",
        "https://www.audible.in/pd/Ikigai-Audiobook/B0759Y4LYM?eac_link=DqWpNL0xmKN4&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0759Y4LYM&qid=EW4hN6kwQa&eac_id=262-8837439-7486201_EW4hN6kwQa&sr=1-1"
    ),
    views(
        R.drawable.bs1,
        "TCTBD",
        "By Fumitake Koga",
        "https://www.audible.in/pd/The-Courage-to-Be-Disliked-Audiobook/B079MH27GN?eac_link=cMyC5r8xyAHB&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B079MH27GN&qid=7LvhIdKWwB&eac_id=262-8837439-7486201_7LvhIdKWwB&sr=1-1"
    )
)
val newRelease = listOf<views>(
    views(
        R.drawable.nr3,
        "Cargo",
        "By Arati Kadav",
        "https://www.audible.in/pd/Cargo-The-End-Is-Just-the-Beginning-Podcast/B0CQN2DXBD?eac_link=vUvYYCkANWq2&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0CQN2DXBD&qid=9J2DbKZnkC&eac_id=262-8837439-7486201_9J2DbKZnkC&sr=1-1"
    ),
    views(
        R.drawable.nr2,
        "The Malabar Rebellion",
        "By Aisaville",
        "https://www.audible.in/pd/The-Malabar-Rebellion-Podcast/B0CP2WY3RH?qid=1709031499&sr=1-1&ref_pageloadid=not_applicable&ref=a_search_c3_lProduct_1_1&pf_rd_p=2d02bc98-4366-4f94-99d9-5e898cda0766&pf_rd_r=5WE3JB1PBFY17EF7D95F&pageLoadId=xp6wgLOlOlekIEPk&creativeId=b2592cc9-1111-40d9-9474-98f67c8075cc"
    ),
    views(
        R.drawable.nr4,
        "Lets talk Mutual Funds",
        "By Monika Halan",
        "https://www.audible.in/pd/Lets-Talk-Mutual-Funds-Audiobook/B0CCSSY1CZ?eac_link=dUGA3Bbg3Syc&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0CCSSY1CZ&qid=5dWVZrWEWB&eac_id=262-8837439-7486201_5dWVZrWEWB&sr=1-1"
    ),
    views(
        R.drawable.nr1,
        "New Borns & new Moms",
        "By Dr.Farah Adam",
        "https://www.audible.in/pd/New-Borns-and-New-Moms-Audiobook/B0BXM7CWML?eac_link=XHtf33PPwOhS&ref=web_search_eac_asin_1&eac_selected_type=asin&eac_selected=B0BXM7CWML&qid=YfSipJ3V3l&eac_id=262-8837439-7486201_YfSipJ3V3l&sr=1-1"
    ),
)