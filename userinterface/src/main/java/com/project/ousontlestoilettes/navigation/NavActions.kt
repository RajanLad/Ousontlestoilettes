package com.project.ousontlestoilettes.navigation

import androidx.navigation.NavController

fun NavController.navigateToSplash(){
    this.navigate(Destination.Splash.route)
}

fun NavController.navigateToHome() {
    this.navigate(Destination.Home.route)
}