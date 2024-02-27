package com.example.Audible.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.Audible.ViewModel.HomeViewModel
import com.example.Audible.navigation.Navigation
import com.example.audibleclone.ui.theme.bg
import com.example.audibleclone.ui.theme.bottomIcon
import com.example.audibleclone.ui.theme.text


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazyHomePage(viewModel: HomeViewModel) {
    val currentScreen = remember{viewModel.currentScreen.value}

    val controller : NavController = rememberNavController()
    val navBackStackEntry by controller.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val bottombar: @Composable () -> Unit = {
        if(currentScreen == Screen.BottomScreen.Home) {
            BottomNavigation(modifier = Modifier.wrapContentSize(), backgroundColor = bg) {
                screenInBottom.forEach { item->
                    val isSelected = currentRoute == item.broute
                    val tint = if(isSelected) Color.White else bottomIcon
                    BottomNavigationItem(
                        selected = currentRoute == item.broute,
                        onClick = {
                            controller.navigate(item.broute)
                        },
                        icon = {
                            Icon(contentDescription = item.btitle, painter = painterResource(id = item.icon), tint = tint)
                        },
                        label = { Text(text = item.btitle, color = tint)},
                        selectedContentColor = Color.White,
                        unselectedContentColor = text
                    )
                }
            }
        }
    }

    Scaffold (
        containerColor = bg,
        bottomBar = bottombar
    ){
        Navigation(navController = controller, viewModel = viewModel)
    }
}

@Composable
fun ScrollHome() {
    LazyColumn{
        item {
            HomePage()
        }
    }
}