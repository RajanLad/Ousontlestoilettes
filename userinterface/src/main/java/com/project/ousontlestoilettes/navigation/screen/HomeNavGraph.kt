package com.project.ousontlestoilettes.navigation.screen

import androidx.navigation.*
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.project.ousontlestoilettes.navigation.Destination
import com.project.ousontlestoilettes.ui.ui_home.HomeMapView
import com.project.ousontlestoilettes.ui.ui_home.HomeScreen

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(
        startDestination = Destination.Home.route,
        route = "home_graph"
    ) {
        composable(Destination.Home.route) {
            HomeMapView()
        }
//        composable(Destination.HomeDetail.route) {
//            HomeDetailScreen(viewModel = hiltViewModel())
//        }
    }
}