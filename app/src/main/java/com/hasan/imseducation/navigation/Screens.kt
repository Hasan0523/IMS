package com.hasan.imseducation.navigation

sealed class Screens(val route: String) {
    data object SplashScreen : Screens("Splash")

    data object SignUp : Screens("SignUp")
    data object Login : Screens("Login")
    data object Home : Screens("Home")

    data object Chat : Screens("Chat")
    data object ChatScreen : Screens("ChatScreen")
    data object Saved : Screens("Saved")

    data object Test : Screens("Test")
    data object TestFun : Screens("TestFun/{id}")
    data object TestQues : Screens("TestQues/{id}")
    data object Profile : Screens("Profile")
    data object Menu : Screens("Menu")


}