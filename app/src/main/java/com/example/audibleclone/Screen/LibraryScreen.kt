package com.example.Audible.Screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.audibleclone.ui.theme.text

@Composable
fun LibraryScreen(controller: NavHostController) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ){
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.White, modifier = Modifier
                .padding(end = 8.dp, top = 10.dp)
                .size(28.dp))
        }

        ChipSection1()
        ChipSection2()

        Spacer(modifier = Modifier.height(180.dp))

        Text(
            text = "Your Library Looks Empty",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "When you purchase audiobooks on Amazon",
            color = text,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "or Audible. they'll be added here.",
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterHorizontally),
            color = text,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(36.dp))

        OutlinedButton(onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(24.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            Text(text = "Browse the full Audible catalog", fontWeight = FontWeight.SemiBold, color = Color.White, modifier = Modifier.clickable { controller.navigate(Screen.BottomScreen.Discover.broute) })
        }

    }
}

@Composable
fun ChipSection1() {
    val content = listOf("All", "Audiobooks", "Podcasts", "Wish List", "Collections", "Authors", "Series", "Genres")
    LazyRow{
        items(content.size) {
            Text(text = content[it], modifier = Modifier.padding(start = 16.dp, top = 10.dp), fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
        }
    }    
}

@Composable
fun ChipSection2() {
    val content = listOf("All Titles", "Not Started", "In Progress", "Downloaded", "Finished")
    LazyRow{
        items(content.size) {
            OutlinedButton(onClick = {},
                modifier = Modifier.padding(start = 16.dp, top = 10.dp), 
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = content[it],fontSize = 16.sp, fontWeight = FontWeight.Medium, color = Color.White)
            }
        }
    }
}