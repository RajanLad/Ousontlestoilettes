package com.project.ousontlestoilettes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.project.ousontlestoilettes.navigation.screen.*

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Graphs.HOME.route){
//        splashNavGraph(navController)
        homeNavGraph(navController)
    }
}