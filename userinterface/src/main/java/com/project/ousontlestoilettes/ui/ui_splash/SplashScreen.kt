package com.project.ousontlestoilettes.ui.ui_splash

import android.content.Context
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ousontlestoilettes.userinterface.R

@Composable
fun SplashScreen(onTimeout:()->Unit){
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(2000)
        onTimeout()
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(LocalContext.current.resources.getColor(R.color.app_color_primary)))){
        Image(painterResource(R.drawable.icon), contentDescription = "icon", modifier = Modifier.align(
            Alignment.Center))

        Image(painterResource(R.drawable.brand_image), contentDescription = "icon", modifier = Modifier.align(
            Alignment.BottomCenter).padding(PaddingValues(start = 0.dp,top = 0.dp, end = 0.dp, bottom =50.dp)))
    }
}


@Preview
@Composable
fun SplashScreenPreview(){
    var context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize().background(Color(context.resources.getColor(R.color.app_color_primary)))){
        Image(painterResource(R.drawable.icon), contentDescription = "icon", modifier = Modifier.align(
            Alignment.Center))

        Image(painterResource(R.drawable.brand_image), contentDescription = "icon", modifier = Modifier.align(
            Alignment.BottomCenter).padding(PaddingValues(start = 0.dp,top = 0.dp, end = 0.dp, bottom =50.dp)))
    }
}