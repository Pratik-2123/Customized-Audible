package com.example.audibleclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Audible.Screen.LazyHomePage
import com.example.Audible.ViewModel.HomeViewModel
import com.example.audibleclone.ui.theme.AudibleCloneTheme
import com.example.audibleclone.ui.theme.bg
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AudibleCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Modifier.background(bg)
                        val systemUiController = rememberSystemUiController()
                        SideEffect {
                            systemUiController.setStatusBarColor(color = bg) // Replace with color from image
                        }

                        LazyHomePage(viewModel = HomeViewModel())
                    }
                }
            }
        }
    }
}

