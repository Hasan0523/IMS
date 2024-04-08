package com.hasan.imseducation.navigation

sealed class Screens(val route:String) {

    object Home : Screens("Home")
    object Chat : Screens("Chat")
    object Saved : Screens("Saved")
    object Test : Screens("Test")
    object Profile : Screens("Profile")
}