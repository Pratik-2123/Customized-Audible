package com.example.Audible.Screen

import androidx.annotation.DrawableRes
import com.example.audibleclone.R


sealed class Screen (val title: String, val route : String) {
    sealed class BottomScreen(val btitle : String, val broute: String, @DrawableRes val icon : Int) : Screen(btitle,broute) {
        object Home : BottomScreen(
            "Home",
            "home",
            R.drawable.home
        )
        object Library : BottomScreen(
            "Library",
            "library",
            R.drawable.library
        )
        object Discover : BottomScreen(
            "Discover",
            "discover",
            R.drawable.discover
        )
        object Profile : BottomScreen(
            "Profile",
            "profile",
            R.drawable.profile
        )
    }
    sealed class otherScreens(val dtitle: String, val droute: String) : Screen(dtitle,droute) {
        object Settings : otherScreens(
            "Settings",
            "settings"
        )
    }
}


val screenInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Library,
    Screen.BottomScreen.Discover,
    Screen.BottomScreen.Profile
)