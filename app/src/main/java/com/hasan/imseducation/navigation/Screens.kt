package com.hasan.imseducation.navigation

sealed class Screens(val route:String) {

    data object Home : Screens("Home")
    data object Chat : Screens("Chat")
    data object Saved : Screens("Saved")
    data object SplashScreen : Screens("Splash")
    data object Test : Screens("Test")
    data object Profile : Screens("Profile")
    data object ChatScreen: Screens("ChatScreen")
}