package com.hasan.imseducation.navigation

sealed class Screens(val route:String) {

    object Home : Screens("home_screen")
}