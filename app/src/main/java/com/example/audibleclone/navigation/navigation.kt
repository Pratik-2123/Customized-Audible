package com.example.Audible.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.Audible.Screen.LazyDiscoverScreen
import com.example.Audible.Screen.LazyProfileScreen
import com.example.Audible.Screen.LazySettingScreen
import com.example.Audible.Screen.LibraryScreen
import com.example.Audible.Screen.Screen
import com.example.Audible.ViewModel.HomeViewModel
import com.example.Audible.Screen.ScrollHome

@Composable
fun Navigation(navController: NavController, viewModel: HomeViewModel) {
    NavHost(navController = navController as NavHostController, startDestination = Screen.BottomScreen.Home.broute)   {
        composable(Screen.BottomScreen.Home.broute){
            ScrollHome()
        }

        composable(Screen.BottomScreen.Library.broute) {
            LibraryScreen(navController)
        }

        composable(Screen.BottomScreen.Discover.broute) {
            LazyDiscoverScreen()
        }

        composable(Screen.BottomScreen.Profile.broute) {
            LazyProfileScreen(navController)
        }

        composable(Screen.otherScreens.Settings.droute) {
            LazySettingScreen(controller = navController)
        }
    }
}