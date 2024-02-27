package com.example.Audible.Screen

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.audibleclone.ui.theme.linecolor
import com.example.audibleclone.ui.theme.text


@Composable
fun ProfileScreen(controller: NavHostController) {
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
                imageVector = Icons.Default.Settings,
                contentDescription = "Settings",
                tint = Color.White,
                modifier = Modifier
                    .padding(end = 8.dp, top = 10.dp)
                    .size(28.dp)
                    .clickable {
                        //Navigating to the settings screen
                        controller.navigate(Screen.otherScreens.Settings.droute)
                    }
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null, modifier = Modifier.size(140.dp), tint = Color.White)
            Text(text = "Pratik Patel", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 24.sp)

            Spacer(modifier = Modifier.height(70.dp))

            Row {
                Column (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "                         0                      3", color = Color.White)
                    Text(text = "                     Titles             Badges", color = Color.White)
                }
            }

            Divider(color = linecolor, modifier = Modifier.padding(top = 20.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "View Account", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 6.dp))
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                    .size(26.dp)
                    .padding(top = 3.dp))
            }
            Text(
                text = "You Have 0 Credits",
                color = text,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Achievements", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White, modifier = Modifier
                .align(Alignment.Start)
                .padding(8.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Listening Time", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(top = 6.dp))
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                    .size(26.dp)
                    .padding(top = 3.dp))
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Listening Level", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(top = 6.dp))
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                    .size(26.dp)
                    .padding(top = 3.dp))
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Badge Collection", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(top = 6.dp))
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                    .size(26.dp)
                    .padding(top = 3.dp))
            }


            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Customer Support", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White, modifier = Modifier
                .align(Alignment.Start)
                .padding(8.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Help and Support", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(top = 6.dp))
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                    .size(26.dp)
                    .padding(top = 3.dp))
            }


            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}

@Composable
fun LazyProfileScreen(controller: NavHostController) {
    LazyColumn{
        item {
            ProfileScreen(controller)
        }
    }
}