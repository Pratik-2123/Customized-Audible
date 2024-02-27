package com.example.Audible.ViewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.Audible.Screen.Screen

class HomeViewModel: ViewModel() {
    private val _currentScreen : MutableState<Screen> = mutableStateOf(Screen.BottomScreen.Home)

    val currentScreen : MutableState<Screen>
        get() = _currentScreen
}