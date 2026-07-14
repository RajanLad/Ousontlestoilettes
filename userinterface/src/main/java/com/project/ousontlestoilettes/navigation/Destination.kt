package com.project.ousontlestoilettes.navigation

sealed class Destination(val route:String) {
    object Splash: Destination("splash")
    object Home: Destination("home")
}

enum class Graphs(var route: String) {
    SPLASH("splash_graph"),
    HOME("home_graph"),
//    PROFILE("profile/{userId}"),
//    SETTINGS("settings");

    //
//    fun createRoute(vararg args: String): String {
//        var finalRoute = route
//        args.forEach { arg ->
//            finalRoute = finalRoute.replaceFirst("{${arg}}", arg)
//        }
//        return finalRoute
//    }
}