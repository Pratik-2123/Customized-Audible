package com.example.Audible.Screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.audibleclone.ui.theme.text

@Composable
fun SettingScreen(controller: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ){
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "", tint = Color.White,
                modifier = Modifier
                    .padding(top = 3.dp, start = 8.dp)
                    .clickable {
                        controller.navigate(Screen.BottomScreen.Profile.broute)
                    }
            )
            Text(text = "Settings", color = Color.White, modifier = Modifier.padding(start = 16.dp, top = 5.dp))
        }
        Text(
            text = "App Settings",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Data and Storage", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Player", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Theme", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Connect to other Apps", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Alexa", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                .size(26.dp)
                .padding(top = 3.dp))
        }
        Text(
            text = "Notifications",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Push Notifications", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Email Notifications", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                .size(26.dp)
                .padding(top = 3.dp))
        }
        Text(
            text = "Customer Support",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Help and Support", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Delete Account", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                .size(26.dp)
                .padding(top = 3.dp))
        }
        Text(
            text = "Legal",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable { },
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Privacy Notice", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
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
            Text(text = "Terms of Service", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White, modifier = Modifier.padding(8.dp))
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "", tint = Color.White, modifier = Modifier
                .size(26.dp)
                .padding(top = 3.dp))
        }

        Text(
            text = "Additional Notices",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
                .align(Alignment.Start)
        )
        Text(
            text = "Audible Android Application Legal Notices",
            fontWeight = FontWeight.Normal,
            color = text,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.Start)
        )
        Text(
            text = "and Attributions",
            fontWeight = FontWeight.Normal,
            color = text,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedButton(
            onClick = {  },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(12.dp))
        ) {
            Text(text = "Sign Out", color = Color.White)
        }
        Text(text = "Audible 3.69.0 (150016)",color = text, fontSize = 10.sp, modifier = Modifier.padding(4.dp))
        Text(text = "Pratik's 4th Audible for Android",color = text, fontSize = 10.sp, modifier = Modifier.padding(4.dp))
        Text(text = "Account: pratikpatel7057347707@gmail.com",color = text, fontSize = 10.sp, modifier = Modifier.padding(4.dp))
        Text(text = "Marketplace:Audible.in",color = text, fontSize = 10.sp, modifier = Modifier.padding(4.dp))



        Spacer(modifier = Modifier.height(60.dp))
    }
}

@Composable
fun LazySettingScreen(controller: NavHostController) {
    LazyColumn{
        item {
            SettingScreen(controller = controller)
        }
    }
}