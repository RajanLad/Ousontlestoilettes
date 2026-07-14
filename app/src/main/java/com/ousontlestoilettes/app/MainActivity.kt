package com.ousontlestoilettes.app

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

import com.ousontlestoilettes.app.ui.theme.OusontlestoilettesTheme
import com.project.ousontlestoilettes.navigation.NavGraph
import com.project.ousontlestoilettes.ui.ui_home.HomeMapView
import com.project.ousontlestoilettes.ui.ui_home.HomeScreen
import com.project.ousontlestoilettes.ui.ui_splash.SplashScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
//        var splashScreenInit = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val systemUiController  = rememberSystemUiController()
            val darkIcons = true

            SideEffect {
                systemUiController.setStatusBarColor(Color.Transparent)
                systemUiController.setNavigationBarColor(Color.Black)
            }
            NavGraph()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

