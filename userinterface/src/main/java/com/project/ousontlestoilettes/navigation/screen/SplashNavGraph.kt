package com.project.ousontlestoilettes.navigation.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.project.ousontlestoilettes.navigation.Destination
import com.project.ousontlestoilettes.navigation.Graphs
import com.project.ousontlestoilettes.ui.ui_splash.SplashScreen


fun NavGraphBuilder.splashNavGraph(navController: NavController) {
    navigation(
        startDestination = Destination.Splash.route,
        route = Graphs.SPLASH.route
    ) {
        composable(Destination.Splash.route) {
            SplashScreen(onTimeout = {
                // Navigate to Home after splash timeout
                navController.navigate(Destination.Home.route) {
                    popUpTo(Destination.Splash.route) { inclusive = true }
                }
            })
        }
    }


        //fun NavGraphBuilder.homeNavGraph(navController: NavController) {
        //    navigation(
        //        startDestination = Destination.Home.route,
        //        route = "home_graph"
        //    ) {
        //        composable(Destination.Home.route) {
        //            HomeScreen(
        //                viewModel = hiltViewModel(),
        //                onDetailClick = { navController.navigateToHomeDetail() },
        //                onProfileClick = { navController.navigateToProfile() }
        //            )
        //        }
        //        composable(Destination.HomeDetail.route) {
        //            HomeDetailScreen(viewModel = hiltViewModel())
        //        }
        //    }
        //}
}